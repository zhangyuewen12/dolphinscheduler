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
import org.apache.dolphinscheduler.common.utils.PropertyUtils;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.qcloud.cos.COSClient;

class CosRemoteLogHandlerTest {

    @AfterEach
    void resetInstance() throws Exception {
        Field instance = CosRemoteLogHandler.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }

    @Test
    void getInstance_sendsAndGetsLogs() throws Exception {
        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<RemoteLogUtils> remoteLogUtils = Mockito.mockStatic(RemoteLogUtils.class);
                MockedConstruction<COSClient> cosConstruction =
                        Mockito.mockConstruction(COSClient.class,
                                (cos, context) -> when(cos.doesBucketExist("bucket")).thenReturn(true))) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_ACCESS_KEY_ID))
                    .thenReturn("key");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_ACCESS_KEY_SECRET))
                    .thenReturn("secret");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_REGION))
                    .thenReturn("region");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_BUCKET_NAME))
                    .thenReturn("bucket");
            remoteLogUtils.when(() -> RemoteLogUtils.getObjectNameFromLogPath(Mockito.anyString()))
                    .thenReturn("obj");

            CosRemoteLogHandler handler = CosRemoteLogHandler.getInstance();
            COSClient cosClient = cosConstruction.constructed().get(0);

            Path logFile = Files.createTempFile("cos-log", ".txt");
            handler.sendRemoteLog(logFile.toString());
            handler.getRemoteLog(logFile.toString());
            handler.close();

            verify(cosClient).putObject(Mockito.any());
            verify(cosClient).getObject(Mockito.any(com.qcloud.cos.model.GetObjectRequest.class),
                    Mockito.any(java.io.File.class));
            verify(cosClient).shutdown();
        }
    }

    @Test
    void getInstance_throwsWhenBucketEmpty() {
        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedConstruction<COSClient> cosConstruction =
                        Mockito.mockConstruction(COSClient.class,
                                (cos, context) -> when(cos.doesBucketExist(Mockito.anyString())).thenReturn(true))) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_ACCESS_KEY_ID))
                    .thenReturn("key");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_ACCESS_KEY_SECRET))
                    .thenReturn("secret");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_REGION))
                    .thenReturn("region");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_BUCKET_NAME))
                    .thenReturn("");

            assertThrows(IllegalArgumentException.class, CosRemoteLogHandler::getInstance);
        }
    }

    @Test
    void getInstance_throwsWhenBucketMissing() {
        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedConstruction<COSClient> cosConstruction =
                        Mockito.mockConstruction(COSClient.class,
                                (cos, context) -> when(cos.doesBucketExist("bucket")).thenReturn(false))) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_ACCESS_KEY_ID))
                    .thenReturn("key");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_ACCESS_KEY_SECRET))
                    .thenReturn("secret");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_REGION))
                    .thenReturn("region");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_COS_BUCKET_NAME))
                    .thenReturn("bucket");

            assertThrows(IllegalArgumentException.class, CosRemoteLogHandler::getInstance);
        }
    }
}
