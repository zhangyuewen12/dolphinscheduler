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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.alert.config.AlertConfig;
import org.apache.dolphinscheduler.alert.service.AlertHAServer;
import org.apache.dolphinscheduler.common.model.AlertServerHeartBeat;
import org.apache.dolphinscheduler.meter.metrics.MetricsProvider;
import org.apache.dolphinscheduler.meter.metrics.SystemMetrics;
import org.apache.dolphinscheduler.registry.api.RegistryClient;
import org.apache.dolphinscheduler.registry.api.enums.RegistryNodeType;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;

class AlertHeartbeatTaskTest {

    @Test
    void buildsHeartbeatAndWritesToRegistry() {
        AlertConfig config = new AlertConfig();
        config.setPort(1234);
        config.setAlertServerAddress("127.0.0.1:1234");
        config.setMaxHeartbeatInterval(Duration.ofSeconds(1));

        MetricsProvider metricsProvider = mock(MetricsProvider.class);
        SystemMetrics systemMetrics = SystemMetrics.builder()
                .systemCpuUsagePercentage(0.1)
                .jvmCpuUsagePercentage(0.2)
                .systemMemoryUsedPercentage(0.3)
                .jvmMemoryUsedPercentage(0.4)
                .diskUsedPercentage(0.5)
                .build();
        when(metricsProvider.getSystemMetrics()).thenReturn(systemMetrics);

        RegistryClient registryClient = mock(RegistryClient.class);
        AlertHAServer alertHAServer = mock(AlertHAServer.class);
        when(alertHAServer.isActive()).thenReturn(true);

        AlertHeartbeatTask task =
                new AlertHeartbeatTask(config, metricsProvider, registryClient, alertHAServer);

        AlertServerHeartBeat heartBeat = task.getHeartBeat();
        assertNotNull(heartBeat);
        assertEquals(1234, heartBeat.getPort());

        Counter before = Metrics.globalRegistry.find("ds.alert.heartbeat.count").counter();
        double beforeCount = before == null ? 0.0 : before.count();

        String expectedPath = RegistryNodeType.ALERT_SERVER.getRegistryPath() + "/127.0.0.1:1234";
        task.writeHeartBeat(heartBeat);
        verify(registryClient).persistEphemeral(eq(expectedPath), org.mockito.ArgumentMatchers.anyString());

        Counter after = Metrics.globalRegistry.find("ds.alert.heartbeat.count").counter();
        assertNotNull(after);
        assertTrue(after.count() >= beforeCount);
    }
}
