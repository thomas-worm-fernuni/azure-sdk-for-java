// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.servicenetworking.models.Association;
import com.azure.resourcemanager.servicenetworking.models.AssociationSubnet;
import com.azure.resourcemanager.servicenetworking.models.AssociationType;
import com.azure.resourcemanager.servicenetworking.models.AssociationUpdateProperties;

/** Samples for AssociationsInterface Update. */
public final class AssociationsInterfaceUpdateSamples {
    /*
     * x-ms-original-file: specification/servicenetworking/resource-manager/Microsoft.ServiceNetworking/cadl/examples/AssociationPatch.json
     */
    /**
     * Sample code: Update Association.
     *
     * @param manager Entry point to TrafficControllerManager.
     */
    public static void updateAssociation(com.azure.resourcemanager.servicenetworking.TrafficControllerManager manager) {
        Association resource =
            manager.associationsInterfaces().getWithResponse("rg1", "TC1", "associatedvnet-1", Context.NONE).getValue();
        resource
            .update()
            .withProperties(
                new AssociationUpdateProperties()
                    .withAssociationType(AssociationType.SUBNETS)
                    .withSubnet(new AssociationSubnet().withId("subnetFullRef")))
            .apply();
    }
}
