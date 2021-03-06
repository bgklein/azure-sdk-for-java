/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Data Lake Analytics U-SQL activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DataLakeAnalyticsUSQLActivity.class)
@JsonTypeName("DataLakeAnalyticsU-SQL")
@JsonFlatten
public class DataLakeAnalyticsUSQLActivity extends ExecutionActivity {
    /**
     * Case-sensitive path to folder that contains the U-SQL script. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.scriptPath", required = true)
    private Object scriptPath;

    /**
     * Script linked service reference.
     */
    @JsonProperty(value = "typeProperties.scriptLinkedService", required = true)
    private LinkedServiceReference scriptLinkedService;

    /**
     * The maximum number of nodes simultaneously used to run the job. Default
     * value is 1. Type: integer (or Expression with resultType integer),
     * minimum: 1.
     */
    @JsonProperty(value = "typeProperties.degreeOfParallelism")
    private Object degreeOfParallelism;

    /**
     * Determines which jobs out of all that are queued should be selected to
     * run first. The lower the number, the higher the priority. Default value
     * is 1000. Type: integer (or Expression with resultType integer), minimum:
     * 1.
     */
    @JsonProperty(value = "typeProperties.priority")
    private Object priority;

    /**
     * Parameters for U-SQL job request.
     */
    @JsonProperty(value = "typeProperties.parameters")
    private Map<String, Object> parameters;

    /**
     * Runtime version of the U-SQL engine to use. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.runtimeVersion")
    private Object runtimeVersion;

    /**
     * Compilation mode of U-SQL. Must be one of these values : Semantic, Full
     * and SingleBox. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.compilationMode")
    private Object compilationMode;

    /**
     * Get case-sensitive path to folder that contains the U-SQL script. Type: string (or Expression with resultType string).
     *
     * @return the scriptPath value
     */
    public Object scriptPath() {
        return this.scriptPath;
    }

    /**
     * Set case-sensitive path to folder that contains the U-SQL script. Type: string (or Expression with resultType string).
     *
     * @param scriptPath the scriptPath value to set
     * @return the DataLakeAnalyticsUSQLActivity object itself.
     */
    public DataLakeAnalyticsUSQLActivity withScriptPath(Object scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }

    /**
     * Get script linked service reference.
     *
     * @return the scriptLinkedService value
     */
    public LinkedServiceReference scriptLinkedService() {
        return this.scriptLinkedService;
    }

    /**
     * Set script linked service reference.
     *
     * @param scriptLinkedService the scriptLinkedService value to set
     * @return the DataLakeAnalyticsUSQLActivity object itself.
     */
    public DataLakeAnalyticsUSQLActivity withScriptLinkedService(LinkedServiceReference scriptLinkedService) {
        this.scriptLinkedService = scriptLinkedService;
        return this;
    }

    /**
     * Get the maximum number of nodes simultaneously used to run the job. Default value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     *
     * @return the degreeOfParallelism value
     */
    public Object degreeOfParallelism() {
        return this.degreeOfParallelism;
    }

    /**
     * Set the maximum number of nodes simultaneously used to run the job. Default value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     *
     * @param degreeOfParallelism the degreeOfParallelism value to set
     * @return the DataLakeAnalyticsUSQLActivity object itself.
     */
    public DataLakeAnalyticsUSQLActivity withDegreeOfParallelism(Object degreeOfParallelism) {
        this.degreeOfParallelism = degreeOfParallelism;
        return this;
    }

    /**
     * Get determines which jobs out of all that are queued should be selected to run first. The lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType integer), minimum: 1.
     *
     * @return the priority value
     */
    public Object priority() {
        return this.priority;
    }

    /**
     * Set determines which jobs out of all that are queued should be selected to run first. The lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType integer), minimum: 1.
     *
     * @param priority the priority value to set
     * @return the DataLakeAnalyticsUSQLActivity object itself.
     */
    public DataLakeAnalyticsUSQLActivity withPriority(Object priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get parameters for U-SQL job request.
     *
     * @return the parameters value
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set parameters for U-SQL job request.
     *
     * @param parameters the parameters value to set
     * @return the DataLakeAnalyticsUSQLActivity object itself.
     */
    public DataLakeAnalyticsUSQLActivity withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get runtime version of the U-SQL engine to use. Type: string (or Expression with resultType string).
     *
     * @return the runtimeVersion value
     */
    public Object runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set runtime version of the U-SQL engine to use. Type: string (or Expression with resultType string).
     *
     * @param runtimeVersion the runtimeVersion value to set
     * @return the DataLakeAnalyticsUSQLActivity object itself.
     */
    public DataLakeAnalyticsUSQLActivity withRuntimeVersion(Object runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get compilation mode of U-SQL. Must be one of these values : Semantic, Full and SingleBox. Type: string (or Expression with resultType string).
     *
     * @return the compilationMode value
     */
    public Object compilationMode() {
        return this.compilationMode;
    }

    /**
     * Set compilation mode of U-SQL. Must be one of these values : Semantic, Full and SingleBox. Type: string (or Expression with resultType string).
     *
     * @param compilationMode the compilationMode value to set
     * @return the DataLakeAnalyticsUSQLActivity object itself.
     */
    public DataLakeAnalyticsUSQLActivity withCompilationMode(Object compilationMode) {
        this.compilationMode = compilationMode;
        return this;
    }

}
