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

package org.apache.dolphinscheduler.alert.metrics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.alert.TestReflectionUtils;
import org.apache.dolphinscheduler.alert.registry.AlertRegistryClient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.health.Health;

class AlertHealthIndicatorTest {

    @Test
    void healthIsUpWhenRegistryAvailable() throws Exception {
        AlertRegistryClient registryClient = mock(AlertRegistryClient.class);
        when(registryClient.isAvailable()).thenReturn(true);

        AlertHealthIndicator indicator = new AlertHealthIndicator();
        TestReflectionUtils.setField(indicator, "alertRegistryClient", registryClient);

        Health health = indicator.health();
        assertEquals(org.springframework.boot.actuate.health.Status.UP, health.getStatus());
    }

    @Test
    void healthIsDownWhenRegistryUnavailable() throws Exception {
        AlertRegistryClient registryClient = mock(AlertRegistryClient.class);
        when(registryClient.isAvailable()).thenReturn(false);

        AlertHealthIndicator indicator = new AlertHealthIndicator();
        TestReflectionUtils.setField(indicator, "alertRegistryClient", registryClient);

        Health health = indicator.health();
        assertEquals(org.springframework.boot.actuate.health.Status.DOWN, health.getStatus());
    }

    @Test
    void healthIsDownWhenRegistryThrows() throws Exception {
        AlertRegistryClient registryClient = mock(AlertRegistryClient.class);
        when(registryClient.isAvailable()).thenThrow(new RuntimeException("boom"));

        AlertHealthIndicator indicator = new AlertHealthIndicator();
        TestReflectionUtils.setField(indicator, "alertRegistryClient", registryClient);

        Health health = indicator.health();
        assertEquals(org.springframework.boot.actuate.health.Status.DOWN, health.getStatus());
    }
}
