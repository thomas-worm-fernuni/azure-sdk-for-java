// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanInner;
import com.azure.resourcemanager.elasticsan.models.Sku;
import com.azure.resourcemanager.elasticsan.models.SkuName;
import com.azure.resourcemanager.elasticsan.models.SkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ElasticSanInnerTests {
    @Test
    public void testDeserialize() {
        ElasticSanInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"sku\":{\"name\":\"Premium_LRS\",\"tier\":\"Premium\"},\"availabilityZones\":[\"dhugjzzdatqxhocd\",\"eablg\",\"huticndvkao\",\"wyiftyhxhur\"],\"provisioningState\":\"Pending\",\"baseSizeTiB\":2402259301927489199,\"extendedCapacitySizeTiB\":5881942076944182815,\"totalVolumeSizeGiB\":921409398987301775,\"volumeGroupCount\":6179231024758193483,\"totalIops\":4659788042682990061,\"totalMBps\":8901004615962760230,\"totalSizeTiB\":8355721007467412768},\"location\":\"xklrypl\",\"tags\":{\"nddhsgcbacph\":\"basyy\",\"nqgoulzndli\":\"jkot\"},\"id\":\"wyqkgfgibm\",\"name\":\"dgak\",\"type\":\"qsrxybzqqed\"}")
                .toObject(ElasticSanInner.class);
        Assertions.assertEquals("xklrypl", model.location());
        Assertions.assertEquals("basyy", model.tags().get("nddhsgcbacph"));
        Assertions.assertEquals(SkuName.PREMIUM_LRS, model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("dhugjzzdatqxhocd", model.availabilityZones().get(0));
        Assertions.assertEquals(2402259301927489199L, model.baseSizeTiB());
        Assertions.assertEquals(5881942076944182815L, model.extendedCapacitySizeTiB());
    }

    @Test
    public void testSerialize() {
        ElasticSanInner model =
            new ElasticSanInner()
                .withLocation("xklrypl")
                .withTags(mapOf("nddhsgcbacph", "basyy", "nqgoulzndli", "jkot"))
                .withSku(new Sku().withName(SkuName.PREMIUM_LRS).withTier(SkuTier.PREMIUM))
                .withAvailabilityZones(Arrays.asList("dhugjzzdatqxhocd", "eablg", "huticndvkao", "wyiftyhxhur"))
                .withBaseSizeTiB(2402259301927489199L)
                .withExtendedCapacitySizeTiB(5881942076944182815L);
        model = BinaryData.fromObject(model).toObject(ElasticSanInner.class);
        Assertions.assertEquals("xklrypl", model.location());
        Assertions.assertEquals("basyy", model.tags().get("nddhsgcbacph"));
        Assertions.assertEquals(SkuName.PREMIUM_LRS, model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("dhugjzzdatqxhocd", model.availabilityZones().get(0));
        Assertions.assertEquals(2402259301927489199L, model.baseSizeTiB());
        Assertions.assertEquals(5881942076944182815L, model.extendedCapacitySizeTiB());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
