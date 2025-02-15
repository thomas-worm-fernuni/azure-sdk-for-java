// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ListRecoveryPointsRecommendedForMoveRequest Request. */
@Fluent
public final class ListRecoveryPointsRecommendedForMoveRequest {
    /*
     * Gets the class type.
     */
    @JsonProperty(value = "objectType")
    private String objectType;

    /*
     * List of Recovery Points excluded from Move
     */
    @JsonProperty(value = "excludedRPList")
    private List<String> excludedRPList;

    /** Creates an instance of ListRecoveryPointsRecommendedForMoveRequest class. */
    public ListRecoveryPointsRecommendedForMoveRequest() {
    }

    /**
     * Get the objectType property: Gets the class type.
     *
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: Gets the class type.
     *
     * @param objectType the objectType value to set.
     * @return the ListRecoveryPointsRecommendedForMoveRequest object itself.
     */
    public ListRecoveryPointsRecommendedForMoveRequest withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the excludedRPList property: List of Recovery Points excluded from Move.
     *
     * @return the excludedRPList value.
     */
    public List<String> excludedRPList() {
        return this.excludedRPList;
    }

    /**
     * Set the excludedRPList property: List of Recovery Points excluded from Move.
     *
     * @param excludedRPList the excludedRPList value to set.
     * @return the ListRecoveryPointsRecommendedForMoveRequest object itself.
     */
    public ListRecoveryPointsRecommendedForMoveRequest withExcludedRPList(List<String> excludedRPList) {
        this.excludedRPList = excludedRPList;
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
