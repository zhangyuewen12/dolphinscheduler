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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.dolphinscheduler.common.log.remote.RemoteLogUtils;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class LogUtilsTest {

    @Test
    void readAndRollLocalLogContent() throws Exception {
        Path tempFile = Files.createTempFile("log-utils", ".log");
        Files.write(tempFile, Arrays.asList("line-1", "line-2", "line-3"), StandardCharsets.UTF_8);

        byte[] bytes = LogUtils.getFileContentBytesFromLocal(tempFile.toString());
        assertNotEquals(0, bytes.length);

        List<String> part = LogUtils.readPartFileContentFromLocal(tempFile.toString(), 1, 1);
        assertEquals(1, part.size());
        assertEquals("line-2", part.get(0));

        String content = LogUtils.readWholeFileContentFromLocal(tempFile.toString());
        assertTrue(content.contains("line-1"));

        String longLine = repeat("a", 70000);
        String rolled = LogUtils.rollViewLogLines(java.util.Collections.singletonList(longLine));
        assertTrue(rolled.contains("only"));
    }

    @Test
    void readPartFileContentThrowsWhenMissing() {
        assertThrows(RuntimeException.class,
                () -> LogUtils.readPartFileContentFromLocal("missing-file.log", 0, 1));
    }

    @Test
    void readRemoteAndMissingFilePaths() throws Exception {
        try (MockedStatic<RemoteLogUtils> remoteLogUtils = Mockito.mockStatic(RemoteLogUtils.class)) {
            remoteLogUtils.when(RemoteLogUtils::isRemoteLoggingEnable).thenReturn(true);
            Path remoteFile = Files.createTempFile("log-utils-remote", ".log");
            Files.deleteIfExists(remoteFile);
            remoteLogUtils.when(() -> RemoteLogUtils.getRemoteLog(Mockito.anyString()))
                    .thenAnswer(invocation -> {
                        Files.write(remoteFile, java.util.Arrays.asList("remote-line"), StandardCharsets.UTF_8);
                        return null;
                    });

            byte[] bytes = LogUtils.getFileContentBytes(remoteFile.toString());
            assertNotEquals(0, bytes.length);

            String content = LogUtils.readWholeFileContent(remoteFile.toString());
            assertTrue(content.contains("remote-line"));

            List<String> remotePart = LogUtils.readPartFileContent(remoteFile.toString(), 0, 1);
            assertEquals(1, remotePart.size());
        }
    }

    @Test
    void getLocalLogBaseDir_readsLoggerContextProperty() {
        ch.qos.logback.classic.LoggerContext loggerContext =
                (ch.qos.logback.classic.LoggerContext) org.slf4j.LoggerFactory.getILoggerFactory();
        loggerContext.putProperty("log.base.ctx", "/tmp/ds-logs");
        assertEquals("/tmp/ds-logs", LogUtils.getLocalLogBaseDir());
        loggerContext.putProperty("log.base.ctx", null);
    }

    @Test
    void missingFileReturnsEmptyContent() {
        byte[] bytes = LogUtils.getFileContentBytesFromLocal("missing-file.log");
        assertEquals(0, bytes.length);
        assertEquals("", LogUtils.readWholeFileContentFromLocal("missing-file.log"));
    }

    @Test
    void rollViewLogLinesStopsAtMaxSize() {
        String line = repeat("a", 10000);
        List<String> lines = java.util.Arrays.asList(line, line, line, line, line, line, line, line);
        String rolled = LogUtils.rollViewLogLines(lines);
        assertTrue(rolled.length() > 0);
    }

    private static String repeat(String value, int times) {
        StringBuilder builder = new StringBuilder(value.length() * times);
        for (int i = 0; i < times; i++) {
            builder.append(value);
        }
        return builder.toString();
    }
}
