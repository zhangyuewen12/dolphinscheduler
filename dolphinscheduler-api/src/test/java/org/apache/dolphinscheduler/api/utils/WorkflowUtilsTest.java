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

package org.apache.dolphinscheduler.api.utils;

import org.apache.dolphinscheduler.api.dto.ImportedWorkflowDefinition;
import org.apache.dolphinscheduler.api.enums.Status;
import org.apache.dolphinscheduler.api.exceptions.ServiceException;
import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.common.enums.WorkflowExecutionTypeEnum;
import org.apache.dolphinscheduler.common.utils.JSONUtils;
import org.apache.dolphinscheduler.dao.entity.TaskDefinitionLog;
import org.apache.dolphinscheduler.dao.entity.WorkflowTaskRelationLog;
import org.apache.dolphinscheduler.plugin.task.api.parameters.SwitchParameters;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkflowUtilsTest {

    @Test
    public void testParseImportedWorkflowDefinitionIdentityFromWorkflowNode() throws Exception {
        ImportedWorkflowDefinition importedDefinition =
                WorkflowUtils.parseImportedWorkflowDefinitionIdentity(readWorkflowImportResourceWithProjectName());

        Assertions.assertEquals("test", importedDefinition.getProjectName());
        Assertions.assertEquals("shell_task", importedDefinition.getName());
    }

    @Test
    public void testParseImportedWorkflowDefinitionIdentityFromRootProjectName() {
        String workflowJson = "{\"projectName\":\"root_project\",\"workflowDefinition\":{\"name\":\"workflow\"}}";

        ImportedWorkflowDefinition importedDefinition =
                WorkflowUtils.parseImportedWorkflowDefinitionIdentity(workflowJson);

        Assertions.assertEquals("root_project", importedDefinition.getProjectName());
        Assertions.assertEquals("workflow", importedDefinition.getName());
    }

    @Test
    public void testParseImportedWorkflowDefinition() throws Exception {
        ImportedWorkflowDefinition importedDefinition =
                WorkflowUtils.parseImportedWorkflowDefinition(10L, 20, readWorkflowImportResourceWithProjectName());

        Assertions.assertEquals("test", importedDefinition.getProjectName());
        Assertions.assertEquals("shell_task", importedDefinition.getName());
        Assertions.assertEquals(WorkflowExecutionTypeEnum.PARALLEL, importedDefinition.getExecutionType());
        List<TaskDefinitionLog> taskDefinitionLogs =
                JSONUtils.toList(importedDefinition.getTaskDefinitionJson(), TaskDefinitionLog.class);
        List<WorkflowTaskRelationLog> taskRelationLogs =
                JSONUtils.toList(importedDefinition.getTaskRelationJson(), WorkflowTaskRelationLog.class);
        Assertions.assertEquals(1, taskDefinitionLogs.size());
        Assertions.assertEquals(1, taskRelationLogs.size());
        Assertions.assertEquals(10L, taskDefinitionLogs.get(0).getProjectCode());
        Assertions.assertEquals(20, taskDefinitionLogs.get(0).getUserId());
        Assertions.assertEquals(Constants.VERSION_FIRST, taskDefinitionLogs.get(0).getVersion());
        Assertions.assertEquals(taskDefinitionLogs.get(0).getCode(), taskRelationLogs.get(0).getPostTaskCode());
        Assertions.assertNotEquals(137713824398176L, taskDefinitionLogs.get(0).getCode());
    }

    @Test
    public void testParseImportedWorkflowDefinitionDirectJsonShape() {
        ImportedWorkflowDefinition importedDefinition =
                WorkflowUtils.parseImportedWorkflowDefinition(10L, 20, directWorkflowImportJson());

        Assertions.assertEquals("direct_project", importedDefinition.getProjectName());
        Assertions.assertEquals("direct_workflow", importedDefinition.getName());
        Assertions.assertEquals("[]", importedDefinition.getGlobalParams());
    }

    @Test
    public void testParseImportedWorkflowDefinitionUsesTargetWorkflowName() throws Exception {
        ImportedWorkflowDefinition importedDefinition = WorkflowUtils.parseImportedWorkflowDefinition(10L, 20,
                "target_workflow", readWorkflowImportResourceWithProjectName());

        Assertions.assertEquals("target_workflow", importedDefinition.getName());
    }

    @Test
    public void testParseImportedWorkflowDefinitionUsesTargetWorkerGroup() throws Exception {
        ImportedWorkflowDefinition importedDefinition = WorkflowUtils.parseImportedWorkflowDefinition(10L, 20,
                "target_workflow", "target_worker_group", readWorkflowImportResourceWithProjectName());

        List<TaskDefinitionLog> taskDefinitionLogs =
                JSONUtils.toList(importedDefinition.getTaskDefinitionJson(), TaskDefinitionLog.class);
        Assertions.assertEquals("target_worker_group", taskDefinitionLogs.get(0).getWorkerGroup());
    }

    @Test
    public void testParseImportedWorkflowDefinitionInvalidIdentity() {
        ServiceException exception = Assertions.assertThrows(ServiceException.class,
                () -> WorkflowUtils.parseImportedWorkflowDefinition(10L, 20, "{\"projectName\":\"test\"}"));

        Assertions.assertEquals(Status.DATA_IS_NOT_VALID.getCode(), exception.getCode());
    }

    @Test
    public void testParseImportedWorkflowDefinitionEmptyTasks() {
        String workflowJson = "{\"projectName\":\"test\",\"name\":\"workflow\"}";

        ServiceException exception = Assertions.assertThrows(ServiceException.class,
                () -> WorkflowUtils.parseImportedWorkflowDefinition(10L, 20, workflowJson));

        Assertions.assertEquals(Status.DATA_IS_NOT_VALID.getCode(), exception.getCode());
    }

    @Test
    public void testReadImportJsonRootRejectsEmptyArray() {
        ServiceException exception = Assertions.assertThrows(ServiceException.class,
                () -> WorkflowUtils.readImportJsonRoot("[]"));

        Assertions.assertEquals(Status.DATA_IS_NOT_VALID.getCode(), exception.getCode());
    }

    @Test
    public void testJsonFieldHelpers() {
        JsonNode objectNode = JSONUtils.parseObject("{\"name\":\"workflow\"}");
        JsonNode textNode = JSONUtils.parseObject("{\"value\":\"text\"}").path("value");
        JsonNode blankTextNode = JSONUtils.parseObject("{\"value\":\"\"}").path("value");
        JsonNode missingNode = JSONUtils.parseObject("{}").path("missing");

        Assertions.assertEquals("{\"name\":\"workflow\"}", WorkflowUtils.jsonFieldToString(objectNode, "{}"));
        Assertions.assertEquals("text", WorkflowUtils.jsonFieldToString(textNode, "default"));
        Assertions.assertEquals("default", WorkflowUtils.jsonFieldToString(blankTextNode, "default"));
        Assertions.assertEquals("default", WorkflowUtils.jsonFieldToString(missingNode, "default"));
        Assertions.assertEquals("default", WorkflowUtils.jsonFieldToPlainString(missingNode, "default"));
    }

    @Test
    public void testRemapSwitchTaskParams() {
        TaskDefinitionLog taskDefinitionLog = new TaskDefinitionLog();
        taskDefinitionLog.setTaskType("SWITCH");
        taskDefinitionLog.setTaskParams("{\"switchResult\":{\"dependTaskList\":[{\"nextNode\":1}],\"nextNode\":2}}");
        Map<Long, Long> taskCodeMap = new HashMap<>();
        taskCodeMap.put(1L, 11L);
        taskCodeMap.put(2L, 22L);

        WorkflowUtils.remapSwitchTaskParams(taskDefinitionLog, taskCodeMap);

        SwitchParameters switchParameters =
                JSONUtils.parseObject(taskDefinitionLog.getTaskParams(), SwitchParameters.class);
        Assertions.assertEquals(11L, switchParameters.getSwitchResult().getDependTaskList().get(0).getNextNode());
        Assertions.assertEquals(22L, switchParameters.getSwitchResult().getNextNode());
    }

    @Test
    public void testRemapLocationTaskCodes() {
        Map<Long, Long> taskCodeMap = new HashMap<>();
        taskCodeMap.put(1L, 11L);

        Assertions.assertEquals("[]", WorkflowUtils.remapLocationTaskCodes("", taskCodeMap));
        Assertions.assertEquals("{\"taskCode\":1}", WorkflowUtils.remapLocationTaskCodes("{\"taskCode\":1}",
                taskCodeMap));
        Assertions.assertEquals("[{\"taskCode\":11,\"x\":1}]",
                WorkflowUtils.remapLocationTaskCodes("[{\"taskCode\":1,\"x\":1}]", taskCodeMap));
    }

    private String readWorkflowImportResourceWithProjectName() throws IOException, URISyntaxException {
        Path path = Paths.get(getClass().getClassLoader()
                .getResource("workflowImport/check_successful.json").toURI());
        return new String(Files.readAllBytes(path))
                .replace("\"projectName\" : null", "\"projectName\" : \"test\"");
    }

    private String directWorkflowImportJson() {
        return "{"
                + "\"projectName\":\"direct_project\","
                + "\"name\":\"direct_workflow\","
                + "\"locations\":[{\"taskCode\":1,\"x\":1}],"
                + "\"taskDefinitionJson\":[{\"code\":1,\"name\":\"task\",\"version\":1,"
                + "\"taskType\":\"SHELL\",\"taskParams\":\"{}\"}],"
                + "\"taskRelationJson\":[{\"preTaskCode\":0,\"preTaskVersion\":0,"
                + "\"postTaskCode\":1,\"postTaskVersion\":1}]"
                + "}";
    }
}
