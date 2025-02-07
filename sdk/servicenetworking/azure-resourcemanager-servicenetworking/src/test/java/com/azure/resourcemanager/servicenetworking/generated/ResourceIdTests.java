// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.models.ResourceId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceIdTests {
    @Test
    public void testDeserialize() {
        ResourceId model = BinaryData.fromString("{\"id\":\"nfygxgispemvtz\"}").toObject(ResourceId.class);
        Assertions.assertEquals("nfygxgispemvtz", model.id());
    }

    @Test
    public void testSerialize() {
        ResourceId model = new ResourceId().withId("nfygxgispemvtz");
        model = BinaryData.fromObject(model).toObject(ResourceId.class);
        Assertions.assertEquals("nfygxgispemvtz", model.id());
    }
}
