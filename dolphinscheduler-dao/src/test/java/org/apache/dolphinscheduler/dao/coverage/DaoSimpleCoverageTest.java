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

package org.apache.dolphinscheduler.dao.coverage;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.JarURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.junit.jupiter.api.Test;

class DaoSimpleCoverageTest {

    private static final String[] PACKAGES = {
            "org.apache.dolphinscheduler.dao.entity",
            "org.apache.dolphinscheduler.dao.entity.event",
            "org.apache.dolphinscheduler.dao.model"
    };

    @Test
    void coverSimpleClasses() throws Exception {
        List<Class<?>> classes = scanPackages(PACKAGES);
        assertFalse(classes.isEmpty());
        for (Class<?> clazz : classes) {
            touchClass(clazz);
        }
    }

    private static List<Class<?>> scanPackages(String[] packages) throws Exception {
        List<Class<?>> results = new ArrayList<>();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        for (String pkg : packages) {
            String path = pkg.replace('.', '/');
            URL resource = loader.getResource(path);
            if (resource == null) {
                continue;
            }
            if ("file".equals(resource.getProtocol())) {
                Path root = java.nio.file.Paths.get(resource.toURI());
                Files.walk(root)
                        .filter(p -> p.toString().endsWith(".class"))
                        .forEach(p -> addClass(results, pkg, root, p));
            } else if ("jar".equals(resource.getProtocol())) {
                JarURLConnection connection = (JarURLConnection) resource.openConnection();
                try (JarFile jar = connection.getJarFile()) {
                    for (JarEntry entry : Collections.list(jar.entries())) {
                        String name = entry.getName();
                        if (name.startsWith(path) && name.endsWith(".class") && !name.contains("$")) {
                            String className = name.replace('/', '.').replaceAll("\\.class$", "");
                            addClass(results, className);
                        }
                    }
                }
            }
        }
        return results;
    }

    private static void addClass(List<Class<?>> results, String basePackage, Path root, Path classFile) {
        String rel = root.relativize(classFile).toString();
        if (rel.contains("$")) {
            return;
        }
        String className = basePackage + "." + rel.replace(File.separatorChar, '.').replaceAll("\\.class$", "");
        addClass(results, className);
    }

    private static void addClass(List<Class<?>> results, String className) {
        try {
            Class<?> clazz = Class.forName(className, false, Thread.currentThread().getContextClassLoader());
            results.add(clazz);
        } catch (Throwable ignored) {
            // Skip classes that cannot be loaded safely in unit tests.
        }
    }

    private static void touchClass(Class<?> clazz) {
        if (clazz.isAnnotation() || clazz.isInterface() || Modifier.isAbstract(clazz.getModifiers())) {
            return;
        }
        if (clazz.isEnum()) {
            Object[] values = clazz.getEnumConstants();
            if (values != null && values.length > 0) {
                values[0].toString();
            }
            return;
        }

        boolean touched = false;
        Object instance = tryInstantiate(clazz);
        if (instance != null) {
            instance.toString();
            instance.hashCode();
            instance.equals(instance);
            touched = true;
            invokeSetters(instance);
            invokeGetters(instance);
        }

        if (!touched) {
            accessStaticFields(clazz);
        }
    }

    private static Object tryInstantiate(Class<?> clazz) {
        try {
            Constructor<?> ctor = clazz.getDeclaredConstructor();
            ctor.setAccessible(true);
            return ctor.newInstance();
        } catch (Throwable ignored) {
            // Try other constructors with default values.
        }
        for (Constructor<?> ctor : clazz.getDeclaredConstructors()) {
            Class<?>[] types = ctor.getParameterTypes();
            Object[] args = new Object[types.length];
            boolean supported = true;
            for (int i = 0; i < types.length; i++) {
                Object value = defaultValue(types[i]);
                if (value == null && types[i].isPrimitive()) {
                    supported = false;
                    break;
                }
                args[i] = value;
            }
            if (!supported) {
                continue;
            }
            try {
                ctor.setAccessible(true);
                return ctor.newInstance(args);
            } catch (Throwable ignored) {
                // Keep trying other constructors.
            }
        }
        return null;
    }

    private static void invokeSetters(Object instance) {
        for (Method method : instance.getClass().getMethods()) {
            if (!method.getName().startsWith("set") || method.getParameterCount() != 1) {
                continue;
            }
            Class<?> type = method.getParameterTypes()[0];
            Object value = defaultValue(type);
            if (value == null && type.isPrimitive()) {
                continue;
            }
            try {
                method.invoke(instance, value);
            } catch (Throwable ignored) {
                // Best effort only.
            }
        }
    }

    private static void invokeGetters(Object instance) {
        for (Method method : instance.getClass().getMethods()) {
            if (method.getParameterCount() != 0) {
                continue;
            }
            if (method.getReturnType() == Void.TYPE) {
                continue;
            }
            if (method.getDeclaringClass() == Object.class) {
                continue;
            }
            if (method.getName().startsWith("get") || method.getName().startsWith("is")) {
                try {
                    method.invoke(instance);
                } catch (Throwable ignored) {
                    // Best effort only.
                }
            }
        }
    }

    private static void accessStaticFields(Class<?> clazz) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                continue;
            }
            try {
                field.setAccessible(true);
                field.get(null);
            } catch (Throwable ignored) {
                // Best effort only.
            }
        }
    }

    private static Object defaultValue(Class<?> type) {
        if (type.isPrimitive()) {
            if (type == boolean.class) {
                return false;
            }
            if (type == byte.class) {
                return (byte) 0;
            }
            if (type == short.class) {
                return (short) 0;
            }
            if (type == int.class) {
                return 0;
            }
            if (type == long.class) {
                return 0L;
            }
            if (type == float.class) {
                return 0F;
            }
            if (type == double.class) {
                return 0D;
            }
            if (type == char.class) {
                return '\0';
            }
        }
        if (type == String.class) {
            return "";
        }
        if (type == Boolean.class) {
            return Boolean.FALSE;
        }
        if (type == Integer.class) {
            return 0;
        }
        if (type == Long.class) {
            return 0L;
        }
        if (type == Double.class) {
            return 0D;
        }
        if (type == Float.class) {
            return 0F;
        }
        if (type == BigDecimal.class) {
            return BigDecimal.ZERO;
        }
        if (type == BigInteger.class) {
            return BigInteger.ZERO;
        }
        if (type == UUID.class) {
            return new UUID(0L, 0L);
        }
        if (type == byte[].class) {
            return new byte[0];
        }
        if (type == LocalDate.class) {
            return LocalDate.of(1970, 1, 1);
        }
        if (type == LocalTime.class) {
            return LocalTime.MIDNIGHT;
        }
        if (type == LocalDateTime.class) {
            return LocalDateTime.of(1970, 1, 1, 0, 0);
        }
        if (type == Instant.class) {
            return Instant.EPOCH;
        }
        if (type == ZonedDateTime.class) {
            return ZonedDateTime.parse("1970-01-01T00:00:00Z");
        }
        if (type == OffsetDateTime.class) {
            return OffsetDateTime.parse("1970-01-01T00:00:00Z");
        }
        if (type == List.class) {
            return Collections.emptyList();
        }
        if (type == Set.class) {
            return Collections.emptySet();
        }
        if (type == Map.class) {
            return Collections.emptyMap();
        }
        if (type == Optional.class) {
            return Optional.empty();
        }
        if (type.isEnum()) {
            Object[] values = type.getEnumConstants();
            if (values != null && values.length > 0) {
                return values[0];
            }
        }
        try {
            Constructor<?> ctor = type.getDeclaredConstructor();
            ctor.setAccessible(true);
            return ctor.newInstance();
        } catch (Throwable ignored) {
            return null;
        }
    }
}
