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

package org.apache.dolphinscheduler.common.log.remote;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.common.utils.LogUtils;
import org.apache.dolphinscheduler.common.utils.PropertyUtils;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class RemoteLogUtilsTest {

    @Test
    void isRemoteLoggingEnable_readsProperty() {
        try (MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class)) {
            propertyUtils.when(() -> PropertyUtils.getBoolean(Constants.REMOTE_LOGGING_ENABLE, Boolean.FALSE))
                    .thenReturn(true);

            assertTrue(RemoteLogUtils.isRemoteLoggingEnable());
        }
    }

    @Test
    void getObjectNameFromLogPath_buildsRelativePath() {
        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<LogUtils> logUtils = Mockito.mockStatic(LogUtils.class)) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_BASE_DIR))
                    .thenReturn("/remote/base");
            logUtils.when(LogUtils::getLocalLogBaseDir).thenReturn("/local/logs");

            String objectName = RemoteLogUtils.getObjectNameFromLogPath("/local/logs/app/1.log");

            assertEquals("/remote/base/app/1.log", objectName);
        }
    }

    @Test
    void sendAndGetRemoteLog_useRemoteServiceAndHandler() throws Exception {
        RemoteLogService service = Mockito.mock(RemoteLogService.class);
        RemoteLogHandler handler = Mockito.mock(RemoteLogHandler.class);

        Field field = RemoteLogUtils.class.getDeclaredField("remoteLogService");
        field.setAccessible(true);
        field.set(null, service);

        Path tempDir = Files.createTempDirectory("remote-log");
        Path logFile = tempDir.resolve("worker.log");

        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<RemoteLogHandlerFactory> factory =
                        Mockito.mockStatic(RemoteLogHandlerFactory.class)) {
            propertyUtils.when(() -> PropertyUtils.getBoolean(Constants.REMOTE_LOGGING_ENABLE, Boolean.FALSE))
                    .thenReturn(true);
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_TARGET))
                    .thenReturn("s3");
            factory.when(RemoteLogHandlerFactory::getRemoteLogHandler).thenReturn(handler);

            assertDoesNotThrow(() -> RemoteLogUtils.sendRemoteLog(logFile.toString()));
            assertDoesNotThrow(() -> RemoteLogUtils.getRemoteLog(logFile.toString()));

            Mockito.verify(service).asyncSendRemoteLog(logFile.toString());
            Mockito.verify(handler).getRemoteLog(logFile.toString());
        }
    }
}
