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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.common.enums.FailureStrategy;
import org.apache.dolphinscheduler.common.enums.Flag;
import org.apache.dolphinscheduler.common.enums.WorkflowExecutionStatus;
import org.apache.dolphinscheduler.dao.TestReflectionUtils;
import org.apache.dolphinscheduler.dao.entity.TaskInstance;
import org.apache.dolphinscheduler.dao.entity.WorkflowInstance;
import org.apache.dolphinscheduler.dao.mapper.TaskInstanceMapper;
import org.apache.dolphinscheduler.dao.mapper.WorkflowInstanceMapper;
import org.apache.dolphinscheduler.plugin.task.api.enums.TaskExecutionStatus;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class TaskInstanceDaoImplTest {

    @Test
    void upsertTaskInstanceUsesInsertWhenNoId() {
        TaskInstanceMapper mapper = mock(TaskInstanceMapper.class);
        when(mapper.insert(any(TaskInstance.class))).thenReturn(1);
        TaskInstanceDaoImpl dao = new TaskInstanceDaoImpl(mapper);
        TaskInstance taskInstance = new TaskInstance();
        assertTrue(dao.upsertTaskInstance(taskInstance));
    }

    @Test
    void upsertTaskInstanceUsesUpdateWhenHasId() {
        TaskInstanceMapper mapper = mock(TaskInstanceMapper.class);
        when(mapper.updateById(any(TaskInstance.class))).thenReturn(1);
        TaskInstanceDaoImpl dao = new TaskInstanceDaoImpl(mapper);
        TaskInstance taskInstance = new TaskInstance();
        taskInstance.setId(1);
        assertTrue(dao.upsertTaskInstance(taskInstance));
    }

    @Test
    void submitTaskInstanceSkipsWhenWorkflowFinished() {
        TaskInstanceMapper mapper = mock(TaskInstanceMapper.class);
        TaskInstanceDaoImpl dao = new TaskInstanceDaoImpl(mapper);
        TaskInstance task = new TaskInstance();
        WorkflowInstance workflowInstance = new WorkflowInstance();
        workflowInstance.setId(1);
        workflowInstance.setState(WorkflowExecutionStatus.SUCCESS);
        assertFalse(dao.submitTaskInstanceToDB(task, workflowInstance));
    }

    @Test
    void submitTaskInstanceSetsPauseWhenReadyPause() {
        TaskInstanceMapper mapper = mock(TaskInstanceMapper.class);
        when(mapper.insert(any(TaskInstance.class))).thenReturn(1);
        TaskInstanceDaoImpl dao = new TaskInstanceDaoImpl(mapper);
        TaskInstance task = new TaskInstance();
        WorkflowInstance workflowInstance = new WorkflowInstance();
        workflowInstance.setState(WorkflowExecutionStatus.READY_PAUSE);
        workflowInstance.setExecutorId(1);
        workflowInstance.setExecutorName("ex");
        workflowInstance.setFailureStrategy(FailureStrategy.CONTINUE);
        task.setState(TaskExecutionStatus.SUBMITTED_SUCCESS);
        assertTrue(dao.submitTaskInstanceToDB(task, workflowInstance));
        assertEquals(TaskExecutionStatus.PAUSE, task.getState());
        assertTrue(task.getSubmitTime() != null);
    }

    @Test
    void markTaskInstanceInvalidHandlesEmpty() {
        TaskInstanceMapper mapper = mock(TaskInstanceMapper.class);
        TaskInstanceDaoImpl dao = new TaskInstanceDaoImpl(mapper);
        dao.markTaskInstanceInvalid(Collections.<TaskInstance>emptyList());
        verify(mapper, org.mockito.Mockito.never()).updateById(any());
    }

    @Test
    void queryAndUpdateDelegateToMapper() throws Exception {
        TaskInstanceMapper mapper = mock(TaskInstanceMapper.class);
        WorkflowInstanceMapper workflowInstanceMapper = mock(WorkflowInstanceMapper.class);
        TaskInstanceDaoImpl dao = new TaskInstanceDaoImpl(mapper);
        TestReflectionUtils.setField(dao, "workflowInstanceMapper", workflowInstanceMapper);

        dao.queryValidTaskListByWorkflowInstanceId(1);
        verify(mapper).findValidTaskListByWorkflowInstanceId(1, Flag.YES);

        dao.queryByWorkflowInstanceIdAndTaskCode(1, 2L);
        verify(mapper).queryByInstanceIdAndCode(1, 2L);

        when(workflowInstanceMapper.selectById(1)).thenReturn(new WorkflowInstance());
        dao.queryPreviousTaskListByWorkflowInstanceId(1);
        verify(mapper).findValidTaskListByWorkflowInstanceId(1, Flag.NO);

        dao.deleteByWorkflowInstanceId(1);
        verify(mapper).deleteByWorkflowInstanceId(1);

        dao.queryByWorkflowInstanceId(1);
        verify(mapper).findByWorkflowInstanceId(1);

        dao.queryLastTaskInstanceListIntervalInWorkflowInstance(1, Collections.<Long>emptySet());
        verify(mapper).findLastTaskInstances(1, Collections.<Long>emptySet());

        dao.queryLastTaskInstanceIntervalInWorkflowInstance(1, 3L);
        verify(mapper).findLastTaskInstance(1, 3L);

        dao.updateTaskInstanceState(1, TaskExecutionStatus.SUBMITTED_SUCCESS, TaskExecutionStatus.FAILURE);
        verify(mapper).updateTaskInstanceState(1, TaskExecutionStatus.SUBMITTED_SUCCESS.getCode(),
                TaskExecutionStatus.FAILURE.getCode());
    }

    @Test
    void submitTaskInstanceRespectsFailureStrategy() {
        TaskInstanceMapper mapper = mock(TaskInstanceMapper.class);
        when(mapper.insert(any(TaskInstance.class))).thenReturn(1);
        TaskInstanceDaoImpl dao = new TaskInstanceDaoImpl(mapper);

        TaskInstance task = new TaskInstance();
        task.setWorkflowInstanceId(1);
        task.setState(TaskExecutionStatus.SUBMITTED_SUCCESS);
        WorkflowInstance workflowInstance = new WorkflowInstance();
        workflowInstance.setState(WorkflowExecutionStatus.RUNNING_EXECUTION);
        workflowInstance.setFailureStrategy(FailureStrategy.END);

        TaskInstance failed = new TaskInstance();
        failed.setState(TaskExecutionStatus.FAILURE);
        failed.setRetryTimes(1);
        failed.setMaxRetryTimes(1);
        when(mapper.findValidTaskListByWorkflowInstanceId(1, Flag.YES)).thenReturn(Arrays.asList(failed));

        boolean result = dao.submitTaskInstanceToDB(task, workflowInstance);
        assertTrue(result);
        assertEquals(TaskExecutionStatus.KILL, task.getState());
        assertTrue(task.getFirstSubmitTime() != null);
    }
}
