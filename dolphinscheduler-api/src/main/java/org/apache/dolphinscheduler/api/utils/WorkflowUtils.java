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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.dolphinscheduler.api.dto.ImportedWorkflowDefinition;
import org.apache.dolphinscheduler.api.dto.workflow.WorkflowBackFillRequest;
import org.apache.dolphinscheduler.api.enums.Status;
import org.apache.dolphinscheduler.api.exceptions.ServiceException;
import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.common.enums.WorkflowExecutionTypeEnum;
import org.apache.dolphinscheduler.common.utils.CodeGenerateUtils;
import org.apache.dolphinscheduler.common.utils.JSONUtils;

import org.apache.commons.lang3.StringUtils;
import org.apache.dolphinscheduler.dao.entity.TaskDefinitionLog;
import org.apache.dolphinscheduler.dao.entity.WorkflowTaskRelationLog;
import org.apache.dolphinscheduler.plugin.task.api.parameters.SwitchParameters;
import org.apache.dolphinscheduler.plugin.task.api.utils.TaskTypeUtils;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class WorkflowUtils {

    public static List<Long> parseStartNodeList(String startNodes) {
        try {
            if (StringUtils.isEmpty(startNodes)) {
                return new ArrayList<>();
            }
            return Arrays.stream(startNodes.split(","))
                    .map(String::trim)
                    .map(Long::parseLong)
                    .collect(Collectors.toList());
        } catch (Exception ex) {
            throw new ServiceException("Parse startNodes: " + startNodes + " error", ex);
        }
    }

    public static WorkflowBackFillRequest.BackfillTime parseBackfillTime(String backfillTimeJson) {
        try {
            if (StringUtils.isEmpty(backfillTimeJson)) {
                throw new IllegalArgumentException("backfillTime is empty");
            }
            WorkflowBackFillRequest.BackfillTime backfillTime =
                    JSONUtils.parseObject(backfillTimeJson, WorkflowBackFillRequest.BackfillTime.class);
            if (backfillTime == null) {
                throw new IllegalArgumentException("backfillTime is invalid");
            }
            return backfillTime;
        } catch (Exception ex) {
            throw new ServiceException("Parse backfillTime: " + backfillTimeJson + " error", ex);
        }
    }


    /**
     * Normalize the exported JSON shape into the same form payload the current create/update
     * APIs already accept. The import API does not import schedules in this first phase.
     */
    public static ImportedWorkflowDefinition parseImportedWorkflowDefinition(long projectCode,
                                                                             int userId,
                                                                             String workflowDefinitionJson) {
        ImportedWorkflowDefinition importedIdentity = parseImportedWorkflowDefinitionIdentity(workflowDefinitionJson);
        return parseImportedWorkflowDefinition(projectCode, userId, importedIdentity.getName(), null,
                workflowDefinitionJson);
    }

    /**
     * Normalize an exported workflow JSON for the requested target workflow name.
     *
     * <p>The source file may contain the project/name where it was exported from, but
     * import uses the caller-provided target workflowName so the same file can be
     * published into a different project or renamed on import.</p>
     */
    public static ImportedWorkflowDefinition parseImportedWorkflowDefinition(long projectCode,
                                                                             int userId,
                                                                             String workflowName,
                                                                             String workflowDefinitionJson) {
        return parseImportedWorkflowDefinition(projectCode, userId, workflowName, null, workflowDefinitionJson);
    }

    /**
     * Normalize an exported workflow JSON for the requested target workflow name and worker group.
     *
     * <p>The source file may contain task worker groups from another environment. When
     * workerGroup is provided, all imported task definitions are rewritten to use that
     * target worker group before the existing create/update APIs persist them.</p>
     */
    public static ImportedWorkflowDefinition parseImportedWorkflowDefinition(long projectCode,
                                                                             int userId,
                                                                             String workflowName,
                                                                             String workerGroup,
                                                                             String workflowDefinitionJson) {
        String logWorkflowName = StringUtils.defaultIfBlank(workflowName, "unknown");
        try {
            JsonNode rootNode = readImportJsonRoot(workflowDefinitionJson);
            JsonNode workflowNode =
                    rootNode.has("workflowDefinition") ? rootNode.path("workflowDefinition") : rootNode;
            ImportedWorkflowDefinition importedIdentity = parseImportedWorkflowDefinitionIdentity(rootNode);
            String projectName = importedIdentity.getProjectName();
            if (StringUtils.isBlank(workflowName)) {
                throw new ServiceException(Status.DATA_IS_NOT_VALID, "workflowName");
            }
            JsonNode taskDefinitionNode = rootNode.has("taskDefinitionList")
                    ? rootNode.path("taskDefinitionList")
                    : rootNode.path("taskDefinitionJson");
            JsonNode taskRelationNode = rootNode.has("workflowTaskRelationList")
                    ? rootNode.path("workflowTaskRelationList")
                    : rootNode.path("taskRelationJson");

            String taskDefinitionJson = jsonFieldToString(taskDefinitionNode, "[]");
            String taskRelationJson = jsonFieldToString(taskRelationNode, "[]");
            List<TaskDefinitionLog> taskDefinitionLogs =
                    JSONUtils.toList(taskDefinitionJson, TaskDefinitionLog.class);
            List<WorkflowTaskRelationLog> taskRelationLogs =
                    JSONUtils.toList(taskRelationJson, WorkflowTaskRelationLog.class);
            if (CollectionUtils.isEmpty(taskDefinitionLogs) || CollectionUtils.isEmpty(taskRelationLogs)) {
                throw new ServiceException(Status.DATA_IS_NOT_VALID, workflowName);
            }

            String locations = jsonFieldToString(workflowNode.path("locations"), "[]");
            locations = regenerateImportedTaskCodes(projectCode, userId, taskDefinitionLogs, taskRelationLogs,
                    locations);
            if (StringUtils.isNotBlank(workerGroup)) {
                taskDefinitionLogs.forEach(taskDefinitionLog -> taskDefinitionLog.setWorkerGroup(workerGroup));
            }

            ImportedWorkflowDefinition importedDefinition = new ImportedWorkflowDefinition();
            importedDefinition.setProjectName(projectName);
            importedDefinition.setName(workflowName);
            importedDefinition.setDescription(jsonFieldToPlainString(workflowNode.path("description"), ""));
            importedDefinition.setGlobalParams(jsonFieldToString(workflowNode.path("globalParams"), "[]"));
            importedDefinition.setLocations(locations);
            importedDefinition.setTimeout(workflowNode.path("timeout").asInt(0));
            importedDefinition.setTaskRelationJson(JSONUtils.toJsonString(taskRelationLogs));
            importedDefinition.setTaskDefinitionJson(JSONUtils.toJsonString(taskDefinitionLogs));
            String executionType = jsonFieldToPlainString(workflowNode.path("executionType"),
                    WorkflowExecutionTypeEnum.PARALLEL.name());
            importedDefinition.setExecutionType(WorkflowExecutionTypeEnum.valueOf(executionType));
            return importedDefinition;
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            log.error("Parse import workflow definition json failed, workflowName:{}.", logWorkflowName, ex);
            throw new ServiceException(Status.DATA_IS_NOT_VALID, logWorkflowName);
        }
    }

    /**
     * Extract the target project and workflow names from the import file before
     * any persistence-specific normalization is done.
     */
    public static ImportedWorkflowDefinition parseImportedWorkflowDefinitionIdentity(String workflowDefinitionJson) {
        return parseImportedWorkflowDefinitionIdentity(readImportJsonRoot(workflowDefinitionJson));
    }

    private static ImportedWorkflowDefinition parseImportedWorkflowDefinitionIdentity(JsonNode rootNode) {
        JsonNode workflowNode = rootNode.has("workflowDefinition") ? rootNode.path("workflowDefinition") : rootNode;
        String projectName = jsonFieldToPlainString(workflowNode.path("projectName"),
                jsonFieldToPlainString(rootNode.path("projectName"), ""));
        String workflowName = jsonFieldToPlainString(workflowNode.path("name"), "");
        ImportedWorkflowDefinition importedDefinition = new ImportedWorkflowDefinition();
        importedDefinition.setProjectName(projectName);
        importedDefinition.setName(workflowName);
        return importedDefinition;
    }

    public static JsonNode readImportJsonRoot(String workflowDefinitionJson) {
        String trimmedJson = workflowDefinitionJson.trim();
        if (trimmedJson.startsWith("[")) {
            ArrayNode arrayNode = JSONUtils.parseArray(trimmedJson);
            if (arrayNode == null || arrayNode.isEmpty()) {
                throw new ServiceException(Status.DATA_IS_NOT_VALID, "workflowDefinitionJson");
            }
            return arrayNode.get(0);
        }
        return JSONUtils.parseObject(trimmedJson);
    }

    public static String jsonFieldToString(JsonNode jsonNode, String defaultValue) {
        if (jsonNode == null || jsonNode.isMissingNode() || jsonNode.isNull()) {
            return defaultValue;
        }
        if (jsonNode.isTextual()) {
            return StringUtils.defaultIfBlank(jsonNode.asText(), defaultValue);
        }
        return JSONUtils.toJsonString(jsonNode);
    }

    public static String jsonFieldToPlainString(JsonNode jsonNode, String defaultValue) {
        if (jsonNode == null || jsonNode.isMissingNode() || jsonNode.isNull()) {
            return defaultValue;
        }
        return jsonNode.asText(defaultValue);
    }

    /**
     * Regenerate task codes on import so a workflow file can be safely re-imported into
     * the same DolphinScheduler environment without colliding with existing task codes.
     */
    public static String regenerateImportedTaskCodes(long projectCode,
                                               int userId,
                                               List<TaskDefinitionLog> taskDefinitionLogs,
                                               List<WorkflowTaskRelationLog> taskRelationLogs,
                                               String locations) {
        inferImportedTaskCodes(taskDefinitionLogs, taskRelationLogs);

        Map<Long, Long> taskCodeMap = new HashMap<>();
        for (TaskDefinitionLog taskDefinitionLog : taskDefinitionLogs) {
            taskCodeMap.put(taskDefinitionLog.getCode(), CodeGenerateUtils.genCode());
        }
        for (TaskDefinitionLog taskDefinitionLog : taskDefinitionLogs) {
            taskDefinitionLog.setId(null);
            taskDefinitionLog.setCode(taskCodeMap.get(taskDefinitionLog.getCode()));
            taskDefinitionLog.setProjectCode(projectCode);
            taskDefinitionLog.setUserId(userId);
            taskDefinitionLog.setVersion(Constants.VERSION_FIRST);
            if (TaskTypeUtils.isSwitchTask(taskDefinitionLog.getTaskType())) {
                remapSwitchTaskParams(taskDefinitionLog, taskCodeMap);
            }
        }
        for (WorkflowTaskRelationLog workflowTaskRelationLog : taskRelationLogs) {
            workflowTaskRelationLog.setId(null);
            workflowTaskRelationLog.setProjectCode(projectCode);
            if (workflowTaskRelationLog.getPreTaskCode() > 0) {
                workflowTaskRelationLog.setPreTaskCode(taskCodeMap.get(workflowTaskRelationLog.getPreTaskCode()));
                workflowTaskRelationLog.setPreTaskVersion(Constants.VERSION_FIRST);
            }
            if (workflowTaskRelationLog.getPostTaskCode() > 0) {
                workflowTaskRelationLog.setPostTaskCode(taskCodeMap.get(workflowTaskRelationLog.getPostTaskCode()));
                workflowTaskRelationLog.setPostTaskVersion(Constants.VERSION_FIRST);
            }
        }
        return remapLocationTaskCodes(locations, taskCodeMap);
    }

    public static void inferImportedTaskCodes(List<TaskDefinitionLog> taskDefinitionLogs,
                                        List<WorkflowTaskRelationLog> taskRelationLogs) {
        Set<Long> taskCodes = taskDefinitionLogs.stream()
                .map(TaskDefinitionLog::getCode)
                .collect(Collectors.toSet());
        List<Long> postTaskCodes = taskRelationLogs.stream()
                .map(WorkflowTaskRelationLog::getPostTaskCode)
                .filter(postTaskCode -> postTaskCode > 0)
                .distinct()
                .collect(Collectors.toList());
        if (taskCodes.equals(new HashSet<>(postTaskCodes)) || taskDefinitionLogs.size() != postTaskCodes.size()) {
            return;
        }
        for (int i = 0; i < taskDefinitionLogs.size(); i++) {
            taskDefinitionLogs.get(i).setCode(postTaskCodes.get(i));
        }
    }

    public static void remapSwitchTaskParams(TaskDefinitionLog taskDefinitionLog, Map<Long, Long> taskCodeMap) {
        SwitchParameters switchParameters =
                JSONUtils.parseObject(taskDefinitionLog.getTaskParams(), SwitchParameters.class);
        if (switchParameters == null || switchParameters.getSwitchResult() == null) {
            return;
        }
        SwitchParameters.SwitchResult switchResult = switchParameters.getSwitchResult();
        if (switchResult.getDependTaskList() != null) {
            switchResult.getDependTaskList().forEach(switchResultVo -> {
                if (taskCodeMap.containsKey(switchResultVo.getNextNode())) {
                    switchResultVo.setNextNode(taskCodeMap.get(switchResultVo.getNextNode()));
                }
            });
        }
        if (switchResult.getNextNode() != null && taskCodeMap.containsKey(switchResult.getNextNode())) {
            switchResult.setNextNode(taskCodeMap.get(switchResult.getNextNode()));
        }
        taskDefinitionLog.setTaskParams(JSONUtils.toJsonString(switchParameters));
    }

    public static String remapLocationTaskCodes(String locations, Map<Long, Long> taskCodeMap) {
        if (StringUtils.isBlank(locations)) {
            return "[]";
        }
        try {
            ArrayNode jsonNodes = JSONUtils.parseArray(locations);
            for (int i = 0; i < jsonNodes.size(); i++) {
                ObjectNode node = (ObjectNode) jsonNodes.path(i);
                long taskCode = node.path("taskCode").asLong(0);
                if (taskCodeMap.containsKey(taskCode)) {
                    node.put("taskCode", taskCodeMap.get(taskCode));
                }
                jsonNodes.set(i, node);
            }
            return JSONUtils.toJsonString(jsonNodes);
        } catch (Exception ex) {
            log.warn("Skip remapping workflow import locations because the format is not an array: {}", locations);
            return locations;
        }
    }
}
