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

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.common.utils.PropertyUtils;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class RemoteLogServiceTest {

    @Test
    void asyncSendRemoteLog_invokesHandler() {
        RemoteLogService service = new RemoteLogService();
        RemoteLogHandler handler = Mockito.mock(RemoteLogHandler.class);

        try (
                MockedStatic<RemoteLogUtils> remoteLogUtils = Mockito.mockStatic(RemoteLogUtils.class);
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<RemoteLogHandlerFactory> factory = Mockito.mockStatic(RemoteLogHandlerFactory.class)) {
            remoteLogUtils.when(RemoteLogUtils::isRemoteLoggingEnable).thenReturn(true);
            propertyUtils.when(() -> PropertyUtils.getString(Constants.REMOTE_LOGGING_TARGET)).thenReturn("OSS");
            factory.when(RemoteLogHandlerFactory::getRemoteLogHandler).thenReturn(handler);

            service.asyncSendRemoteLog("/tmp/test.log");

            verify(handler).sendRemoteLog("/tmp/test.log");
        }
    }

    @Test
    void asyncSendRemoteLog_skipsWhenNoHandler() {
        RemoteLogService service = new RemoteLogService();
        RemoteLogHandler handler = Mockito.mock(RemoteLogHandler.class);

        try (
                MockedStatic<RemoteLogUtils> remoteLogUtils = Mockito.mockStatic(RemoteLogUtils.class);
                MockedStatic<RemoteLogHandlerFactory> factory = Mockito.mockStatic(RemoteLogHandlerFactory.class)) {
            remoteLogUtils.when(RemoteLogUtils::isRemoteLoggingEnable).thenReturn(true);
            factory.when(RemoteLogHandlerFactory::getRemoteLogHandler).thenReturn(null);

            service.asyncSendRemoteLog("/tmp/test.log");

            verify(handler, never()).sendRemoteLog(Mockito.anyString());
        }
    }
}
