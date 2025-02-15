// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Acr error response describing why the operation failed. */
@Fluent
public final class AcrErrors {
    /*
     * Array of detailed error
     */
    @JsonProperty(value = "errors")
    private List<AcrErrorInfo> errors;

    /** Creates an instance of AcrErrors class. */
    public AcrErrors() {}

    /**
     * Get the errors property: Array of detailed error.
     *
     * @return the errors value.
     */
    public List<AcrErrorInfo> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: Array of detailed error.
     *
     * @param errors the errors value to set.
     * @return the AcrErrors object itself.
     */
    public AcrErrors setErrors(List<AcrErrorInfo> errors) {
        this.errors = errors;
        return this;
    }
}
