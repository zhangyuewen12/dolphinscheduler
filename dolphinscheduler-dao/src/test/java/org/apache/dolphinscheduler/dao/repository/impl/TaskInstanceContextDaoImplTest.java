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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.common.enums.ContextType;
import org.apache.dolphinscheduler.dao.entity.DependentResultTaskInstanceContext;
import org.apache.dolphinscheduler.dao.entity.TaskInstanceContext;
import org.apache.dolphinscheduler.dao.mapper.TaskInstanceContextMapper;
import org.apache.dolphinscheduler.plugin.task.api.enums.DependResult;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class TaskInstanceContextDaoImplTest {

    @Test
    void queryListByTaskInstanceIdHandlesNull() {
        TaskInstanceContextMapper mapper = mock(TaskInstanceContextMapper.class);
        TaskInstanceContextDaoImpl dao = new TaskInstanceContextDaoImpl(mapper);
        assertEquals(0, dao.queryListByTaskInstanceIdAndContextType(null, ContextType.DEPENDENT_RESULT_CONTEXT).size());
    }

    @Test
    void deleteByTaskInstanceIdRejectsNull() {
        TaskInstanceContextMapper mapper = mock(TaskInstanceContextMapper.class);
        TaskInstanceContextDaoImpl dao = new TaskInstanceContextDaoImpl(mapper);
        assertThrows(IllegalArgumentException.class,
                () -> dao.deleteByTaskInstanceIdAndContextType(null, ContextType.DEPENDENT_RESULT_CONTEXT));
    }

    @Test
    void upsertTaskInstanceContextInsertsWhenAbsent() {
        TaskInstanceContextMapper mapper = mock(TaskInstanceContextMapper.class);
        TaskInstanceContextDaoImpl dao = new TaskInstanceContextDaoImpl(mapper);

        TaskInstanceContext context = new TaskInstanceContext();
        context.setTaskInstanceId(1);
        context.setContextType(ContextType.DEPENDENT_RESULT_CONTEXT);
        context.setTaskInstanceContext(Collections.singletonList(newContext("a")));

        when(mapper.queryListByTaskInstanceIdAndContextType(1, ContextType.DEPENDENT_RESULT_CONTEXT))
                .thenReturn(Collections.<TaskInstanceContext>emptyList());
        when(mapper.insert(context)).thenReturn(1);

        assertEquals(1, dao.upsertTaskInstanceContext(context));
    }

    @Test
    void upsertTaskInstanceContextUpdatesAndDeduplicates() {
        TaskInstanceContextMapper mapper = mock(TaskInstanceContextMapper.class);
        TaskInstanceContextDaoImpl dao = new TaskInstanceContextDaoImpl(mapper);

        TaskInstanceContext existing = new TaskInstanceContext();
        existing.setTaskInstanceId(1);
        existing.setContextType(ContextType.DEPENDENT_RESULT_CONTEXT);
        existing.setTaskInstanceContext(Collections.singletonList(newContext("same")));

        TaskInstanceContext incoming = new TaskInstanceContext();
        incoming.setTaskInstanceId(1);
        incoming.setContextType(ContextType.DEPENDENT_RESULT_CONTEXT);
        incoming.setTaskInstanceContext(Arrays.asList(newContext("same"), newContext("new")));

        when(mapper.queryListByTaskInstanceIdAndContextType(1, ContextType.DEPENDENT_RESULT_CONTEXT))
                .thenReturn(Arrays.asList(existing));
        when(mapper.updateById(any(TaskInstanceContext.class))).thenReturn(1);

        assertEquals(1, dao.upsertTaskInstanceContext(incoming));
        verify(mapper).updateById(any(TaskInstanceContext.class));
    }

    @Test
    void batchQueryByTaskInstanceIdsHandlesEmpty() {
        TaskInstanceContextMapper mapper = mock(TaskInstanceContextMapper.class);
        TaskInstanceContextDaoImpl dao = new TaskInstanceContextDaoImpl(mapper);
        assertEquals(0, dao.batchQueryByTaskInstanceIdsAndContextType(Collections.<Integer>emptyList(),
                ContextType.DEPENDENT_RESULT_CONTEXT).size());
    }

    private DependentResultTaskInstanceContext newContext(String dateCycle) {
        DependentResultTaskInstanceContext ctx = new DependentResultTaskInstanceContext();
        ctx.setContextType(ContextType.DEPENDENT_RESULT_CONTEXT);
        ctx.setProjectCode(1L);
        ctx.setWorkflowDefinitionCode(2L);
        ctx.setTaskDefinitionCode(3L);
        ctx.setDateCycle(dateCycle);
        ctx.setDependentResult(DependResult.SUCCESS);
        return ctx;
    }
}
