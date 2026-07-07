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

package org.apache.dolphinscheduler.alert.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.apache.dolphinscheduler.alert.registry.AlertRegistryClient;
import org.apache.dolphinscheduler.alert.rpc.AlertRpcServer;

import org.junit.jupiter.api.Test;

class AlertBootstrapServiceTest {

    @Test
    void startAndCloseDelegateToComponents() {
        AlertEventFetcher fetcher = mock(AlertEventFetcher.class);
        AlertEventLoop loop = mock(AlertEventLoop.class);

        AlertBootstrapService service = new AlertBootstrapService(
                mock(AlertRpcServer.class),
                mock(AlertRegistryClient.class),
                mock(AlertHAServer.class),
                fetcher,
                loop);

        service.start();
        verify(fetcher).start();
        verify(loop).start();

        service.close();
        verify(fetcher).shutdown();
        verify(loop).shutdown();
    }
}
