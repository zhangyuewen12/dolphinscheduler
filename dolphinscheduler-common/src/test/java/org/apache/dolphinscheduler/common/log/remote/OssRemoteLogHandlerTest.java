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

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.common.factory.OssClientFactory;
import org.apache.dolphinscheduler.common.model.OssConnection;
import org.apache.dolphinscheduler.common.utils.PropertyUtils;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.aliyun.oss.OSS;

class OssRemoteLogHandlerTest {

    @AfterEach
    void resetInstance() throws Exception {
        Field instance = OssRemoteLogHandler.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }

    @Test
    void getInstance_usesFactoryAndSendsLogs() throws Exception {
        OSS oss = Mockito.mock(OSS.class);
        when(oss.doesBucketExist("bucket")).thenReturn(true);

        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<OssClientFactory> ossFactory = Mockito.mockStatic(OssClientFactory.class);
                MockedStatic<RemoteLogUtils> remoteLogUtils = Mockito.mockStatic(RemoteLogUtils.class)) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_ACCESS_KEY_ID))
                    .thenReturn("key");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_ACCESS_KEY_SECRET))
                    .thenReturn("secret");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_ENDPOINT))
                    .thenReturn("endpoint");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_BUCKET_NAME))
                    .thenReturn("bucket");
            ossFactory.when(() -> OssClientFactory.buildOssClient(Mockito.any(OssConnection.class)))
                    .thenReturn(oss);
            remoteLogUtils.when(() -> RemoteLogUtils.getObjectNameFromLogPath(Mockito.anyString()))
                    .thenReturn("obj");

            OssRemoteLogHandler handler = OssRemoteLogHandler.getInstance();

            Path logFile = Files.createTempFile("oss-log", ".txt");
            handler.sendRemoteLog(logFile.toString());
            handler.getRemoteLog(logFile.toString());
            handler.close();

            verify(oss).putObject(Mockito.any());
            verify(oss).getObject(Mockito.any(com.aliyun.oss.model.GetObjectRequest.class),
                    Mockito.any(java.io.File.class));
            verify(oss).shutdown();
        }
    }

    @Test
    void getInstance_throwsWhenBucketEmpty() {
        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<OssClientFactory> ossFactory = Mockito.mockStatic(OssClientFactory.class)) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_ACCESS_KEY_ID))
                    .thenReturn("key");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_ACCESS_KEY_SECRET))
                    .thenReturn("secret");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_ENDPOINT))
                    .thenReturn("endpoint");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_BUCKET_NAME))
                    .thenReturn("");
            ossFactory.when(() -> OssClientFactory.buildOssClient(Mockito.any(OssConnection.class)))
                    .thenReturn(Mockito.mock(OSS.class));

            assertThrows(IllegalArgumentException.class, OssRemoteLogHandler::getInstance);
        }
    }

    @Test
    void getInstance_throwsWhenBucketMissing() {
        OSS oss = Mockito.mock(OSS.class);
        when(oss.doesBucketExist("bucket")).thenReturn(false);

        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<OssClientFactory> ossFactory = Mockito.mockStatic(OssClientFactory.class)) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_ACCESS_KEY_ID))
                    .thenReturn("key");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_ACCESS_KEY_SECRET))
                    .thenReturn("secret");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_ENDPOINT))
                    .thenReturn("endpoint");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_OSS_BUCKET_NAME))
                    .thenReturn("bucket");
            ossFactory.when(() -> OssClientFactory.buildOssClient(Mockito.any(OssConnection.class)))
                    .thenReturn(oss);

            assertThrows(IllegalArgumentException.class, OssRemoteLogHandler::getInstance);
        }
    }
}
