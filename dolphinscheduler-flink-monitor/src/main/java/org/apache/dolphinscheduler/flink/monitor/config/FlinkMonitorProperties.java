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

package org.apache.dolphinscheduler.flink.monitor.config;

import java.util.Arrays;
import java.util.List;

public class FlinkMonitorProperties {

    private String instanceId;

    private long heartbeatIntervalMillis = 10_000L;

    private long monitorIntervalMillis = 15_000L;

    private int instanceTtlSeconds = 60;

    private int idStep = 1;

    private int fetchSize = 50;

    private int leaseSeconds = 30;

    private List<String> monitorStatuses = Arrays.asList("RUNNING", "SUBMITTED");

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public long getHeartbeatIntervalMillis() {
        return heartbeatIntervalMillis;
    }

    public void setHeartbeatIntervalMillis(long heartbeatIntervalMillis) {
        this.heartbeatIntervalMillis = heartbeatIntervalMillis;
    }

    public long getMonitorIntervalMillis() {
        return monitorIntervalMillis;
    }

    public void setMonitorIntervalMillis(long monitorIntervalMillis) {
        this.monitorIntervalMillis = monitorIntervalMillis;
    }

    public int getInstanceTtlSeconds() {
        return instanceTtlSeconds;
    }

    public void setInstanceTtlSeconds(int instanceTtlSeconds) {
        this.instanceTtlSeconds = instanceTtlSeconds;
    }

    public int getIdStep() {
        return idStep;
    }

    public void setIdStep(int idStep) {
        this.idStep = idStep;
    }

    public int getFetchSize() {
        return fetchSize;
    }

    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }

    public int getLeaseSeconds() {
        return leaseSeconds;
    }

    public void setLeaseSeconds(int leaseSeconds) {
        this.leaseSeconds = leaseSeconds;
    }

    public List<String> getMonitorStatuses() {
        return monitorStatuses;
    }

    public void setMonitorStatuses(List<String> monitorStatuses) {
        this.monitorStatuses = monitorStatuses;
    }
}
