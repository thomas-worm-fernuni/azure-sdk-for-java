// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.ConnectivityConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list network manager connectivity configurations. It contains a list of configurations and a
 * link to get the next set of results.
 */
@Fluent
public final class ConnectivityConfigurationListResult {
    /*
     * Gets a page of Connectivity Configurations
     */
    @JsonProperty(value = "value")
    private List<ConnectivityConfigurationInner> value;

    /*
     * Gets the URL to get the next page of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ConnectivityConfigurationListResult class. */
    public ConnectivityConfigurationListResult() {
    }

    /**
     * Get the value property: Gets a page of Connectivity Configurations.
     *
     * @return the value value.
     */
    public List<ConnectivityConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a page of Connectivity Configurations.
     *
     * @param value the value value to set.
     * @return the ConnectivityConfigurationListResult object itself.
     */
    public ConnectivityConfigurationListResult withValue(List<ConnectivityConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the URL to get the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the URL to get the next page of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ConnectivityConfigurationListResult object itself.
     */
    public ConnectivityConfigurationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
