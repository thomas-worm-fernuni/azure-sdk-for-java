// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/** Samples for Assets Get. */
public final class AssetsGetSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/assets-get-by-name.json
     */
    /**
     * Sample code: Get an Asset by name.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void getAnAssetByName(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .assets()
            .getWithResponse("contoso", "contosomedia", "ClimbingMountAdams", com.azure.core.util.Context.NONE);
    }
}
