#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Build a single DOCX from DolphinScheduler Chinese docs under docs/docs/zh.
This script:
1) Reads docs/configs/docsdev.js (Docusaurus-like sidebar definition)
2) Extracts the 'zh-cn' sidemenu order
3) Maps each menu link to a markdown file in docs/docs/zh
4) Rewrites relative image links so they still resolve after concatenation
5) Uses pandoc to generate a DOCX with a table of contents
"""

from __future__ import print_function

import json
import os
import re
import subprocess
import sys


REPO_ROOT = os.path.abspath(os.path.join(os.path.dirname(__file__), ".."))
DOCSDEV_JS = os.path.join(REPO_ROOT, "docs", "configs", "docsdev.js")
ZH_DOCS_ROOT = os.path.join(REPO_ROOT, "docs", "docs", "zh")
OUT_MD = os.path.join(REPO_ROOT, "docs", "docs", "zh", "_merged_all_zh_docs_for_word.md")
OUT_DOCX = os.path.join(REPO_ROOT, "docs", "dolphinscheduler-docs-zh.docx")


def _run(cmd, cwd=None):
    p = subprocess.Popen(cmd, cwd=cwd, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    out, err = p.communicate()
    if p.returncode != 0:
        raise RuntimeError("Command failed: {}\nstdout:\n{}\nstderr:\n{}".format(
            " ".join(cmd), out.decode("utf-8", "ignore"), err.decode("utf-8", "ignore")))
    return out.decode("utf-8", "ignore")


def load_sidebar():
    if not os.path.exists(DOCSDEV_JS):
        raise RuntimeError("Cannot find {}".format(DOCSDEV_JS))

    # docsdev.js is ESM ("export default {...}"). Convert to CJS on the fly and require it.
    with open(DOCSDEV_JS, "r", encoding="utf-8") as f:
        js = f.read()

    # Remove block comments to reduce noise, then convert `export default` to CommonJS.
    js = re.sub(r"/\*.*?\*/", "", js, flags=re.S)
    js = re.sub(r"^\s*export\s+default\s+", "module.exports = ", js, flags=re.M)

    tmp_cjs = os.path.join("/tmp", "dolphinscheduler_docsdev_tmp.cjs")
    with open(tmp_cjs, "w", encoding="utf-8") as f:
        f.write(js)

    node_snippet = (
        "const cfg=require({});"
        "console.log(JSON.stringify(cfg['zh-cn'].sidemenu));"
    ).format(json.dumps(tmp_cjs))

    sidemenu_json = _run(["node", "-e", node_snippet], cwd=REPO_ROOT).strip()
    return json.loads(sidemenu_json)


def flatten_menu(items):
    """
    Returns a list of dicts: {title, link, depthTitles}
    depthTitles is a list of category titles leading to this item (excluding the page title).
    """
    out = []

    def walk(nodes, parents):
        for n in nodes:
            title = n.get("title")
            link = n.get("link")
            children = n.get("children")
            if link:
                out.append({
                    "title": title,
                    "link": link,
                    "parents": list(parents),
                })
            if isinstance(children, list):
                walk(children, parents + ([title] if title else []))

    walk(items, [])
    return out


def link_to_md_path(link):
    # Examples:
    # /zh-cn/docs/3.3.2/user_doc/about/introduction.html  -> docs/docs/zh/about/introduction.md
    # /zh-cn/docs/release/history-versions.html           -> docs/docs/zh/history-versions.md
    m = re.search(r"/user_doc/(.+?)\\.html$", link)
    if m:
        rel = m.group(1) + ".md"
        return os.path.join(ZH_DOCS_ROOT, rel)

    m = re.search(r"/docs/release/(.+?)\\.html$", link)
    if m:
        rel = m.group(1) + ".md"
        return os.path.join(ZH_DOCS_ROOT, rel)

    # Fallback: try last segment
    base = link.rstrip("/").split("/")[-1]
    if base.endswith(".html"):
        base = base[:-5] + ".md"
    return os.path.join(ZH_DOCS_ROOT, base)


# Markdown image: ![alt](path "optional title")
# We only rewrite the `path` part.
IMG_MD_RE = re.compile(r"(!\[[^\]]*\]\()([^\)\s]+)([^\)]*\))")


def rewrite_image_links(md_text, src_file_dir, merged_dir):
    def repl(m):
        prefix, path, suffix = m.group(1), m.group(2), m.group(3)
        # keep remote/data urls as-is
        if path.startswith("http://") or path.startswith("https://") or path.startswith("data:"):
            return m.group(0)
        # keep absolute paths as-is (pandoc can still resolve them)
        if path.startswith("/"):
            return m.group(0)
        abs_path = os.path.normpath(os.path.join(src_file_dir, path))
        rel = os.path.relpath(abs_path, merged_dir)
        # pandoc prefers posix separators in markdown
        rel = rel.replace(os.sep, "/")
        return prefix + rel + suffix

    return IMG_MD_RE.sub(repl, md_text)


def build_merged_markdown(ordered_pages):
    merged_dir = os.path.dirname(OUT_MD)

    parts = []
    parts.append("# Apache DolphinScheduler 中文文档\n")
    parts.append("\n")
    parts.append("> 由仓库 `docs/docs/zh` 自动合并生成，用于导出 Word（DOCX）。\n")
    parts.append("\n")

    used = set()
    for page in ordered_pages:
        md_path = link_to_md_path(page["link"])
        if not os.path.exists(md_path):
            continue
        used.add(os.path.abspath(md_path))
        with open(md_path, "r", encoding="utf-8") as f:
            content = f.read().strip()
        content = rewrite_image_links(content, os.path.dirname(md_path), merged_dir)
        # Add a page break between documents (pandoc respects raw OpenXML only for docx; use HR as a separator)
        parts.append("\n\n---\n\n")
        parts.append(content)
        parts.append("\n")

    # Append unreferenced markdown files (best-effort) so the Word is "complete"
    all_md = []
    for root, _, files in os.walk(ZH_DOCS_ROOT):
        for fn in files:
            if fn.endswith(".md"):
                all_md.append(os.path.abspath(os.path.join(root, fn)))
    remaining = [p for p in sorted(all_md) if p not in used and not os.path.basename(p).startswith("_merged_")]
    if remaining:
        parts.append("\n\n---\n\n")
        parts.append("# 其他未在侧边栏中列出的文档\n\n")
        for p in remaining:
            rel = os.path.relpath(p, ZH_DOCS_ROOT).replace(os.sep, "/")
            with open(p, "r", encoding="utf-8") as f:
                content = f.read().strip()
            content = rewrite_image_links(content, os.path.dirname(p), merged_dir)
            parts.append("\n\n---\n\n")
            parts.append("## {}\n\n".format(rel))
            parts.append(content)
            parts.append("\n")

    with open(OUT_MD, "w", encoding="utf-8") as f:
        f.write("".join(parts))


def build_docx():
    # Use pandoc to generate docx with toc.
    _run([
        "pandoc",
        OUT_MD,
        "--toc",
        "--toc-depth=3",
        "-o",
        OUT_DOCX,
    ], cwd=os.path.dirname(OUT_MD))


def main():
    sidemenu = load_sidebar()
    pages = flatten_menu(sidemenu)
    build_merged_markdown(pages)
    build_docx()
    print("DOCX written to: {}".format(OUT_DOCX))
    print("Merged markdown: {}".format(OUT_MD))


if __name__ == "__main__":
    try:
        main()
    except Exception as e:
        sys.stderr.write(str(e) + "\n")
        sys.exit(1)
