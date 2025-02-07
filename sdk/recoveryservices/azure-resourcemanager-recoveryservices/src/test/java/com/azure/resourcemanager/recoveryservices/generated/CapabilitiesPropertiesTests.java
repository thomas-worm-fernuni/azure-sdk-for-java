// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.CapabilitiesProperties;
import com.azure.resourcemanager.recoveryservices.models.DnsZone;
import com.azure.resourcemanager.recoveryservices.models.VaultSubResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CapabilitiesPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapabilitiesProperties model =
            BinaryData
                .fromString(
                    "{\"dnsZones\":[{\"subResource\":\"AzureSiteRecovery\"},{\"subResource\":\"AzureBackup\"},{\"subResource\":\"AzureSiteRecovery\"}]}")
                .toObject(CapabilitiesProperties.class);
        Assertions.assertEquals(VaultSubResourceType.AZURE_SITE_RECOVERY, model.dnsZones().get(0).subResource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapabilitiesProperties model =
            new CapabilitiesProperties()
                .withDnsZones(
                    Arrays
                        .asList(
                            new DnsZone().withSubResource(VaultSubResourceType.AZURE_SITE_RECOVERY),
                            new DnsZone().withSubResource(VaultSubResourceType.AZURE_BACKUP),
                            new DnsZone().withSubResource(VaultSubResourceType.AZURE_SITE_RECOVERY)));
        model = BinaryData.fromObject(model).toObject(CapabilitiesProperties.class);
        Assertions.assertEquals(VaultSubResourceType.AZURE_SITE_RECOVERY, model.dnsZones().get(0).subResource());
    }
}
