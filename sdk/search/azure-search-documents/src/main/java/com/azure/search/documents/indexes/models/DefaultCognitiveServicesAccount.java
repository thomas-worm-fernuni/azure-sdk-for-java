// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** An empty object that represents the default cognitive service resource for a skillset. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.DefaultCognitiveServices")
@Fluent
public final class DefaultCognitiveServicesAccount extends CognitiveServicesAccount {

    /*
     * Identifies the concrete type of the cognitive service resource attached to a skillset.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.DefaultCognitiveServices";

    /** Creates an instance of DefaultCognitiveServicesAccount class. */
    public DefaultCognitiveServicesAccount() {}

    /** {@inheritDoc} */
    @Override
    public DefaultCognitiveServicesAccount setDescription(String description) {
        super.setDescription(description);
        return this;
    }
}
