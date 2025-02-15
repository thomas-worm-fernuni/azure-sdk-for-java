// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.certificates.implementation;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * The certificate update parameters.
 */
@Fluent
public final class CertificateUpdateParameters {

    /**
     * The attributes of the certificate (optional).
     */
    @JsonProperty(value = "attributes")
    private CertificateRequestAttributes certificateAttributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the certificateAttributes value.
     *
     * @return the certificateAttributes value
     */
    public CertificateRequestAttributes certificateAttributes() {
        return this.certificateAttributes;
    }

    /**
     * Set the certificateAttributes value.
     *
     * @param certificateAttributes the certificateAttributes value to set
     * @return the CertificateUpdateParameters object itself.
     */
    public CertificateUpdateParameters certificateAttributes(CertificateRequestAttributes certificateAttributes) {
        this.certificateAttributes = certificateAttributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the CertificateUpdateParameters object itself.
     */
    public CertificateUpdateParameters tags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
}
