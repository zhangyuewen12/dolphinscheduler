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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.Metrics;

class AlertServerMetricsTest {

    @Test
    void countersIncrement() {
        Counter successCounter =
                Metrics.globalRegistry.find("ds.alert.send.count").tag("status", "success").counter();
        double before = successCounter == null ? 0.0 : successCounter.count();

        AlertServerMetrics.incAlertSuccessCount();

        Counter updatedCounter =
                Metrics.globalRegistry.find("ds.alert.send.count").tag("status", "success").counter();
        assertNotNull(updatedCounter);
        assertTrue(updatedCounter.count() >= before + 1.0);

        AlertServerMetrics.incAlertFailCount();
        Counter failCounter =
                Metrics.globalRegistry.find("ds.alert.send.count").tag("status", "fail").counter();
        assertNotNull(failCounter);

        AlertServerMetrics.incAlertHeartbeatCount();
        Counter heartbeatCounter = Metrics.globalRegistry.find("ds.alert.heartbeat.count").counter();
        assertNotNull(heartbeatCounter);
    }

    @Test
    void gaugesRegister() {
        AtomicInteger pending = new AtomicInteger(3);
        AlertServerMetrics.registerPendingAlertGauge(pending::get);
        Gauge pendingGauge = Metrics.globalRegistry.find("ds.alert.pending").gauge();
        assertNotNull(pendingGauge);

        AtomicInteger sending = new AtomicInteger(2);
        AlertServerMetrics.registerSendingAlertGauge(sending::get);
        Gauge sendingGauge = Metrics.globalRegistry.find("ds.alert.sending").gauge();
        assertNotNull(sendingGauge);

        AlertServerMetrics.registerUncachedException(() -> 1);
        Gauge exceptionGauge = Metrics.globalRegistry.find("ds.alert.uncached.exception").gauge();
        assertNotNull(exceptionGauge);
    }
}
