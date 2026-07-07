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
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.dao.entity.WorkflowDefinition;
import org.apache.dolphinscheduler.dao.mapper.WorkflowDefinitionMapper;
import org.apache.dolphinscheduler.dao.model.PageListingResult;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

class WorkflowDefinitionDaoImplTest {

    @Test
    void listingWorkflowDefinitionBuildsPageResult() {
        WorkflowDefinitionMapper mapper = mock(WorkflowDefinitionMapper.class);
        IPage<WorkflowDefinition> pageResult = mock(IPage.class);
        when(pageResult.getTotal()).thenReturn(2L);
        when(pageResult.getRecords()).thenReturn(Arrays.asList(new WorkflowDefinition(), new WorkflowDefinition()));
        when(mapper.queryDefineListPaging(any(Page.class), anyString(), anyInt(), anyLong()))
                .thenReturn(pageResult);

        WorkflowDefinitionDaoImpl dao = new WorkflowDefinitionDaoImpl(mapper);
        PageListingResult<WorkflowDefinition> result =
                dao.listingWorkflowDefinition(1, 2, "k", 1, 2L);
        assertEquals(2L, result.getTotalCount());
        assertEquals(1, result.getCurrentPage());
        assertEquals(2, result.getPageSize());
        assertEquals(2, result.getRecords().size());
    }

    @Test
    void queryByCodeAndDeleteDelegate() {
        WorkflowDefinitionMapper mapper = mock(WorkflowDefinitionMapper.class);
        WorkflowDefinition definition = new WorkflowDefinition();
        when(mapper.queryByCode(1L)).thenReturn(definition);
        WorkflowDefinitionDaoImpl dao = new WorkflowDefinitionDaoImpl(mapper);

        assertEquals(definition, dao.queryByCode(1L).get());
        dao.deleteByWorkflowDefinitionCode(1L);
        verify(mapper).deleteByCode(1L);
    }

    @Test
    void queryByCodesHandlesEmptyAndDelegates() {
        WorkflowDefinitionMapper mapper = mock(WorkflowDefinitionMapper.class);
        WorkflowDefinitionDaoImpl dao = new WorkflowDefinitionDaoImpl(mapper);
        assertEquals(0, dao.queryByCodes(Collections.<Long>emptyList()).size());

        when(mapper.queryByCodes(any())).thenReturn(Arrays.asList(new WorkflowDefinition()));
        assertEquals(1, dao.queryByCodes(Arrays.asList(1L)).size());
    }
}
