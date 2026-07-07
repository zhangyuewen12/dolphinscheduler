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

package org.apache.dolphinscheduler.flink.monitor.service;

import org.apache.dolphinscheduler.flink.monitor.config.FlinkMonitorProperties;
import org.apache.dolphinscheduler.flink.monitor.entity.FlinkJobRecord;
import org.apache.dolphinscheduler.flink.monitor.mapper.FlinkJobRecordMapper;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlinkJobMonitorScheduler {

    private static final Logger logger = LoggerFactory.getLogger(FlinkJobMonitorScheduler.class);

    private final FlinkMonitorProperties properties;

    private final MonitorInstanceService monitorInstanceService;

    private final SlotService slotService;

    private final FlinkJobRecordMapper flinkJobRecordMapper;

    private final FlinkJobStatusClient flinkJobStatusClient;

    public FlinkJobMonitorScheduler(FlinkMonitorProperties properties,
                                    MonitorInstanceService monitorInstanceService,
                                    SlotService slotService,
                                    FlinkJobRecordMapper flinkJobRecordMapper,
                                    FlinkJobStatusClient flinkJobStatusClient) {
        this.properties = properties;
        this.monitorInstanceService = monitorInstanceService;
        this.slotService = slotService;
        this.flinkJobRecordMapper = flinkJobRecordMapper;
        this.flinkJobStatusClient = flinkJobStatusClient;
    }

    @Scheduled(fixedDelayString = "${flink.monitor.monitor-interval-millis:15000}")
    public void monitorJobs() {
        Optional<Slot> currentSlot = slotService.getCurrentSlot();
        if (!currentSlot.isPresent()) {
            logger.warn("Current flink monitor instance is not in alive instance list, instanceId: {}",
                    monitorInstanceService.getInstanceId());
            return;
        }

        Slot slot = currentSlot.get();
        List<FlinkJobRecord> jobRecords = flinkJobRecordMapper.queryByIdSlot(
                slot.getCurrentSlotIndex(),
                slot.getTotalSlot(),
                properties.getIdStep(),
                properties.getFetchSize(),
                properties.getMonitorStatuses());

        logger.debug("[Slot-{}/{}] Fetch {} flink jobs.",
                slot.getCurrentSlotIndex(), slot.getTotalSlot(), jobRecords.size());

        for (FlinkJobRecord jobRecord : jobRecords) {
            monitorOneJob(jobRecord);
        }
    }

    @Transactional
    public void monitorOneJob(FlinkJobRecord jobRecord) {
        Date now = new Date();
        Date leaseExpireTime = new Date(now.getTime() + properties.getLeaseSeconds() * 1000L);
        int acquired = flinkJobRecordMapper.acquireLease(
                jobRecord.getId(),
                monitorInstanceService.getInstanceId(),
                now,
                leaseExpireTime);
        if (acquired <= 0) {
            logger.debug("Skip flink job due to active monitor lease, jobRecordId: {}", jobRecord.getId());
            return;
        }

        String latestStatus = flinkJobStatusClient.queryJobStatus(jobRecord);
        if (latestStatus != null && !latestStatus.equals(jobRecord.getStatus())) {
            flinkJobRecordMapper.updateStatus(jobRecord.getId(), latestStatus, new Date());
        }
    }
}
