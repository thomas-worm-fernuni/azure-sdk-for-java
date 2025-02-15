// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.FirewallRuleProperties;
import org.junit.jupiter.api.Assertions;

public final class FirewallRulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FirewallRuleProperties model =
            BinaryData
                .fromString("{\"startIpAddress\":\"gidokgjljyoxgvcl\",\"endIpAddress\":\"bgsncghkjeszzhb\"}")
                .toObject(FirewallRuleProperties.class);
        Assertions.assertEquals("gidokgjljyoxgvcl", model.startIpAddress());
        Assertions.assertEquals("bgsncghkjeszzhb", model.endIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FirewallRuleProperties model =
            new FirewallRuleProperties().withStartIpAddress("gidokgjljyoxgvcl").withEndIpAddress("bgsncghkjeszzhb");
        model = BinaryData.fromObject(model).toObject(FirewallRuleProperties.class);
        Assertions.assertEquals("gidokgjljyoxgvcl", model.startIpAddress());
        Assertions.assertEquals("bgsncghkjeszzhb", model.endIpAddress());
    }
}
