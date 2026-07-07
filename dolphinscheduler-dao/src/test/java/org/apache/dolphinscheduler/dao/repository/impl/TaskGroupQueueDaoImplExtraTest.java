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

package org.apache.dolphinscheduler.dao.repository.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.common.enums.Flag;
import org.apache.dolphinscheduler.common.enums.TaskGroupQueueStatus;
import org.apache.dolphinscheduler.dao.entity.TaskGroupQueue;
import org.apache.dolphinscheduler.dao.mapper.TaskGroupQueueMapper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class TaskGroupQueueDaoImplExtraTest {

    @Test
    void deleteByWorkflowInstanceIdsSkipsEmpty() {
        TaskGroupQueueMapper mapper = mock(TaskGroupQueueMapper.class);
        TaskGroupQueueDaoImpl dao = new TaskGroupQueueDaoImpl(mapper);

        dao.deleteByWorkflowInstanceIds(null);
        dao.deleteByWorkflowInstanceIds(Collections.<Integer>emptyList());

        verify(mapper, never()).deleteByWorkflowInstanceIds(anyList());
    }

    @Test
    void deleteByWorkflowInstanceIdsDelegates() {
        TaskGroupQueueMapper mapper = mock(TaskGroupQueueMapper.class);
        TaskGroupQueueDaoImpl dao = new TaskGroupQueueDaoImpl(mapper);
        List<Integer> ids = Arrays.asList(1, 2);

        dao.deleteByWorkflowInstanceIds(ids);
        verify(mapper).deleteByWorkflowInstanceIds(ids);
    }

    @Test
    void queryMethodsPassExpectedFlags() {
        TaskGroupQueueMapper mapper = mock(TaskGroupQueueMapper.class);
        TaskGroupQueueDaoImpl dao = new TaskGroupQueueDaoImpl(mapper);

        List<TaskGroupQueue> queues = Arrays.asList(new TaskGroupQueue());
        when(mapper.queryAllTaskGroupQueueByInQueue(Flag.YES.getCode())).thenReturn(queues);
        when(mapper.queryInQueueTaskGroupQueue(Flag.YES.getCode(), 10, 20)).thenReturn(queues);
        when(mapper.queryAllInQueueTaskGroupQueueByGroupId(1, Flag.YES.getCode())).thenReturn(queues);
        when(mapper.queryByTaskInstanceId(3)).thenReturn(queues);
        when(mapper.queryUsingTaskGroupQueueByGroupId(1,
                TaskGroupQueueStatus.ACQUIRE_SUCCESS.getCode(),
                Flag.YES.getCode(),
                Flag.NO.getCode())).thenReturn(queues);
        when(mapper.countUsingTaskGroupQueueByGroupId(1,
                TaskGroupQueueStatus.ACQUIRE_SUCCESS.getCode(),
                Flag.YES.ordinal(),
                Flag.NO.getCode())).thenReturn(2);
        when(mapper.queryWaitNotifyForceStartTaskGroupQueue(
                Flag.YES.getCode(), Flag.YES.getCode(), 0, 10)).thenReturn(queues);

        assertEquals(queues, dao.queryAllInQueueTaskGroupQueue());
        assertEquals(queues, dao.queryInQueueTaskGroupQueue(10, 20));
        assertEquals(queues, dao.queryAllInQueueTaskGroupQueueByGroupId(1));
        assertEquals(queues, dao.queryByTaskInstanceId(3));
        assertEquals(queues, dao.queryAcquiredTaskGroupQueueByGroupId(1));
        assertEquals(2, dao.countUsingTaskGroupQueueByGroupId(1));
        assertEquals(queues, dao.queryWaitNotifyForceStartTaskGroupQueue(0, 10));

        verify(mapper).queryAllTaskGroupQueueByInQueue(Flag.YES.getCode());
        verify(mapper).queryInQueueTaskGroupQueue(Flag.YES.getCode(), 10, 20);
        verify(mapper).queryAllInQueueTaskGroupQueueByGroupId(1, Flag.YES.getCode());
        verify(mapper).queryByTaskInstanceId(3);
        verify(mapper).queryUsingTaskGroupQueueByGroupId(
                1,
                TaskGroupQueueStatus.ACQUIRE_SUCCESS.getCode(),
                Flag.YES.getCode(),
                Flag.NO.getCode());
        verify(mapper).countUsingTaskGroupQueueByGroupId(
                1,
                TaskGroupQueueStatus.ACQUIRE_SUCCESS.getCode(),
                Flag.YES.ordinal(),
                Flag.NO.getCode());
        verify(mapper).queryWaitNotifyForceStartTaskGroupQueue(
                Flag.YES.getCode(), Flag.YES.getCode(), 0, 10);
    }
}
