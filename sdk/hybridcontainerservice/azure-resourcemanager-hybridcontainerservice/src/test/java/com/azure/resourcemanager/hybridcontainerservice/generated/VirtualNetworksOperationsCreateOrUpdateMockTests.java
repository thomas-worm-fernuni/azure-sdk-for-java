// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworks;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPropertiesInfraVnetProfile;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VirtualNetworksOperationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"infraVnetProfile\":{},\"vipPool\":[],\"vmipPool\":[],\"dhcpServers\":[\"fwafqrouda\",\"pavehhr\"],\"dnsServers\":[\"unzo\",\"ud\",\"cxgkmoyxcdyui\"],\"gateway\":\"mfdn\",\"ipAddressPrefix\":\"ydvfvfcjnae\",\"vlanID\":\"srvhmgorffuki\",\"provisioningState\":\"Succeeded\",\"status\":{}},\"extendedLocation\":{\"type\":\"plef\",\"name\":\"vxilcbt\"},\"location\":\"nhnzeyqxt\",\"tags\":{\"vodggxdbee\":\"zqlqhyc\",\"wiuagydwqf\":\"mieknlraria\",\"ocqwogfnzjvus\":\"ylyrfgiagtco\"},\"id\":\"zldmozuxy\",\"name\":\"fsbtkad\",\"type\":\"ysownbtgkbug\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        HybridContainerServiceManager manager =
            HybridContainerServiceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        VirtualNetworks response =
            manager
                .virtualNetworksOperations()
                .define("hezwwvaiq")
                .withRegion("mtk")
                .withExistingResourceGroup("auzzptjazysd")
                .withTags(mapOf("dxzxhi", "tppn", "vqagtltdhlf", "frbbc"))
                .withProperties(
                    new VirtualNetworksProperties()
                        .withInfraVnetProfile(new VirtualNetworksPropertiesInfraVnetProfile())
                        .withVipPool(Arrays.asList())
                        .withVmipPool(Arrays.asList()))
                .withExtendedLocation(new VirtualNetworksExtendedLocation().withType("i").withName("zvhxnk"))
                .create();

        Assertions.assertEquals("nhnzeyqxt", response.location());
        Assertions.assertEquals("zqlqhyc", response.tags().get("vodggxdbee"));
        Assertions.assertEquals("plef", response.extendedLocation().type());
        Assertions.assertEquals("vxilcbt", response.extendedLocation().name());
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
