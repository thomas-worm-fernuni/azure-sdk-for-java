// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.OperationResultProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationResultPropertiesTests {
    @Test
    public void testDeserialize() {
        OperationResultProperties model =
            BinaryData
                .fromString(
                    "{\"operationKind\":\"minrfdw\",\"provisioningState\":\"Deleting\",\"operationState\":\"hziuiefozbhdms\"}")
                .toObject(OperationResultProperties.class);
        Assertions.assertEquals("minrfdw", model.operationKind());
        Assertions.assertEquals("hziuiefozbhdms", model.operationState());
    }

    @Test
    public void testSerialize() {
        OperationResultProperties model =
            new OperationResultProperties().withOperationKind("minrfdw").withOperationState("hziuiefozbhdms");
        model = BinaryData.fromObject(model).toObject(OperationResultProperties.class);
        Assertions.assertEquals("minrfdw", model.operationKind());
        Assertions.assertEquals("hziuiefozbhdms", model.operationState());
    }
}
