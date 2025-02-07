// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resourceconnector.models.UpgradeGraphProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Upgrade Graph for appliance. */
@Fluent
public final class UpgradeGraphInner {
    /*
     * The appliance resource path
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The release train name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The properties of supported version
     */
    @JsonProperty(value = "properties")
    private UpgradeGraphProperties properties;

    /**
     * Get the id property: The appliance resource path.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The release train name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the properties property: The properties of supported version.
     *
     * @return the properties value.
     */
    public UpgradeGraphProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of supported version.
     *
     * @param properties the properties value to set.
     * @return the UpgradeGraphInner object itself.
     */
    public UpgradeGraphInner withProperties(UpgradeGraphProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
