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

package org.apache.dolphinscheduler.alert.plugin;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.dao.PluginDao;
import org.apache.dolphinscheduler.dao.entity.PluginDefine;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

class AlertPluginManagerTest {

    @Test
    void startRegistersPluginsFromSpi() {
        PluginDao pluginDao = mock(PluginDao.class);
        when(pluginDao.checkPluginDefineTableExist()).thenReturn(true);

        AtomicInteger idGenerator = new AtomicInteger(1);
        when(pluginDao.addOrUpdatePluginDefine(any(PluginDefine.class)))
                .thenAnswer(invocation -> idGenerator.getAndIncrement());

        AlertPluginManager manager = new AlertPluginManager(pluginDao);
        manager.start();

        verify(pluginDao, atLeastOnce()).addOrUpdatePluginDefine(any(PluginDefine.class));
        assertTrue(manager.size() > 0);

        Optional<?> alertChannel = manager.getAlertChannel(1);
        assertTrue(alertChannel.isPresent());
    }
}
