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

package org.apache.dolphinscheduler.alert;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.apache.dolphinscheduler.alert.plugin.AlertPluginManager;
import org.apache.dolphinscheduler.alert.registry.AlertRegistryClient;
import org.apache.dolphinscheduler.alert.rpc.AlertRpcServer;
import org.apache.dolphinscheduler.alert.service.AlertBootstrapService;
import org.apache.dolphinscheduler.alert.service.AlertHAServer;
import org.apache.dolphinscheduler.common.lifecycle.ServerLifeCycleManager;
import org.apache.dolphinscheduler.registry.api.ha.AbstractServerStatusChangeListener;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class AlertServerTest {

    @AfterEach
    void resetServerStatus() {
        ServerLifeCycleManager.toRunning();
    }

    @Test
    void runRegistersAndStopsOnStandby() throws Exception {
        AlertRpcServer rpcServer = mock(AlertRpcServer.class);
        AlertPluginManager pluginManager = mock(AlertPluginManager.class);
        AlertRegistryClient registryClient = mock(AlertRegistryClient.class);
        AlertHAServer haServer = mock(AlertHAServer.class);
        AlertBootstrapService bootstrapService = mock(AlertBootstrapService.class);

        AlertServer server = new AlertServer();
        TestReflectionUtils.setField(server, "alertRpcServer", rpcServer);
        TestReflectionUtils.setField(server, "alertPluginManager", pluginManager);
        TestReflectionUtils.setField(server, "alertRegistryClient", registryClient);
        TestReflectionUtils.setField(server, "alertHAServer", haServer);
        TestReflectionUtils.setField(server, "alertBootstrapService", bootstrapService);

        ArgumentCaptor<AbstractServerStatusChangeListener> listenerCaptor =
                ArgumentCaptor.forClass(AbstractServerStatusChangeListener.class);
        doNothing().when(haServer).addServerStatusChangeListener(listenerCaptor.capture());

        server.run();

        verify(pluginManager).start();
        verify(rpcServer).start();
        verify(registryClient).start();
        verify(haServer).start();

        AbstractServerStatusChangeListener listener = listenerCaptor.getValue();
        listener.changeToActive();
        verify(bootstrapService).start();

        listener.changeToStandBy();
        verify(rpcServer).close();
        verify(registryClient).close();
        verify(haServer).close();
        verify(bootstrapService).close();
    }
}
