// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configure your SQL virtual machine to be able to connect to the Azure Key Vault service. */
@Fluent
public final class KeyVaultCredentialSettings {
    /*
     * Enable or disable key vault credential setting.
     */
    @JsonProperty(value = "enable")
    private Boolean enable;

    /*
     * Credential name.
     */
    @JsonProperty(value = "credentialName")
    private String credentialName;

    /*
     * Azure Key Vault url.
     */
    @JsonProperty(value = "azureKeyVaultUrl")
    private String azureKeyVaultUrl;

    /*
     * Service principal name to access key vault.
     */
    @JsonProperty(value = "servicePrincipalName")
    private String servicePrincipalName;

    /*
     * Service principal name secret to access key vault.
     */
    @JsonProperty(value = "servicePrincipalSecret")
    private String servicePrincipalSecret;

    /**
     * Get the enable property: Enable or disable key vault credential setting.
     *
     * @return the enable value.
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set the enable property: Enable or disable key vault credential setting.
     *
     * @param enable the enable value to set.
     * @return the KeyVaultCredentialSettings object itself.
     */
    public KeyVaultCredentialSettings withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get the credentialName property: Credential name.
     *
     * @return the credentialName value.
     */
    public String credentialName() {
        return this.credentialName;
    }

    /**
     * Set the credentialName property: Credential name.
     *
     * @param credentialName the credentialName value to set.
     * @return the KeyVaultCredentialSettings object itself.
     */
    public KeyVaultCredentialSettings withCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }

    /**
     * Get the azureKeyVaultUrl property: Azure Key Vault url.
     *
     * @return the azureKeyVaultUrl value.
     */
    public String azureKeyVaultUrl() {
        return this.azureKeyVaultUrl;
    }

    /**
     * Set the azureKeyVaultUrl property: Azure Key Vault url.
     *
     * @param azureKeyVaultUrl the azureKeyVaultUrl value to set.
     * @return the KeyVaultCredentialSettings object itself.
     */
    public KeyVaultCredentialSettings withAzureKeyVaultUrl(String azureKeyVaultUrl) {
        this.azureKeyVaultUrl = azureKeyVaultUrl;
        return this;
    }

    /**
     * Get the servicePrincipalName property: Service principal name to access key vault.
     *
     * @return the servicePrincipalName value.
     */
    public String servicePrincipalName() {
        return this.servicePrincipalName;
    }

    /**
     * Set the servicePrincipalName property: Service principal name to access key vault.
     *
     * @param servicePrincipalName the servicePrincipalName value to set.
     * @return the KeyVaultCredentialSettings object itself.
     */
    public KeyVaultCredentialSettings withServicePrincipalName(String servicePrincipalName) {
        this.servicePrincipalName = servicePrincipalName;
        return this;
    }

    /**
     * Get the servicePrincipalSecret property: Service principal name secret to access key vault.
     *
     * @return the servicePrincipalSecret value.
     */
    public String servicePrincipalSecret() {
        return this.servicePrincipalSecret;
    }

    /**
     * Set the servicePrincipalSecret property: Service principal name secret to access key vault.
     *
     * @param servicePrincipalSecret the servicePrincipalSecret value to set.
     * @return the KeyVaultCredentialSettings object itself.
     */
    public KeyVaultCredentialSettings withServicePrincipalSecret(String servicePrincipalSecret) {
        this.servicePrincipalSecret = servicePrincipalSecret;
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
