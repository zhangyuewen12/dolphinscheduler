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

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.apache.dolphinscheduler.common.utils.PropertyUtils;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class RemoteLogHandlerFactoryTest {

    @Test
    void returnsNullWhenRemoteLoggingDisabled() {
        try (MockedStatic<RemoteLogUtils> remoteLogUtils = Mockito.mockStatic(RemoteLogUtils.class)) {
            remoteLogUtils.when(RemoteLogUtils::isRemoteLoggingEnable).thenReturn(false);

            assertNull(RemoteLogHandlerFactory.getRemoteLogHandler());
        }
    }

    @Test
    void returnsHandlerByTarget() {
        try (
                MockedStatic<RemoteLogUtils> remoteLogUtils = Mockito.mockStatic(RemoteLogUtils.class);
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<OssRemoteLogHandler> oss = Mockito.mockStatic(OssRemoteLogHandler.class);
                MockedStatic<S3RemoteLogHandler> s3 = Mockito.mockStatic(S3RemoteLogHandler.class);
                MockedStatic<GcsRemoteLogHandler> gcs = Mockito.mockStatic(GcsRemoteLogHandler.class);
                MockedStatic<AbsRemoteLogHandler> abs = Mockito.mockStatic(AbsRemoteLogHandler.class);
                MockedStatic<CosRemoteLogHandler> cos = Mockito.mockStatic(CosRemoteLogHandler.class)) {
            remoteLogUtils.when(RemoteLogUtils::isRemoteLoggingEnable).thenReturn(true);

            OssRemoteLogHandler ossHandler = Mockito.mock(OssRemoteLogHandler.class);
            oss.when(OssRemoteLogHandler::getInstance).thenReturn(ossHandler);
            propertyUtils.when(() -> PropertyUtils.getUpperCaseString(Mockito.anyString())).thenReturn("OSS");
            assertSame(ossHandler, RemoteLogHandlerFactory.getRemoteLogHandler());

            S3RemoteLogHandler s3Handler = Mockito.mock(S3RemoteLogHandler.class);
            s3.when(S3RemoteLogHandler::getInstance).thenReturn(s3Handler);
            propertyUtils.when(() -> PropertyUtils.getUpperCaseString(Mockito.anyString())).thenReturn("S3");
            assertSame(s3Handler, RemoteLogHandlerFactory.getRemoteLogHandler());

            GcsRemoteLogHandler gcsHandler = Mockito.mock(GcsRemoteLogHandler.class);
            gcs.when(GcsRemoteLogHandler::getInstance).thenReturn(gcsHandler);
            propertyUtils.when(() -> PropertyUtils.getUpperCaseString(Mockito.anyString())).thenReturn("GCS");
            assertSame(gcsHandler, RemoteLogHandlerFactory.getRemoteLogHandler());

            AbsRemoteLogHandler absHandler = Mockito.mock(AbsRemoteLogHandler.class);
            abs.when(AbsRemoteLogHandler::getInstance).thenReturn(absHandler);
            propertyUtils.when(() -> PropertyUtils.getUpperCaseString(Mockito.anyString())).thenReturn("ABS");
            assertSame(absHandler, RemoteLogHandlerFactory.getRemoteLogHandler());

            CosRemoteLogHandler cosHandler = Mockito.mock(CosRemoteLogHandler.class);
            cos.when(CosRemoteLogHandler::getInstance).thenReturn(cosHandler);
            propertyUtils.when(() -> PropertyUtils.getUpperCaseString(Mockito.anyString())).thenReturn("COS");
            assertSame(cosHandler, RemoteLogHandlerFactory.getRemoteLogHandler());
        }
    }
}
