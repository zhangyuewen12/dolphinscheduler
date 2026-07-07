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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.common.enums.WorkflowExecutionStatus;
import org.apache.dolphinscheduler.dao.TestReflectionUtils;
import org.apache.dolphinscheduler.dao.entity.WorkflowInstance;
import org.apache.dolphinscheduler.dao.entity.WorkflowInstanceRelation;
import org.apache.dolphinscheduler.dao.mapper.WorkflowInstanceMapper;
import org.apache.dolphinscheduler.dao.mapper.WorkflowInstanceRelationMapper;
import org.apache.dolphinscheduler.plugin.task.api.model.DateInterval;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

class WorkflowInstanceDaoImplExtraTest {

    @Test
    void upsertWorkflowInstanceInsertOrUpdate() {
        WorkflowInstanceMapper mapper = mock(WorkflowInstanceMapper.class);
        WorkflowInstanceDaoImpl dao = new WorkflowInstanceDaoImpl(mapper);

        WorkflowInstance insertInstance = new WorkflowInstance();
        when(mapper.insert(insertInstance)).thenReturn(1);
        dao.upsertWorkflowInstance(insertInstance);
        verify(mapper).insert(insertInstance);

        WorkflowInstance updateInstance = new WorkflowInstance();
        updateInstance.setId(1);
        when(mapper.updateById(updateInstance)).thenReturn(1);
        dao.upsertWorkflowInstance(updateInstance);
        verify(mapper).updateById(updateInstance);
    }

    @Test
    void updateWorkflowInstanceStateThrowsWhenMissing() {
        WorkflowInstanceMapper mapper = mock(WorkflowInstanceMapper.class);
        when(mapper.updateWorkflowInstanceState(anyInt(), any(), any())).thenReturn(0);
        when(mapper.selectById(1)).thenReturn(null);
        WorkflowInstanceDaoImpl dao = new WorkflowInstanceDaoImpl(mapper);

        UnsupportedOperationException ex = assertThrows(UnsupportedOperationException.class,
                () -> dao.updateWorkflowInstanceState(1, WorkflowExecutionStatus.RUNNING_EXECUTION,
                        WorkflowExecutionStatus.SUCCESS));
        assertEquals("updateWorkflowInstance 1 state failed, the workflow instance is not exist in db",
                ex.getMessage());
    }

    @Test
    void updateWorkflowInstanceStateThrowsWithActualState() {
        WorkflowInstanceMapper mapper = mock(WorkflowInstanceMapper.class);
        when(mapper.updateWorkflowInstanceState(anyInt(), any(), any())).thenReturn(0);
        WorkflowInstance instance = new WorkflowInstance();
        instance.setId(1);
        instance.setState(WorkflowExecutionStatus.FAILURE);
        when(mapper.selectById(1)).thenReturn(instance);
        WorkflowInstanceDaoImpl dao = new WorkflowInstanceDaoImpl(mapper);

        UnsupportedOperationException ex = assertThrows(UnsupportedOperationException.class,
                () -> dao.updateWorkflowInstanceState(1, WorkflowExecutionStatus.RUNNING_EXECUTION,
                        WorkflowExecutionStatus.SUCCESS));
        assertEquals(
                "updateWorkflowInstance 1 state failed, expect original state is RUNNING_EXECUTION actual state is : {} FAILURE",
                ex.getMessage());
    }

    @Test
    void queryIntervalsDelegateToMapper() {
        WorkflowInstanceMapper mapper = mock(WorkflowInstanceMapper.class);
        WorkflowInstance instance = new WorkflowInstance();
        DateInterval interval = new DateInterval(new Date(0L), new Date(1000L));
        when(mapper.queryLastSchedulerWorkflow(anyLong(), anyLong(), any(), any())).thenReturn(instance);
        when(mapper.queryLastManualWorkflow(anyLong(), anyLong(), any(), any())).thenReturn(instance);
        when(mapper.queryLastRunningWorkflow(anyLong(), any(), any(), any(int[].class))).thenReturn(instance);

        WorkflowInstanceDaoImpl dao = new WorkflowInstanceDaoImpl(mapper);
        assertEquals(instance, dao.queryLastSchedulerWorkflowInterval(1L, 2L, interval));
        assertEquals(instance, dao.queryLastManualWorkflowInterval(1L, 2L, interval));
        assertEquals(instance, dao.queryLastRunningWorkflowInterval(1L, interval));
    }

    @Test
    void queryFirstAndFailoverDelegateToMapper() {
        WorkflowInstanceMapper mapper = mock(WorkflowInstanceMapper.class);
        WorkflowInstance instance = new WorkflowInstance();
        when(mapper.queryFirstScheduleWorkflowInstance(1L)).thenReturn(instance);
        when(mapper.queryFirstStartWorkflowInstance(1L)).thenReturn(instance);
        when(mapper.queryNeedFailoverWorkflowInstanceHost(any(int[].class)))
                .thenReturn(Arrays.asList("host"));
        when(mapper.queryByHostAndStatus("host", WorkflowExecutionStatus.NEED_FAILOVER_STATES))
                .thenReturn(Arrays.asList(instance));

        WorkflowInstanceDaoImpl dao = new WorkflowInstanceDaoImpl(mapper);
        assertEquals(instance, dao.queryFirstScheduleWorkflowInstance(1L));
        assertEquals(instance, dao.queryFirstStartWorkflowInstance(1L));
        List<String> hosts = dao.queryNeedFailoverMasters();
        assertEquals(1, hosts.size());
        List<WorkflowInstance> instances = dao.queryNeedFailoverWorkflowInstances("host");
        assertEquals(1, instances.size());
    }

    @Test
    void querySubWorkflowInstanceByParentIdHandlesMissingRelation() throws Exception {
        WorkflowInstanceMapper mapper = mock(WorkflowInstanceMapper.class);
        WorkflowInstanceRelationMapper relationMapper = mock(WorkflowInstanceRelationMapper.class);
        WorkflowInstanceDaoImpl dao = new WorkflowInstanceDaoImpl(mapper);
        TestReflectionUtils.setField(dao, "workflowInstanceRelationMapper", relationMapper);

        when(relationMapper.queryByParentId(1, 2)).thenReturn(null);
        assertNull(dao.querySubWorkflowInstanceByParentId(1, 2));

        WorkflowInstanceRelation relation = new WorkflowInstanceRelation();
        relation.setWorkflowInstanceId(0);
        when(relationMapper.queryByParentId(1, 2)).thenReturn(relation);
        assertNull(dao.querySubWorkflowInstanceByParentId(1, 2));

        relation.setWorkflowInstanceId(3);
        WorkflowInstance instance = new WorkflowInstance();
        when(mapper.selectById(3)).thenReturn(instance);
        assertEquals(instance, dao.querySubWorkflowInstanceByParentId(1, 2));
    }
}
