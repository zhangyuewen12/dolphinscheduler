/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.common.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermissions;

import org.junit.jupiter.api.Test;

class FileUtilsExtraTest {

    @Test
    void pathHelpers_returnExpectedValues() {
        String download = FileUtils.getDownloadFilename("test.txt");
        assertTrue(download.endsWith("-test.txt"));

        String upload = FileUtils.getUploadFileLocalTmpAbsolutePath();
        assertNotNull(upload);

        assertEquals(FileUtils.DATA_BASEDIR + "/exec/process/7", FileUtils.getTaskInstanceWorkingDirectory(7));
        assertEquals("/tmp/config", FileUtils.getKubeConfigPath("/tmp"));
        assertEquals("/tmp/appInfo.log", FileUtils.getAppInfoPath("/tmp"));
    }

    @Test
    void directoryTraversal_detectsSeparator() {
        assertTrue(FileUtils.directoryTraversal("../etc/passwd"));
    }

    @Test
    void concatAndChecksumAndCopy() throws Exception {
        String path = FileUtils.concatFilePath("/tmp", "dolphinscheduler", "test.txt");
        assertEquals("/tmp/dolphinscheduler/test.txt", path);

        Path tempFile = Files.createTempFile("ds-file", ".txt");
        Files.write(tempFile, "hello".getBytes(StandardCharsets.UTF_8));
        String checksum = FileUtils.getFileChecksum(tempFile.toString());
        assertNotNull(checksum);

        Path copyTarget = Files.createTempFile("ds-copy", ".txt");
        FileUtils.copyInputStreamToFile(
                new ByteArrayInputStream("copy".getBytes(StandardCharsets.UTF_8)),
                copyTarget.toString());
        assertEquals("copy", new String(Files.readAllBytes(copyTarget), StandardCharsets.UTF_8));
    }

    @Test
    void createFileAndDirectoryWithPermissions() throws Exception {
        Path file = Files.createTempFile("ds-perm", ".txt");
        Files.deleteIfExists(file);
        FileUtils.createFileWith755(file);
        assertTrue(Files.exists(file));

        Path dir = Files.createTempDirectory("ds-dir");
        Path newDir = dir.resolve("child");
        FileUtils.createDirectoryWithPermission(newDir, PosixFilePermissions.fromString("rwxr-xr-x"));
        assertTrue(Files.exists(newDir));
    }

    @Test
    void getClassPathAbsolutePath_returnsPath() {
        String path = FileUtils.getClassPathAbsolutePath(FileUtilsExtraTest.class);
        assertNotNull(path);
        assertTrue(path.contains("target"));
    }

    @Test
    void writeContentAndConcatPathFailures() throws Exception {
        Path parentFile = Files.createTempFile("ds-parent", ".txt");
        String child = parentFile.toString() + "/child.txt";
        assertTrue(parentFile.toFile().exists());
        assertTrue(!FileUtils.writeContent2File("data", child));

        assertThrows(IllegalArgumentException.class, () -> FileUtils.concatFilePath());
        assertThrows(IllegalArgumentException.class, () -> FileUtils.concatFilePath(""));
        assertThrows(IllegalArgumentException.class, () -> FileUtils.concatFilePath("/tmp", ""));
    }

    @Test
    void readFile2StrThrowsOnBrokenStream() {
        InputStream brokenStream = new InputStream() {

            @Override
            public int read() throws IOException {
                throw new IOException("boom");
            }
        };
        assertThrows(RuntimeException.class, () -> FileUtils.readFile2Str(brokenStream));
    }

    @Test
    void writeContentAndTraversalHappyPath() throws Exception {
        Path dir = Files.createTempDirectory("ds-write");
        Path file = dir.resolve("content.txt");
        assertTrue(FileUtils.writeContent2File("hello", file.toString()));
        assertEquals("hello", new String(Files.readAllBytes(file), StandardCharsets.UTF_8));

        assertTrue(!FileUtils.directoryTraversal("simple.txt"));
    }

    @Test
    void setFileTo755HandlesFilesAndDirectories() throws Exception {
        Path dir = Files.createTempDirectory("ds-755");
        Path child = dir.resolve("child.txt");
        Files.write(child, java.util.Arrays.asList("x"), StandardCharsets.UTF_8);

        FileUtils.setFileTo755(child.toFile());
        FileUtils.setFileTo755(dir.toFile());
    }
}
