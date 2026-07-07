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
import org.apache.dolphinscheduler.flink.monitor.entity.MonitorInstance;
import org.apache.dolphinscheduler.flink.monitor.mapper.MonitorInstanceMapper;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class MonitorInstanceService {

    private static final Logger logger = LoggerFactory.getLogger(MonitorInstanceService.class);

    private final FlinkMonitorProperties properties;

    private final MonitorInstanceMapper monitorInstanceMapper;

    private final String instanceId;

    private final String host;

    public MonitorInstanceService(FlinkMonitorProperties properties,
                                  MonitorInstanceMapper monitorInstanceMapper) {
        this.properties = properties;
        this.monitorInstanceMapper = monitorInstanceMapper;
        this.host = resolveHost();
        this.instanceId = resolveInstanceId(properties.getInstanceId(), host);
    }

    public String getInstanceId() {
        return instanceId;
    }

    @Scheduled(fixedDelayString = "${flink.monitor.heartbeat-interval-millis:10000}")
    public void heartbeat() {
        Date now = new Date();
        MonitorInstance instance = new MonitorInstance(instanceId, host, now);
        int updated = monitorInstanceMapper.updateHeartbeat(instance);
        if (updated > 0) {
            return;
        }
        try {
            monitorInstanceMapper.insertInstance(instance);
        } catch (DuplicateKeyException duplicateKeyException) {
            monitorInstanceMapper.updateHeartbeat(instance);
        }
        logger.debug("Refresh flink monitor instance heartbeat, instanceId: {}", instanceId);
    }

    public List<String> queryAliveInstanceIds() {
        long ttlMillis = properties.getInstanceTtlSeconds() * 1000L;
        Date cutoffTime = new Date(System.currentTimeMillis() - ttlMillis);
        return monitorInstanceMapper.queryAliveInstanceIds(cutoffTime);
    }

    private String resolveInstanceId(String configuredInstanceId, String host) {
        if (StringUtils.hasText(configuredInstanceId)) {
            return configuredInstanceId;
        }
        return host + "-" + UUID.randomUUID();
    }

    private String resolveHost() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            return "unknown-host";
        }
    }
}
