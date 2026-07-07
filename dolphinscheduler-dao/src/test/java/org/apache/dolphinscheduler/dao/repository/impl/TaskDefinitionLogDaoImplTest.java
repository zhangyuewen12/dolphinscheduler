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
import org.apache.dolphinscheduler.dao.entity.TaskDefinitionLog;
import org.apache.dolphinscheduler.dao.entity.WorkflowTaskRelation;
import org.apache.dolphinscheduler.dao.entity.WorkflowTaskRelationLog;
import org.apache.dolphinscheduler.dao.mapper.TaskDefinitionLogMapper;
import org.apache.dolphinscheduler.dao.mapper.WorkflowTaskRelationLogMapper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class TaskDefinitionLogDaoImplTest {

    @Test
    void queryByWorkflowDefinitionCodeAndVersionDelegates() throws Exception {
        TaskDefinitionLogMapper logMapper = mock(TaskDefinitionLogMapper.class);
        WorkflowTaskRelationLogMapper relationLogMapper = mock(WorkflowTaskRelationLogMapper.class);

        WorkflowTaskRelationLog relation = new WorkflowTaskRelationLog();
        relation.setPostTaskCode(1L);
        relation.setPostTaskVersion(1);
        when(relationLogMapper.queryByWorkflowCodeAndVersion(1L, 1))
                .thenReturn(Arrays.asList(relation));

        TaskDefinitionLog log = new TaskDefinitionLog();
        when(logMapper.queryByTaskDefinitions(any())).thenReturn(Arrays.asList(log));

        TaskDefinitionLogDaoImpl dao = new TaskDefinitionLogDaoImpl(logMapper);
        TestReflectionUtils.setField(dao, "workflowTaskRelationLogMapper", relationLogMapper);

        List<TaskDefinitionLog> result = dao.queryByWorkflowDefinitionCodeAndVersion(1L, 1);
        assertEquals(1, result.size());
    }

    @Test
    void queryTaskDefineLogListHandlesEmpty() {
        TaskDefinitionLogMapper logMapper = mock(TaskDefinitionLogMapper.class);
        TaskDefinitionLogDaoImpl dao = new TaskDefinitionLogDaoImpl(logMapper);
        assertEquals(0, dao.queryTaskDefineLogList(Collections.<WorkflowTaskRelation>emptyList()).size());
    }

    @Test
    void deleteByTaskDefinitionCodesSkipsEmpty() {
        TaskDefinitionLogMapper logMapper = mock(TaskDefinitionLogMapper.class);
        TaskDefinitionLogDaoImpl dao = new TaskDefinitionLogDaoImpl(logMapper);
        dao.deleteByTaskDefinitionCodes(Collections.<Long>emptySet());
        verify(logMapper, org.mockito.Mockito.never()).deleteByTaskDefinitionCodes(any());
    }

    @Test
    void queryTaskDefineLogListFiltersPostTasks() {
        TaskDefinitionLogMapper logMapper = mock(TaskDefinitionLogMapper.class);
        TaskDefinitionLogDaoImpl dao = new TaskDefinitionLogDaoImpl(logMapper);
        WorkflowTaskRelation relation = new WorkflowTaskRelation();
        relation.setPostTaskCode(2L);
        relation.setPostTaskVersion(1);
        TaskDefinitionLog log = new TaskDefinitionLog();
        when(logMapper.queryByTaskDefinitions(any())).thenReturn(Arrays.asList(log));
        assertEquals(1, dao.queryTaskDefineLogList(Arrays.asList(relation)).size());
    }
}
