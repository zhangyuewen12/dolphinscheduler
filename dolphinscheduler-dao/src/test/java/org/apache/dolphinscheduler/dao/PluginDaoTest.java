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

package org.apache.dolphinscheduler.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.dao.entity.PluginDefine;
import org.apache.dolphinscheduler.dao.mapper.PluginDefineMapper;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PluginDaoTest {

    @Mock
    private PluginDefineMapper pluginDefineMapper;

    @InjectMocks
    private PluginDao pluginDao;

    @Test
    void checkPluginDefineTableExist_returnsTrueWhenTableExists() {
        when(pluginDefineMapper.checkTableExist()).thenReturn(1);

        assertTrue(pluginDao.checkPluginDefineTableExist());
    }

    @Test
    void checkPluginDefineTableExist_returnsFalseWhenTableMissing() {
        when(pluginDefineMapper.checkTableExist()).thenReturn(0);

        assertFalse(pluginDao.checkPluginDefineTableExist());
    }

    @Test
    void addOrUpdatePluginDefine_insertsWhenNotExist() {
        PluginDefine pluginDefine = new PluginDefine("pluginA", "TASK", "{}");
        pluginDefine.setId(7);

        when(pluginDefineMapper.queryByNameAndType("pluginA", "TASK")).thenReturn(null);
        when(pluginDefineMapper.insert(pluginDefine)).thenReturn(1);

        int result = pluginDao.addOrUpdatePluginDefine(pluginDefine);

        assertEquals(7, result);
        verify(pluginDefineMapper, never()).updateById(any());
    }

    @Test
    void addOrUpdatePluginDefine_updatesParamsWhenChanged() {
        PluginDefine existing = new PluginDefine("pluginA", "TASK", "{\"k\":1}");
        existing.setId(10);

        PluginDefine incoming = new PluginDefine("pluginA", "TASK", "{\"k\":2}");
        incoming.setUpdateTime(new Date(123456789L));

        when(pluginDefineMapper.queryByNameAndType("pluginA", "TASK")).thenReturn(existing);

        int result = pluginDao.addOrUpdatePluginDefine(incoming);

        assertEquals(10, result);
        ArgumentCaptor<PluginDefine> captor = ArgumentCaptor.forClass(PluginDefine.class);
        verify(pluginDefineMapper).updateById(captor.capture());
        PluginDefine updated = captor.getValue();
        assertEquals("{\"k\":2}", updated.getPluginParams());
        assertEquals(new Date(123456789L), updated.getUpdateTime());
    }
}
