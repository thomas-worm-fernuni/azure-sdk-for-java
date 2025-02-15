// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.ResourceSku;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSkuTier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceSkuTests {
    @Test
    public void testDeserialize() {
        ResourceSku model =
            BinaryData
                .fromString(
                    "{\"name\":\"zwtruwiqzbqjvsov\",\"tier\":\"Basic\",\"size\":\"acspkwl\",\"family\":\"dobpxjmflbvvn\",\"capacity\":1044580515}")
                .toObject(ResourceSku.class);
        Assertions.assertEquals("zwtruwiqzbqjvsov", model.name());
        Assertions.assertEquals(WebPubSubSkuTier.BASIC, model.tier());
        Assertions.assertEquals(1044580515, model.capacity());
    }

    @Test
    public void testSerialize() {
        ResourceSku model =
            new ResourceSku().withName("zwtruwiqzbqjvsov").withTier(WebPubSubSkuTier.BASIC).withCapacity(1044580515);
        model = BinaryData.fromObject(model).toObject(ResourceSku.class);
        Assertions.assertEquals("zwtruwiqzbqjvsov", model.name());
        Assertions.assertEquals(WebPubSubSkuTier.BASIC, model.tier());
        Assertions.assertEquals(1044580515, model.capacity());
    }
}
