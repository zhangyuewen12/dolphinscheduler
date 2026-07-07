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

package org.apache.dolphinscheduler.scheduler.quartz;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.scheduler.api.SchedulerException;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.quartz.JobKey;
import org.quartz.Scheduler;

class QuartzSchedulerTest {

    @Test
    void shouldThrowWhenDeleteReturnFalse() throws Exception {
        Scheduler scheduler = Mockito.mock(Scheduler.class);
        QuartzScheduler quartzScheduler = new QuartzScheduler(scheduler);
        JobKey jobKey = QuartzJobKey.of(1, 2).toJobKey();
        when(scheduler.checkExists(jobKey)).thenReturn(true);
        when(scheduler.deleteJob(jobKey)).thenReturn(false);

        assertThrows(SchedulerException.class, () -> quartzScheduler.deleteScheduleTask(1, 2));
    }

    @Test
    void shouldDelegateCheckScheduleTaskExists() throws Exception {
        Scheduler scheduler = Mockito.mock(Scheduler.class);
        QuartzScheduler quartzScheduler = new QuartzScheduler(scheduler);
        JobKey jobKey = QuartzJobKey.of(1, 2).toJobKey();
        when(scheduler.checkExists(jobKey)).thenReturn(true);

        assertTrue(quartzScheduler.checkScheduleTaskExists(1, 2));
        verify(scheduler).checkExists(jobKey);
    }
}
