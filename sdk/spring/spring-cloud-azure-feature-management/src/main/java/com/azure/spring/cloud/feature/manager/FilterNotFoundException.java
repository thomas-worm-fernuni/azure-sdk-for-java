// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.feature.manager;

import com.azure.spring.cloud.feature.manager.models.FeatureFilterEvaluationContext;

/**
 * This class defines a custom exception type for when an expected Filter is not found when checking if a Feature is
 * enabled. A FilterNotFoundException is only thrown when failfast is enabled, which is true by default.
 */
public final class FilterNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final transient FeatureFilterEvaluationContext filter;

    /**
     * Exception message
     */
    private final String message;

    /**
     * Creates a new instance of the FilterNotFoundException
     *
     * @param message the error message.
     * @param cause the original error thrown, typically of NoSuchBeanDefinitionException type.
     * @param filter The filter context used to find the not found filter.
     */
    FilterNotFoundException(String message, Throwable cause, FeatureFilterEvaluationContext filter) {
        super(message, cause);
        this.message = message;
        this.filter = filter;
    }

    @Override
    public String getMessage() {
        if (filter == null) {
            return getCause().getMessage() + ".";
        }
        return this.message + ": " + filter.getName();

    }

}
