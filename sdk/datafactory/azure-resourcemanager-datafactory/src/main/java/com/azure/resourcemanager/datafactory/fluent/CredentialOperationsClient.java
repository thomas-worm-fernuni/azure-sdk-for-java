// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedIdentityCredentialResourceInner;

/** An instance of this class provides access to all the operations defined in CredentialOperationsClient. */
public interface CredentialOperationsClient {
    /**
     * List credentials.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of credential resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedIdentityCredentialResourceInner> listByFactory(String resourceGroupName, String factoryName);

    /**
     * List credentials.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of credential resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedIdentityCredentialResourceInner> listByFactory(
        String resourceGroupName, String factoryName, Context context);

    /**
     * Creates or updates a credential.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param credentialName Credential name.
     * @param credential Credential resource definition.
     * @param ifMatch ETag of the credential entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return credential resource type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedIdentityCredentialResourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String factoryName,
        String credentialName,
        ManagedIdentityCredentialResourceInner credential,
        String ifMatch,
        Context context);

    /**
     * Creates or updates a credential.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param credentialName Credential name.
     * @param credential Credential resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return credential resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedIdentityCredentialResourceInner createOrUpdate(
        String resourceGroupName,
        String factoryName,
        String credentialName,
        ManagedIdentityCredentialResourceInner credential);

    /**
     * Gets a credential.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param credentialName Credential name.
     * @param ifNoneMatch ETag of the credential entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a credential along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedIdentityCredentialResourceInner> getWithResponse(
        String resourceGroupName, String factoryName, String credentialName, String ifNoneMatch, Context context);

    /**
     * Gets a credential.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param credentialName Credential name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedIdentityCredentialResourceInner get(String resourceGroupName, String factoryName, String credentialName);

    /**
     * Deletes a credential.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param credentialName Credential name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String credentialName, Context context);

    /**
     * Deletes a credential.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param credentialName Credential name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String factoryName, String credentialName);
}
