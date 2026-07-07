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

package org.apache.dolphinscheduler.alert.registry;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.alert.TestReflectionUtils;
import org.apache.dolphinscheduler.alert.config.AlertConfig;
import org.apache.dolphinscheduler.alert.service.AlertHAServer;
import org.apache.dolphinscheduler.meter.metrics.MetricsProvider;
import org.apache.dolphinscheduler.meter.metrics.SystemMetrics;
import org.apache.dolphinscheduler.registry.api.RegistryClient;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class AlertRegistryClientTest {

    @Test
    void startAndCloseAndAvailability() throws Exception {
        AlertConfig config = new AlertConfig();
        config.setPort(1234);
        config.setAlertServerAddress("127.0.0.1:1234");
        config.setMaxHeartbeatInterval(Duration.ofSeconds(1));

        MetricsProvider metricsProvider = mock(MetricsProvider.class);
        when(metricsProvider.getSystemMetrics()).thenReturn(SystemMetrics.builder().build());

        RegistryClient registryClient = mock(RegistryClient.class);
        when(registryClient.isConnected()).thenReturn(true);

        AlertHAServer alertHAServer = mock(AlertHAServer.class);
        when(alertHAServer.isActive()).thenReturn(true);

        AlertRegistryClient client = new AlertRegistryClient();
        TestReflectionUtils.setField(client, "registryClient", registryClient);
        TestReflectionUtils.setField(client, "alertConfig", config);
        TestReflectionUtils.setField(client, "metricsProvider", metricsProvider);
        TestReflectionUtils.setField(client, "alertHAServer", alertHAServer);

        client.start();
        assertTrue(client.isAvailable());
        client.close();
    }
}
