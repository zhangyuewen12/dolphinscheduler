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

package org.apache.dolphinscheduler.server.worker.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;

import org.apache.dolphinscheduler.common.constants.TenantConstants;
import org.apache.dolphinscheduler.common.utils.OSUtils;
import org.apache.dolphinscheduler.plugin.task.api.TaskException;
import org.apache.dolphinscheduler.plugin.task.api.TaskExecutionContext;
import org.apache.dolphinscheduler.server.worker.config.TenantConfig;
import org.apache.dolphinscheduler.server.worker.config.WorkerConfig;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class TenantUtilsTest {

    @Test
    void getOrCreateActualTenant_returnsBootstrapWhenTenantDisabled() {
        WorkerConfig workerConfig = new WorkerConfig();
        TaskExecutionContext context = new TaskExecutionContext();
        context.setTenantCode("custom");

        try (MockedStatic<OSUtils> mocked = Mockito.mockStatic(OSUtils.class)) {
            mocked.when(OSUtils::isSudoEnable).thenReturn(false);

            String tenant = TenantUtils.getOrCreateActualTenant(workerConfig, context);

            assertEquals(TenantConstants.BOOTSTRAP_SYSTEM_USER, tenant);
        }
    }

    @Test
    void getOrCreateActualTenant_returnsBootstrapForDefaultTenantWhenEnabled() {
        WorkerConfig workerConfig = new WorkerConfig();
        TenantConfig tenantConfig = new TenantConfig();
        tenantConfig.setDefaultTenantEnabled(true);
        workerConfig.setTenantConfig(tenantConfig);

        TaskExecutionContext context = new TaskExecutionContext();
        context.setTenantCode(TenantConstants.DEFAULT_TENANT_CODE);

        try (MockedStatic<OSUtils> mocked = Mockito.mockStatic(OSUtils.class)) {
            mocked.when(OSUtils::isSudoEnable).thenReturn(true);

            String tenant = TenantUtils.getOrCreateActualTenant(workerConfig, context);

            assertEquals(TenantConstants.BOOTSTRAP_SYSTEM_USER, tenant);
        }
    }

    @Test
    void getOrCreateActualTenant_throwsWhenDefaultTenantDisabled() {
        WorkerConfig workerConfig = new WorkerConfig();
        TenantConfig tenantConfig = new TenantConfig();
        tenantConfig.setDefaultTenantEnabled(false);
        workerConfig.setTenantConfig(tenantConfig);

        TaskExecutionContext context = new TaskExecutionContext();
        context.setTenantCode(TenantConstants.DEFAULT_TENANT_CODE);

        try (MockedStatic<OSUtils> mocked = Mockito.mockStatic(OSUtils.class)) {
            mocked.when(OSUtils::isSudoEnable).thenReturn(true);

            assertThrows(TaskException.class, () -> TenantUtils.getOrCreateActualTenant(workerConfig, context));
        }
    }

    @Test
    void getOrCreateActualTenant_returnsTenantWhenExists() {
        WorkerConfig workerConfig = new WorkerConfig();
        TenantConfig tenantConfig = new TenantConfig();
        tenantConfig.setAutoCreateTenantEnabled(true);
        workerConfig.setTenantConfig(tenantConfig);

        TaskExecutionContext context = new TaskExecutionContext();
        context.setTenantCode("tenantA");

        try (MockedStatic<OSUtils> mocked = Mockito.mockStatic(OSUtils.class)) {
            mocked.when(OSUtils::isSudoEnable).thenReturn(true);
            mocked.when(OSUtils::getUserList).thenReturn(List.of("tenantA"));

            String tenant = TenantUtils.getOrCreateActualTenant(workerConfig, context);

            assertEquals("tenantA", tenant);
            mocked.verify(() -> OSUtils.createUserIfAbsent("tenantA"), times(1));
        }
    }

    @Test
    void getOrCreateActualTenant_throwsWhenTenantMissing() {
        WorkerConfig workerConfig = new WorkerConfig();
        TenantConfig tenantConfig = new TenantConfig();
        tenantConfig.setAutoCreateTenantEnabled(false);
        workerConfig.setTenantConfig(tenantConfig);

        TaskExecutionContext context = new TaskExecutionContext();
        context.setTenantCode("tenantB");

        try (MockedStatic<OSUtils> mocked = Mockito.mockStatic(OSUtils.class)) {
            mocked.when(OSUtils::isSudoEnable).thenReturn(true);
            mocked.when(OSUtils::getUserList).thenReturn(List.of("other"));

            assertThrows(TaskException.class, () -> TenantUtils.getOrCreateActualTenant(workerConfig, context));
        }
    }

    @Test
    void tenantTypeChecks() {
        assertTrue(TenantUtils.isDefaultTenant(TenantConstants.DEFAULT_TENANT_CODE));
        assertTrue(TenantUtils.isBootstrapTenant(TenantConstants.BOOTSTRAP_SYSTEM_USER));
    }
}
