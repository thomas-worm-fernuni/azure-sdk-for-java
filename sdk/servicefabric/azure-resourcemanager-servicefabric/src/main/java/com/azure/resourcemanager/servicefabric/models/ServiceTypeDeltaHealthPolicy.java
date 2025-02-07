// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the delta health policy used to evaluate the health of services belonging to a service type when upgrading
 * the cluster.
 */
@Fluent
public final class ServiceTypeDeltaHealthPolicy {
    /*
     * The maximum allowed percentage of services health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the services at the beginning of upgrade and the state of the
     * services at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the
     * cluster is within tolerated limits.
     *
     */
    @JsonProperty(value = "maxPercentDeltaUnhealthyServices")
    private Integer maxPercentDeltaUnhealthyServices;

    /** Creates an instance of ServiceTypeDeltaHealthPolicy class. */
    public ServiceTypeDeltaHealthPolicy() {
    }

    /**
     * Get the maxPercentDeltaUnhealthyServices property: The maximum allowed percentage of services health degradation
     * allowed during cluster upgrades. The delta is measured between the state of the services at the beginning of
     * upgrade and the state of the services at the time of the health evaluation. The check is performed after every
     * upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     *
     * @return the maxPercentDeltaUnhealthyServices value.
     */
    public Integer maxPercentDeltaUnhealthyServices() {
        return this.maxPercentDeltaUnhealthyServices;
    }

    /**
     * Set the maxPercentDeltaUnhealthyServices property: The maximum allowed percentage of services health degradation
     * allowed during cluster upgrades. The delta is measured between the state of the services at the beginning of
     * upgrade and the state of the services at the time of the health evaluation. The check is performed after every
     * upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     *
     * @param maxPercentDeltaUnhealthyServices the maxPercentDeltaUnhealthyServices value to set.
     * @return the ServiceTypeDeltaHealthPolicy object itself.
     */
    public ServiceTypeDeltaHealthPolicy withMaxPercentDeltaUnhealthyServices(Integer maxPercentDeltaUnhealthyServices) {
        this.maxPercentDeltaUnhealthyServices = maxPercentDeltaUnhealthyServices;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
