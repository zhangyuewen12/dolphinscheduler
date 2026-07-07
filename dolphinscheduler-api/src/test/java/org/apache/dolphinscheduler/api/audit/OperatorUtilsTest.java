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

package org.apache.dolphinscheduler.api.audit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.api.audit.enums.AuditType;
import org.apache.dolphinscheduler.api.enums.ExecuteType;
import org.apache.dolphinscheduler.api.utils.Result;
import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.common.enums.AuditModelType;
import org.apache.dolphinscheduler.common.enums.AuditOperationType;
import org.apache.dolphinscheduler.common.enums.ReleaseState;
import org.apache.dolphinscheduler.dao.entity.AuditLog;
import org.apache.dolphinscheduler.dao.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OperatorUtilsTest {

    @Mock
    private JoinPoint joinPoint;

    @Mock
    private MethodSignature methodSignature;

    @Test
    void resultFail_handlesNullAndSuccess() {
        assertFalse(OperatorUtils.resultFail(null));

        Result<Void> success = Result.success(null);
        assertFalse(OperatorUtils.resultFail(success));
    }

    @Test
    void buildAuditLogList_buildsSingleLog() {
        User user = new User();
        user.setId(100);

        List<AuditLog> logs = OperatorUtils.buildAuditLogList("desc", AuditType.PROJECT_CREATE, user);

        assertEquals(1, logs.size());
        assertEquals(100, logs.get(0).getUserId());
        assertEquals(AuditType.PROJECT_CREATE.getAuditModelType().getName(), logs.get(0).getModelType());
        assertEquals(AuditType.PROJECT_CREATE.getAuditOperationType().getName(), logs.get(0).getOperationType());
        assertEquals("desc", logs.get(0).getDescription());
        assertNotNull(logs.get(0).getCreateTime());
    }

    @Test
    void getUser_findsUserFromParams() {
        User user = new User();
        Map<String, Object> params = new HashMap<>();
        params.put("user", user);

        assertEquals(user, OperatorUtils.getUser(params));
    }

    @Test
    void getUser_returnsNullWhenAbsent() {
        Map<String, Object> params = new HashMap<>();

        assertNull(OperatorUtils.getUser(params));
    }

    @Test
    void getParamsMap_mapsArgsToParameterNames() {
        when(joinPoint.getArgs()).thenReturn(new Object[]{"alpha", 10});
        when(methodSignature.getParameterNames()).thenReturn(new String[]{"name", "count"});

        Map<String, Object> params = OperatorUtils.getParamsMap(joinPoint, methodSignature);

        assertEquals("alpha", params.get("name"));
        assertEquals(10, params.get("count"));
    }

    @Test
    void modifyReleaseOperationType_switchesByReleaseState() {
        Map<String, Object> params = new HashMap<>();
        params.put(Constants.RELEASE_STATE, ReleaseState.ONLINE);

        AuditOperationType result = OperatorUtils.modifyReleaseOperationType(AuditType.WORKFLOW_RELEASE, params);

        assertEquals(AuditOperationType.ONLINE, result);
    }

    @Test
    void modifyReleaseOperationType_switchesByExecuteType() {
        Map<String, Object> params = new HashMap<>();
        params.put(Constants.EXECUTE_TYPE, ExecuteType.PAUSE);

        AuditOperationType result = OperatorUtils.modifyReleaseOperationType(AuditType.WORKFLOW_EXECUTE, params);

        assertEquals(AuditOperationType.PAUSE, result);
    }

    @Test
    void getObjectIdentityByParam_parsesNumericString() {
        Map<String, Object> params = new HashMap<>();
        params.put("code", "123");

        long result = OperatorUtils.getObjectIdentityByParam(new String[]{"code"}, params);

        assertEquals(123L, result);
    }

    @Test
    void getObjectIdentityByParam_returnsMinusOneOnInvalid() {
        Map<String, Object> params = new HashMap<>();
        params.put("code", "not-number");

        long result = OperatorUtils.getObjectIdentityByParam(new String[]{"code"}, params);

        assertEquals(-1L, result);
    }

    @Test
    void getObjectIfFromReturnObject_readsIdField() {
        Map<String, Object> result = OperatorUtils.getObjectIfFromReturnObject(new Child(8L), new String[]{"id"});

        assertEquals(8L, result.get("id"));
    }

    @Test
    void getObjectIfFromReturnObject_readsLongDirectly() {
        Map<String, Object> result = OperatorUtils.getObjectIfFromReturnObject(9L, new String[]{"id"});

        assertEquals(9L, result.get("id"));
    }

    @Test
    void isFolder_checksSuffix() {
        assertTrue(OperatorUtils.isFolder("/path/"));
        assertFalse(OperatorUtils.isFolder("/path/file.txt"));
    }

    @Test
    void getFileAuditObject_resolvesFolderOrFile() {
        Map<String, Object> params = new HashMap<>();

        String folderType = OperatorUtils.getFileAuditObject(AuditType.FOLDER_CREATE, params, "dir/");
        assertEquals(AuditModelType.FOLDER.getName(), folderType);

        String fileType = OperatorUtils.getFileAuditObject(AuditType.FILE_CREATE, params, "file.txt");
        assertEquals(AuditModelType.FILE.getName(), fileType);
    }

    private static class Parent {

        private final Long id;

        private Parent(Long id) {
            this.id = id;
        }
    }

    private static class Child extends Parent {

        private Child(Long id) {
            super(id);
        }
    }
}
