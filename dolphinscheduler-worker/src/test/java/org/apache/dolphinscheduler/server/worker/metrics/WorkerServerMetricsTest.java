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

package org.apache.dolphinscheduler.server.worker.metrics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import io.micrometer.core.instrument.DistributionSummary;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Timer;

class WorkerServerMetricsTest {

    @Test
    void countersIncrease() {
        double beforeOverload = Metrics.globalRegistry.get("ds.worker.overload.count").counter().count();
        WorkerServerMetrics.incWorkerOverloadCount();
        double afterOverload = Metrics.globalRegistry.get("ds.worker.overload.count").counter().count();
        assertEquals(beforeOverload + 1, afterOverload, 0.0001);

        double beforeSuccess = Metrics.globalRegistry.get("ds.worker.resource.download.count")
                .tag("status", "success").counter().count();
        WorkerServerMetrics.incWorkerResourceDownloadSuccessCount();
        double afterSuccess = Metrics.globalRegistry.get("ds.worker.resource.download.count")
                .tag("status", "success").counter().count();
        assertEquals(beforeSuccess + 1, afterSuccess, 0.0001);

        double beforeFail = Metrics.globalRegistry.get("ds.worker.resource.download.count")
                .tag("status", "fail").counter().count();
        WorkerServerMetrics.incWorkerResourceDownloadFailureCount();
        double afterFail = Metrics.globalRegistry.get("ds.worker.resource.download.count")
                .tag("status", "fail").counter().count();
        assertEquals(beforeFail + 1, afterFail, 0.0001);

        double beforeHeartbeat = Metrics.globalRegistry.get("ds.worker.heartbeat.count").counter().count();
        WorkerServerMetrics.incWorkerHeartbeatCount();
        double afterHeartbeat = Metrics.globalRegistry.get("ds.worker.heartbeat.count").counter().count();
        assertEquals(beforeHeartbeat + 1, afterHeartbeat, 0.0001);
    }

    @Test
    void timersAndSummariesRecord() {
        Timer timer = Metrics.globalRegistry.get("ds.worker.resource.download.duration").timer();
        long beforeCount = timer.count();
        WorkerServerMetrics.recordWorkerResourceDownloadTime(15);
        assertEquals(beforeCount + 1, timer.count());

        DistributionSummary summary = Metrics.globalRegistry.get("ds.worker.resource.download.size").summary();
        long beforeSummaryCount = summary.count();
        WorkerServerMetrics.recordWorkerResourceDownloadSize(1024);
        assertEquals(beforeSummaryCount + 1, summary.count());
    }

    @Test
    void gaugesAreRegistered() {
        WorkerServerMetrics.registerWorkerTaskTotalGauge(() -> 5);
        WorkerServerMetrics.registerWorkerExecuteQueueSizeGauge(() -> 2);
        WorkerServerMetrics.registerWorkerActiveExecuteThreadGauge(() -> 1);
        WorkerServerMetrics.registerWorkerMemoryAvailableGauge(() -> 3);
        WorkerServerMetrics.registerWorkerCpuUsageGauge(() -> 0.5);
        WorkerServerMetrics.registerWorkerMemoryUsageGauge(() -> 0.4);
        WorkerServerMetrics.registerUncachedException(() -> 0);

        assertNotNull(Metrics.globalRegistry.find("ds.worker.task").gauge());
        assertNotNull(Metrics.globalRegistry.find("ds.worker.execute.queue.size").gauge());
        assertNotNull(Metrics.globalRegistry.find("ds.worker.active.execute.thread").gauge());
        assertNotNull(Metrics.globalRegistry.find("ds.worker.memory.available").gauge());
        assertNotNull(Metrics.globalRegistry.find("ds.worker.cpu.usage").gauge());
        assertNotNull(Metrics.globalRegistry.find("ds.worker.memory.usage").gauge());
        assertNotNull(Metrics.globalRegistry.find("ds.worker.uncached.exception").gauge());
    }
}
