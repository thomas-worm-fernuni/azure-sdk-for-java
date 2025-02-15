// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Auth Secrets for Container App Scale Rule. */
@Fluent
public final class ScaleRuleAuth {
    /*
     * Name of the Container App secret from which to pull the auth params.
     */
    @JsonProperty(value = "secretRef")
    private String secretRef;

    /*
     * Trigger Parameter that uses the secret
     */
    @JsonProperty(value = "triggerParameter")
    private String triggerParameter;

    /** Creates an instance of ScaleRuleAuth class. */
    public ScaleRuleAuth() {
    }

    /**
     * Get the secretRef property: Name of the Container App secret from which to pull the auth params.
     *
     * @return the secretRef value.
     */
    public String secretRef() {
        return this.secretRef;
    }

    /**
     * Set the secretRef property: Name of the Container App secret from which to pull the auth params.
     *
     * @param secretRef the secretRef value to set.
     * @return the ScaleRuleAuth object itself.
     */
    public ScaleRuleAuth withSecretRef(String secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    /**
     * Get the triggerParameter property: Trigger Parameter that uses the secret.
     *
     * @return the triggerParameter value.
     */
    public String triggerParameter() {
        return this.triggerParameter;
    }

    /**
     * Set the triggerParameter property: Trigger Parameter that uses the secret.
     *
     * @param triggerParameter the triggerParameter value to set.
     * @return the ScaleRuleAuth object itself.
     */
    public ScaleRuleAuth withTriggerParameter(String triggerParameter) {
        this.triggerParameter = triggerParameter;
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
