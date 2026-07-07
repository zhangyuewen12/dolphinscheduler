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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class KubernetesUtilsTest {

    @Test
    void isKubernetesModeMatchesConstant() {
        assertEquals(KubernetesUtils.KUBERNETES_MODE, KubernetesUtils.isKubernetesMode());
    }

    @Test
    void isKubernetesModeEvaluatesEnvInFreshClassLoader() throws Exception {
        setEnv("KUBERNETES_SERVICE_HOST", "127.0.0.1");
        setEnv("KUBERNETES_SERVICE_PORT", "6443");

        String classPath = System.getProperty("java.class.path");
        String[] entries = classPath.split(System.getProperty("path.separator"));
        List<URL> urls = new ArrayList<>();
        for (String entry : entries) {
            urls.add(new java.io.File(entry).toURI().toURL());
        }

        try (
                URLClassLoader loader =
                        new ChildFirstClassLoader(urls.toArray(new URL[0]),
                                KubernetesUtilsTest.class.getClassLoader())) {
            Class<?> clazz =
                    Class.forName("org.apache.dolphinscheduler.common.utils.KubernetesUtils", true, loader);
            Object result = clazz.getMethod("isKubernetesMode").invoke(null);
            assertTrue((Boolean) result);
        } finally {
            clearEnv("KUBERNETES_SERVICE_HOST");
            clearEnv("KUBERNETES_SERVICE_PORT");
        }
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static void setEnv(String key, String value) throws Exception {
        Map<String, String> env = System.getenv();
        Class<?> clazz = env.getClass();
        Field m = clazz.getDeclaredField("m");
        m.setAccessible(true);
        ((Map) m.get(env)).put(key, value);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static void clearEnv(String key) throws Exception {
        Map<String, String> env = System.getenv();
        Class<?> clazz = env.getClass();
        Field m = clazz.getDeclaredField("m");
        m.setAccessible(true);
        ((Map) m.get(env)).remove(key);
    }

    private static class ChildFirstClassLoader extends URLClassLoader {

        private ChildFirstClassLoader(URL[] urls, ClassLoader parent) {
            super(urls, parent);
        }

        @Override
        protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
            if ("org.apache.dolphinscheduler.common.utils.KubernetesUtils".equals(name)) {
                Class<?> loaded = findLoadedClass(name);
                if (loaded == null) {
                    loaded = findClass(name);
                }
                if (resolve) {
                    resolveClass(loaded);
                }
                return loaded;
            }
            return super.loadClass(name, resolve);
        }
    }
}
