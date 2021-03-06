/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.ScheduleAssociationProperty;
import com.microsoft.azure.management.automation.v2015_10_31.RunbookAssociationProperty;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Definition of the job schedule.
 */
@JsonFlatten
public class JobScheduleInner {
    /**
     * Gets the id of the resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Gets the name of the variable.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Gets or sets the id of job schedule.
     */
    @JsonProperty(value = "properties.jobScheduleId")
    private String jobScheduleId;

    /**
     * Gets or sets the schedule.
     */
    @JsonProperty(value = "properties.schedule")
    private ScheduleAssociationProperty schedule;

    /**
     * Gets or sets the runbook.
     */
    @JsonProperty(value = "properties.runbook")
    private RunbookAssociationProperty runbook;

    /**
     * Gets or sets the hybrid worker group that the scheduled job should run
     * on.
     */
    @JsonProperty(value = "properties.runOn")
    private String runOn;

    /**
     * Gets or sets the parameters of the job schedule.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, String> parameters;

    /**
     * Get gets the id of the resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get gets the name of the variable.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get gets or sets the id of job schedule.
     *
     * @return the jobScheduleId value
     */
    public String jobScheduleId() {
        return this.jobScheduleId;
    }

    /**
     * Set gets or sets the id of job schedule.
     *
     * @param jobScheduleId the jobScheduleId value to set
     * @return the JobScheduleInner object itself.
     */
    public JobScheduleInner withJobScheduleId(String jobScheduleId) {
        this.jobScheduleId = jobScheduleId;
        return this;
    }

    /**
     * Get gets or sets the schedule.
     *
     * @return the schedule value
     */
    public ScheduleAssociationProperty schedule() {
        return this.schedule;
    }

    /**
     * Set gets or sets the schedule.
     *
     * @param schedule the schedule value to set
     * @return the JobScheduleInner object itself.
     */
    public JobScheduleInner withSchedule(ScheduleAssociationProperty schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get gets or sets the runbook.
     *
     * @return the runbook value
     */
    public RunbookAssociationProperty runbook() {
        return this.runbook;
    }

    /**
     * Set gets or sets the runbook.
     *
     * @param runbook the runbook value to set
     * @return the JobScheduleInner object itself.
     */
    public JobScheduleInner withRunbook(RunbookAssociationProperty runbook) {
        this.runbook = runbook;
        return this;
    }

    /**
     * Get gets or sets the hybrid worker group that the scheduled job should run on.
     *
     * @return the runOn value
     */
    public String runOn() {
        return this.runOn;
    }

    /**
     * Set gets or sets the hybrid worker group that the scheduled job should run on.
     *
     * @param runOn the runOn value to set
     * @return the JobScheduleInner object itself.
     */
    public JobScheduleInner withRunOn(String runOn) {
        this.runOn = runOn;
        return this;
    }

    /**
     * Get gets or sets the parameters of the job schedule.
     *
     * @return the parameters value
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set gets or sets the parameters of the job schedule.
     *
     * @param parameters the parameters value to set
     * @return the JobScheduleInner object itself.
     */
    public JobScheduleInner withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

}
