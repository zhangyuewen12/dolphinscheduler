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

import static org.apache.dolphinscheduler.api.enums.Status.IMPORT_WORKFLOW_DEFINE_ERROR;

import org.apache.dolphinscheduler.api.audit.OperatorLog;
import org.apache.dolphinscheduler.api.audit.enums.AuditType;
import org.apache.dolphinscheduler.api.exceptions.ApiException;
import org.apache.dolphinscheduler.api.service.WorkflowDefinitionService;
import org.apache.dolphinscheduler.api.utils.Result;
import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.dao.entity.User;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Workflow definition import API for lightweight worker-side publishing tools.
 */
@Tag(name = "WORKFLOW_DEFINITION_IMPORT_TAG")
@RestController
@RequestMapping("workflow-definition/import")
public class WorkflowDefinitionImportController extends BaseController {

    @Autowired
    private WorkflowDefinitionService workflowDefinitionService;

    /**
     * Import or update one workflow definition by target project name and workflow name.
     *
     * <p>The exported workflow JSON may come from another project or workflow. The
     * explicit projectName/workflowName parameters are treated as the target location,
     * so callers can publish a workflow exported from project A into project B.</p>
     */
    @Operation(summary = "importWorkflowDefinition", description = "IMPORT_WORKFLOW_DEFINITION_NOTES")
    @Parameters({
            @Parameter(name = "projectName", description = "PROJECT_NAME", required = true,
                    schema = @Schema(implementation = String.class)),
            @Parameter(name = "workflowName", description = "WORKFLOW_DEFINITION_NAME", required = true,
                    schema = @Schema(implementation = String.class)),
            @Parameter(name = "workerGroup", description = "WORKER_GROUP", required = true,
                    schema = @Schema(implementation = String.class)),
            @Parameter(name = "workflowDefinitionJson", description = "WORKFLOW_DEFINITION_JSON", required = true,
                    schema = @Schema(implementation = String.class))
    })
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    @ApiException(IMPORT_WORKFLOW_DEFINE_ERROR)
    @OperatorLog(auditType = AuditType.WORKFLOW_CREATE)
    public Result importWorkflowDefinition(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER)
                                           User loginUser,
                                           @RequestParam(value = "projectName") String projectName,
                                           @RequestParam(value = "workflowName") String workflowName,
                                           @RequestParam(value = "workerGroup") String workerGroup,
                                           @RequestParam(value = "workflowDefinitionJson") String workflowDefinitionJson) {
        Map<String, Object> result =
                workflowDefinitionService.importWorkflowDefinition(loginUser, projectName, workflowName,
                        workerGroup, workflowDefinitionJson);
        return returnDataList(result);
    }
}
