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

package org.apache.dolphinscheduler.flink.monitor.entity;

import java.util.Date;

public class FlinkJobRecord {

    private Long id;

    private String flinkJobId;

    private String jobName;

    private String flinkRestUrl;

    private String status;

    private String monitorOwner;

    private Date monitorLeaseExpireTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlinkJobId() {
        return flinkJobId;
    }

    public void setFlinkJobId(String flinkJobId) {
        this.flinkJobId = flinkJobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getFlinkRestUrl() {
        return flinkRestUrl;
    }

    public void setFlinkRestUrl(String flinkRestUrl) {
        this.flinkRestUrl = flinkRestUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMonitorOwner() {
        return monitorOwner;
    }

    public void setMonitorOwner(String monitorOwner) {
        this.monitorOwner = monitorOwner;
    }

    public Date getMonitorLeaseExpireTime() {
        return monitorLeaseExpireTime;
    }

    public void setMonitorLeaseExpireTime(Date monitorLeaseExpireTime) {
        this.monitorLeaseExpireTime = monitorLeaseExpireTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
