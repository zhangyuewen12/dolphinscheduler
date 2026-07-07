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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.dao.TestReflectionUtils;
import org.apache.dolphinscheduler.dao.entity.TaskDefinition;
import org.apache.dolphinscheduler.dao.entity.TaskDefinitionLog;
import org.apache.dolphinscheduler.dao.entity.WorkflowDefinition;
import org.apache.dolphinscheduler.dao.entity.WorkflowTaskRelationLog;
import org.apache.dolphinscheduler.dao.mapper.TaskDefinitionLogMapper;
import org.apache.dolphinscheduler.dao.mapper.TaskDefinitionMapper;
import org.apache.dolphinscheduler.dao.mapper.WorkflowDefinitionMapper;
import org.apache.dolphinscheduler.dao.mapper.WorkflowTaskRelationLogMapper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class TaskDefinitionDaoImplTest {

    @Test
    void getTaskDefinitionListByDefinitionHandlesNullDefinition() throws Exception {
        TaskDefinitionMapper mapper = mock(TaskDefinitionMapper.class);
        TaskDefinitionDaoImpl dao = new TaskDefinitionDaoImpl(mapper);
        TestReflectionUtils.setField(dao, "workflowDefinitionMapper", mock(WorkflowDefinitionMapper.class));
        TestReflectionUtils.setField(dao, "workflowTaskRelationLogMapper", mock(WorkflowTaskRelationLogMapper.class));
        TestReflectionUtils.setField(dao, "taskDefinitionLogMapper", mock(TaskDefinitionLogMapper.class));

        List<TaskDefinition> result = dao.getTaskDefinitionListByDefinition(1L);
        assertEquals(0, result.size());
    }

    @Test
    void getTaskDefinitionListByDefinitionReturnsLogs() throws Exception {
        TaskDefinitionMapper mapper = mock(TaskDefinitionMapper.class);
        WorkflowDefinitionMapper workflowDefinitionMapper = mock(WorkflowDefinitionMapper.class);
        WorkflowTaskRelationLogMapper relationMapper = mock(WorkflowTaskRelationLogMapper.class);
        TaskDefinitionLogMapper logMapper = mock(TaskDefinitionLogMapper.class);

        WorkflowDefinition definition = new WorkflowDefinition();
        definition.setCode(1L);
        definition.setVersion(1);
        when(workflowDefinitionMapper.queryByCode(1L)).thenReturn(definition);

        WorkflowTaskRelationLog relation = new WorkflowTaskRelationLog();
        relation.setPostTaskCode(10L);
        relation.setPostTaskVersion(1);
        when(relationMapper.queryByWorkflowCodeAndVersion(1L, 1)).thenReturn(Arrays.asList(relation));

        TaskDefinitionLog log = new TaskDefinitionLog();
        when(logMapper.queryByTaskDefinitions(any())).thenReturn(Arrays.asList(log));

        TaskDefinitionDaoImpl dao = new TaskDefinitionDaoImpl(mapper);
        TestReflectionUtils.setField(dao, "workflowDefinitionMapper", workflowDefinitionMapper);
        TestReflectionUtils.setField(dao, "workflowTaskRelationLogMapper", relationMapper);
        TestReflectionUtils.setField(dao, "taskDefinitionLogMapper", logMapper);

        List<TaskDefinition> result = dao.getTaskDefinitionListByDefinition(1L);
        assertEquals(1, result.size());
    }

    @Test
    void queryByCodesHandlesEmptyAndDelegates() {
        TaskDefinitionMapper mapper = mock(TaskDefinitionMapper.class);
        TaskDefinitionDaoImpl dao = new TaskDefinitionDaoImpl(mapper);
        assertEquals(0, dao.queryByCodes(Collections.<Long>emptyList()).size());

        when(mapper.queryByCodeList(any())).thenReturn(Arrays.asList(new TaskDefinition()));
        assertEquals(1, dao.queryByCodes(Arrays.asList(1L)).size());
    }

    @Test
    void deleteByTaskDefinitionCodesSkipsEmpty() {
        TaskDefinitionMapper mapper = mock(TaskDefinitionMapper.class);
        TaskDefinitionDaoImpl dao = new TaskDefinitionDaoImpl(mapper);
        dao.deleteByTaskDefinitionCodes(Collections.<Long>emptySet());
        verify(mapper, org.mockito.Mockito.never()).deleteByBatchCodes(any());
    }

    @Test
    void deleteByWorkflowDefinitionCodeAndVersionDelegates() {
        TaskDefinitionMapper mapper = mock(TaskDefinitionMapper.class);
        TaskDefinitionDaoImpl dao = new TaskDefinitionDaoImpl(mapper);
        dao.deleteByWorkflowDefinitionCodeAndVersion(1L, 2);
        verify(mapper).deleteByWorkflowDefinitionCodeAndVersion(1L, 2);
    }

    @Test
    void findTaskDefinitionDelegatesToLogMapper() throws Exception {
        TaskDefinitionMapper mapper = mock(TaskDefinitionMapper.class);
        TaskDefinitionLogMapper logMapper = mock(TaskDefinitionLogMapper.class);
        TaskDefinitionLog definition = new TaskDefinitionLog();
        when(logMapper.queryByDefinitionCodeAndVersion(1L, 1)).thenReturn(definition);

        TaskDefinitionDaoImpl dao = new TaskDefinitionDaoImpl(mapper);
        TestReflectionUtils.setField(dao, "taskDefinitionLogMapper", logMapper);
        assertEquals(definition, dao.findTaskDefinition(1L, 1));
    }

    @Test
    void queryByCodeAndWorkerGroupsDelegate() {
        TaskDefinitionMapper mapper = mock(TaskDefinitionMapper.class);
        TaskDefinition definition = new TaskDefinition();
        when(mapper.queryByCode(1L)).thenReturn(definition);
        when(mapper.queryAllTaskDefinitionWorkerGroups(1L)).thenReturn(Arrays.asList("wg"));

        TaskDefinitionDaoImpl dao = new TaskDefinitionDaoImpl(mapper);
        assertEquals(definition, dao.queryByCode(1L));
        assertEquals(1, dao.queryAllTaskDefinitionWorkerGroups(1L).size());
    }
}
