// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ListEdgePoliciesInput;
import org.junit.jupiter.api.Assertions;

public final class ListEdgePoliciesInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListEdgePoliciesInput model =
            BinaryData.fromString("{\"deviceId\":\"hb\"}").toObject(ListEdgePoliciesInput.class);
        Assertions.assertEquals("hb", model.deviceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListEdgePoliciesInput model = new ListEdgePoliciesInput().withDeviceId("hb");
        model = BinaryData.fromObject(model).toObject(ListEdgePoliciesInput.class);
        Assertions.assertEquals("hb", model.deviceId());
    }
}
