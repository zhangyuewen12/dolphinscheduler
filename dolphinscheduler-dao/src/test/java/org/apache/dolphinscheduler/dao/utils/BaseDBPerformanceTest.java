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

package org.apache.dolphinscheduler.dao.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.dolphinscheduler.dao.entity.MonitorRecord;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class BaseDBPerformanceTest {

    @Test
    void getMonitorRecordReturnsRecordFromSubclass() {
        MonitorRecord record = new MonitorRecord();
        TestDBPerformance performance = new TestDBPerformance(record);

        MonitorRecord result = performance.getMonitorRecord(null);
        assertEquals(record, result);
    }

    private static class TestDBPerformance extends BaseDBPerformance {

        private final MonitorRecord record;

        private TestDBPerformance(MonitorRecord record) {
            this.record = record;
        }

        @Override
        protected MonitorRecord getMonitorRecord(Connection conn) {
            return record;
        }
    }
}
