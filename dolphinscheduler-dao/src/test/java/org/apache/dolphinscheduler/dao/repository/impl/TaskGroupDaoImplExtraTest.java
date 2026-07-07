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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.dao.entity.TaskGroup;
import org.apache.dolphinscheduler.dao.mapper.TaskGroupMapper;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TaskGroupDaoImplExtraTest {

    @Test
    void queryMethodsDelegateToMapper() {
        TaskGroupMapper mapper = mock(TaskGroupMapper.class);
        TaskGroupDaoImpl dao = new TaskGroupDaoImpl(mapper);
        List<TaskGroup> groups = Arrays.asList(new TaskGroup(), new TaskGroup());
        when(mapper.selectList(null)).thenReturn(groups);
        when(mapper.queryUsedTaskGroups()).thenReturn(groups);
        when(mapper.queryAvailableTaskGroups()).thenReturn(groups);

        assertEquals(groups, dao.queryAllTaskGroups());
        assertEquals(groups, dao.queryUsedTaskGroups());
        assertEquals(groups, dao.queryAvailableTaskGroups());

        verify(mapper).selectList(null);
        verify(mapper).queryUsedTaskGroups();
        verify(mapper).queryAvailableTaskGroups();
    }

    @Test
    void acquireTaskGroupSlotValidatesIdAndDelegates() {
        TaskGroupMapper mapper = mock(TaskGroupMapper.class);
        TaskGroupDaoImpl dao = new TaskGroupDaoImpl(mapper);

        assertThrows(IllegalArgumentException.class, () -> dao.acquireTaskGroupSlot(null));

        when(mapper.acquireTaskGroupSlot(1)).thenReturn(1);
        assertTrue(dao.acquireTaskGroupSlot(1));

        when(mapper.acquireTaskGroupSlot(2)).thenReturn(0);
        assertFalse(dao.acquireTaskGroupSlot(2));
    }

    @Test
    void releaseTaskGroupSlotValidatesIdAndDelegates() {
        TaskGroupMapper mapper = mock(TaskGroupMapper.class);
        TaskGroupDaoImpl dao = new TaskGroupDaoImpl(mapper);

        assertThrows(IllegalArgumentException.class, () -> dao.releaseTaskGroupSlot(null));

        when(mapper.releaseTaskGroupSlot(1)).thenReturn(1);
        assertTrue(dao.releaseTaskGroupSlot(1));

        when(mapper.releaseTaskGroupSlot(2)).thenReturn(0);
        assertFalse(dao.releaseTaskGroupSlot(2));
    }
}
