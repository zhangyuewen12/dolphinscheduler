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

import org.apache.dolphinscheduler.authentication.aws.AmazonS3ClientFactory;
import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.common.utils.PropertyUtils;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

class S3RemoteLogHandlerTest {

    @AfterEach
    void resetInstance() throws Exception {
        Field instance = S3RemoteLogHandler.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }

    @Test
    void getInstance_usesFactoryAndSendsLogs() throws Exception {
        AmazonS3 s3 = Mockito.mock(AmazonS3.class);
        when(s3.doesBucketExistV2("bucket")).thenReturn(true);
        when(s3.getRegionName()).thenReturn("region");

        S3Object s3Object = new S3Object();
        S3ObjectInputStream inputStream =
                new S3ObjectInputStream(new ByteArrayInputStream("".getBytes()), null);
        s3Object.setObjectContent(inputStream);
        when(s3.getObject("bucket", "obj")).thenReturn(s3Object);

        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<AmazonS3ClientFactory> factory = Mockito.mockStatic(AmazonS3ClientFactory.class);
                MockedStatic<RemoteLogUtils> remoteLogUtils = Mockito.mockStatic(RemoteLogUtils.class)) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.AWS_S3_BUCKET_NAME)).thenReturn("bucket");
            propertyUtils.when(() -> PropertyUtils.getByPrefix("aws.s3.", ""))
                    .thenReturn(java.util.Collections.<String, String>emptyMap());
            factory.when(() -> AmazonS3ClientFactory.createAmazonS3Client(Mockito.anyMap())).thenReturn(s3);
            remoteLogUtils.when(() -> RemoteLogUtils.getObjectNameFromLogPath(Mockito.anyString()))
                    .thenReturn("obj");

            S3RemoteLogHandler handler = S3RemoteLogHandler.getInstance();

            Path logFile = Files.createTempFile("s3-log", ".txt");
            handler.sendRemoteLog(logFile.toString());
            handler.getRemoteLog(logFile.toString());
            handler.close();

            verify(s3).putObject(Mockito.eq("bucket"), Mockito.eq("obj"), Mockito.any(java.io.File.class));
            verify(s3).getObject("bucket", "obj");
            verify(s3).shutdown();
        }
    }

    @Test
    void checkBucketNameExists_throwsWhenBlank() {
        AmazonS3 s3 = Mockito.mock(AmazonS3.class);

        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<AmazonS3ClientFactory> factory = Mockito.mockStatic(AmazonS3ClientFactory.class)) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.AWS_S3_BUCKET_NAME)).thenReturn("");
            propertyUtils.when(() -> PropertyUtils.getByPrefix("aws.s3.", ""))
                    .thenReturn(java.util.Collections.<String, String>emptyMap());
            factory.when(() -> AmazonS3ClientFactory.createAmazonS3Client(Mockito.anyMap())).thenReturn(s3);

            assertThrows(IllegalArgumentException.class, S3RemoteLogHandler::getInstance);
        }
    }

    @Test
    void checkBucketNameExists_throwsWhenMissing() {
        AmazonS3 s3 = Mockito.mock(AmazonS3.class);
        when(s3.doesBucketExistV2("bucket")).thenReturn(false);

        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<AmazonS3ClientFactory> factory = Mockito.mockStatic(AmazonS3ClientFactory.class)) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.AWS_S3_BUCKET_NAME)).thenReturn("bucket");
            propertyUtils.when(() -> PropertyUtils.getByPrefix("aws.s3.", ""))
                    .thenReturn(java.util.Collections.<String, String>emptyMap());
            factory.when(() -> AmazonS3ClientFactory.createAmazonS3Client(Mockito.anyMap())).thenReturn(s3);

            assertThrows(IllegalArgumentException.class, S3RemoteLogHandler::getInstance);
        }
    }

    @Test
    void sendAndGetHandleErrors() throws Exception {
        AmazonS3 s3 = Mockito.mock(AmazonS3.class);
        when(s3.doesBucketExistV2("bucket")).thenReturn(true);
        when(s3.getRegionName()).thenReturn("region");
        Mockito.doThrow(new RuntimeException("fail")).when(s3)
                .putObject(Mockito.eq("bucket"), Mockito.eq("obj"), Mockito.any(java.io.File.class));
        Mockito.doThrow(new RuntimeException("fail")).when(s3).getObject("bucket", "obj");

        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<AmazonS3ClientFactory> factory = Mockito.mockStatic(AmazonS3ClientFactory.class);
                MockedStatic<RemoteLogUtils> remoteLogUtils = Mockito.mockStatic(RemoteLogUtils.class)) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.AWS_S3_BUCKET_NAME)).thenReturn("bucket");
            propertyUtils.when(() -> PropertyUtils.getByPrefix("aws.s3.", ""))
                    .thenReturn(java.util.Collections.<String, String>emptyMap());
            factory.when(() -> AmazonS3ClientFactory.createAmazonS3Client(Mockito.anyMap())).thenReturn(s3);
            remoteLogUtils.when(() -> RemoteLogUtils.getObjectNameFromLogPath(Mockito.anyString()))
                    .thenReturn("obj");

            S3RemoteLogHandler handler = S3RemoteLogHandler.getInstance();
            Path logFile = Files.createTempFile("s3-log", ".txt");
            handler.sendRemoteLog(logFile.toString());
            handler.getRemoteLog(logFile.toString());
        }
    }
}
