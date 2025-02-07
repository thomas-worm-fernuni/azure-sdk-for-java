// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.trafficmanager.fluent.models.EndpointInner;
import com.azure.resourcemanager.trafficmanager.models.EndpointPropertiesCustomHeadersItem;
import com.azure.resourcemanager.trafficmanager.models.EndpointPropertiesSubnetsItem;
import com.azure.resourcemanager.trafficmanager.models.EndpointStatus;
import java.util.Arrays;

/** Samples for Endpoints CreateOrUpdate. */
public final class EndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/trafficmanager/resource-manager/Microsoft.Network/stable/2018-04-01/examples/Endpoint-PUT-External-WithSubnetMapping.json
     */
    /**
     * Sample code: Endpoint-PUT-External-WithSubnetMapping.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void endpointPUTExternalWithSubnetMapping(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .trafficManagerProfiles()
            .manager()
            .serviceClient()
            .getEndpoints()
            .createOrUpdateWithResponse(
                "azuresdkfornetautoresttrafficmanager2191",
                "azuresdkfornetautoresttrafficmanager8224",
                "ExternalEndpoints",
                "My%20external%20endpoint",
                new EndpointInner()
                    .withName("My external endpoint")
                    .withType("Microsoft.network/TrafficManagerProfiles/ExternalEndpoints")
                    .withTarget("foobar.contoso.com")
                    .withEndpointStatus(EndpointStatus.ENABLED)
                    .withSubnets(
                        Arrays
                            .asList(
                                new EndpointPropertiesSubnetsItem().withFirst("1.2.3.0").withScope(24),
                                new EndpointPropertiesSubnetsItem().withFirst("25.26.27.28").withLast("29.30.31.32"))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/trafficmanager/resource-manager/Microsoft.Network/stable/2018-04-01/examples/Endpoint-PUT-External-WithCustomHeaders.json
     */
    /**
     * Sample code: Endpoint-PUT-External-WithCustomHeaders.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void endpointPUTExternalWithCustomHeaders(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .trafficManagerProfiles()
            .manager()
            .serviceClient()
            .getEndpoints()
            .createOrUpdateWithResponse(
                "azuresdkfornetautoresttrafficmanager1421",
                "azsmnet6386",
                "ExternalEndpoints",
                "azsmnet7187",
                new EndpointInner()
                    .withName("azsmnet7187")
                    .withType("Microsoft.network/TrafficManagerProfiles/ExternalEndpoints")
                    .withTarget("foobar.contoso.com")
                    .withEndpointStatus(EndpointStatus.ENABLED)
                    .withEndpointLocation("North Europe")
                    .withCustomHeaders(
                        Arrays
                            .asList(
                                new EndpointPropertiesCustomHeadersItem().withName("header-1").withValue("value-1"),
                                new EndpointPropertiesCustomHeadersItem().withName("header-2").withValue("value-2"))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/trafficmanager/resource-manager/Microsoft.Network/stable/2018-04-01/examples/Endpoint-PUT-External-WithLocation.json
     */
    /**
     * Sample code: Endpoint-PUT-External-WithLocation.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void endpointPUTExternalWithLocation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .trafficManagerProfiles()
            .manager()
            .serviceClient()
            .getEndpoints()
            .createOrUpdateWithResponse(
                "azuresdkfornetautoresttrafficmanager1421",
                "azsmnet6386",
                "ExternalEndpoints",
                "azsmnet7187",
                new EndpointInner()
                    .withName("azsmnet7187")
                    .withType("Microsoft.network/TrafficManagerProfiles/ExternalEndpoints")
                    .withTarget("foobar.contoso.com")
                    .withEndpointStatus(EndpointStatus.ENABLED)
                    .withEndpointLocation("North Europe"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/trafficmanager/resource-manager/Microsoft.Network/stable/2018-04-01/examples/Endpoint-PUT-External-WithGeoMapping.json
     */
    /**
     * Sample code: Endpoint-PUT-External-WithGeoMapping.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void endpointPUTExternalWithGeoMapping(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .trafficManagerProfiles()
            .manager()
            .serviceClient()
            .getEndpoints()
            .createOrUpdateWithResponse(
                "azuresdkfornetautoresttrafficmanager2191",
                "azuresdkfornetautoresttrafficmanager8224",
                "ExternalEndpoints",
                "My%20external%20endpoint",
                new EndpointInner()
                    .withName("My external endpoint")
                    .withType("Microsoft.network/TrafficManagerProfiles/ExternalEndpoints")
                    .withTarget("foobar.contoso.com")
                    .withEndpointStatus(EndpointStatus.ENABLED)
                    .withGeoMapping(Arrays.asList("GEO-AS", "GEO-AF")),
                Context.NONE);
    }
}
