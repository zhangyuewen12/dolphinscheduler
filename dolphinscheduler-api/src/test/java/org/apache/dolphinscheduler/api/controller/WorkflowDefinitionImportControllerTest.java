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

package org.apache.dolphinscheduler.api.controller;

import org.apache.dolphinscheduler.api.enums.Status;
import org.apache.dolphinscheduler.api.service.WorkflowDefinitionService;
import org.apache.dolphinscheduler.api.utils.Result;
import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.dao.entity.User;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WorkflowDefinitionImportControllerTest {

    @InjectMocks
    private WorkflowDefinitionImportController workflowDefinitionImportController;

    @Mock
    private WorkflowDefinitionService workflowDefinitionService;

    @Test
    public void testImportWorkflowDefinition() {
        User loginUser = new User();
        loginUser.setId(1);
        String projectName = "target_project";
        String workflowName = "target_workflow";
        String workerGroup = "target_worker_group";
        String workflowDefinitionJson = "{\"workflowDefinition\":{\"projectName\":\"test\",\"name\":\"workflow\"}}";
        Map<String, Object> serviceResult = new HashMap<>();
        putMsg(serviceResult, Status.SUCCESS);
        Mockito.when(workflowDefinitionService.importWorkflowDefinition(loginUser, projectName, workflowName, workerGroup,
                workflowDefinitionJson))
                .thenReturn(serviceResult);

        Result result = workflowDefinitionImportController.importWorkflowDefinition(loginUser, projectName, workflowName,
                workerGroup, workflowDefinitionJson);

        Assertions.assertEquals(Status.SUCCESS.getCode(), result.getCode());
        Mockito.verify(workflowDefinitionService).importWorkflowDefinition(loginUser, projectName, workflowName,
                workerGroup,
                workflowDefinitionJson);
    }

    private void putMsg(Map<String, Object> result, Status status, Object... statusParams) {
        result.put(Constants.STATUS, status);
        if (statusParams != null && statusParams.length > 0) {
            result.put(Constants.MSG, MessageFormat.format(status.getMsg(), statusParams));
        } else {
            result.put(Constants.MSG, status.getMsg());
        }
    }
}
