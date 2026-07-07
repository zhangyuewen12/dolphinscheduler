package org.apache.dolphinscheduler.api.dto;

import org.apache.dolphinscheduler.common.enums.WorkflowExecutionTypeEnum;

/**
 * Normalized workflow import payload.
 *
 * <p>The import parser converts an exported workflow JSON file into this DTO so the
 * import service can reuse the existing workflow create/update APIs without knowing
 * the original file structure.</p>
 */
public class ImportedWorkflowDefinition {
    private String projectName;
    private String name;
    private String description;
    private String globalParams;
    private String locations;
    private int timeout;
    private String taskRelationJson;
    private String taskDefinitionJson;
    private WorkflowExecutionTypeEnum executionType;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGlobalParams() {
        return globalParams;
    }

    public void setGlobalParams(String globalParams) {
        this.globalParams = globalParams;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getTaskRelationJson() {
        return taskRelationJson;
    }

    public void setTaskRelationJson(String taskRelationJson) {
        this.taskRelationJson = taskRelationJson;
    }

    public String getTaskDefinitionJson() {
        return taskDefinitionJson;
    }

    public void setTaskDefinitionJson(String taskDefinitionJson) {
        this.taskDefinitionJson = taskDefinitionJson;
    }

    public WorkflowExecutionTypeEnum getExecutionType() {
        return executionType;
    }

    public void setExecutionType(WorkflowExecutionTypeEnum executionType) {
        this.executionType = executionType;
    }
}
