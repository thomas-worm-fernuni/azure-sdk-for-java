// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentPermission;
import com.azure.resourcemanager.devtestlabs.models.Lab;
import com.azure.resourcemanager.devtestlabs.models.PremiumDataDisk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LabsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"defaultStorageAccount\":\"iuqhibtozipqwj\",\"defaultPremiumStorageAccount\":\"mur\",\"artifactsStorageAccount\":\"x\",\"premiumDataDiskStorageAccount\":\"wpktvqylkmqpzoyh\",\"vaultName\":\"bcg\",\"labStorageType\":\"Premium\",\"mandatoryArtifactsResourceIdsLinux\":[\"xoe\",\"qinjipnwjf\"],\"mandatoryArtifactsResourceIdsWindows\":[\"lafcbahh\",\"zpofoiyjwpfilk\",\"kkholvdndvia\",\"ogphuartvtiu\"],\"createdDate\":\"2021-06-19T17:51:10Z\",\"premiumDataDisks\":\"Disabled\",\"environmentPermission\":\"Reader\",\"announcement\":{\"title\":\"ahmnxhkxjqirw\",\"markdown\":\"eooxffifh\",\"enabled\":\"Disabled\",\"expirationDate\":\"2021-08-23T22:39:46Z\",\"expired\":true,\"provisioningState\":\"ozqvbubqmam\",\"uniqueIdentifier\":\"ycxhxzgaztta\"},\"support\":{\"enabled\":\"Disabled\",\"markdown\":\"mfqhppubowse\"},\"vmCreationResourceGroup\":\"fgkmtdhern\",\"publicIpId\":\"tcjuahokqto\",\"loadBalancerId\":\"auxofshfph\",\"networkSecurityGroupId\":\"nulaiywzejywhsl\",\"extendedProperties\":{\"fgf\":\"jpllndnpdwrpq\",\"yetefyp\":\"gsnnf\",\"fjgtixrjvzuy\":\"coc\",\"olbauirop\":\"urmlmuo\"},\"provisioningState\":\"nszonwpngaj\",\"uniqueIdentifier\":\"nixjawrtmjfjmy\"},\"location\":\"cxlzhcoxovnekh\",\"tags\":{\"tjxtxr\":\"usfnr\",\"jvidttge\":\"cq\",\"iesfuug\":\"uslvyjtcvuwkasi\",\"xu\":\"tuqfecjxeygtu\"},\"id\":\"cbuewmrswnjlxuz\",\"name\":\"hwpusxj\",\"type\":\"aqehg\"}]}";

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

        DevTestLabsManager manager =
            DevTestLabsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Lab> response =
            manager.labs().list("fabuiyjibu", "phdu", 1828577256, "eiknpgo", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("cxlzhcoxovnekh", response.iterator().next().location());
        Assertions.assertEquals("usfnr", response.iterator().next().tags().get("tjxtxr"));
        Assertions.assertEquals(StorageType.PREMIUM, response.iterator().next().labStorageType());
        Assertions.assertEquals("xoe", response.iterator().next().mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("lafcbahh", response.iterator().next().mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.DISABLED, response.iterator().next().premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.READER, response.iterator().next().environmentPermission());
        Assertions.assertEquals("ahmnxhkxjqirw", response.iterator().next().announcement().title());
        Assertions.assertEquals("eooxffifh", response.iterator().next().announcement().markdown());
        Assertions.assertEquals(EnableStatus.DISABLED, response.iterator().next().announcement().enabled());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-08-23T22:39:46Z"),
                response.iterator().next().announcement().expirationDate());
        Assertions.assertEquals(true, response.iterator().next().announcement().expired());
        Assertions.assertEquals(EnableStatus.DISABLED, response.iterator().next().support().enabled());
        Assertions.assertEquals("mfqhppubowse", response.iterator().next().support().markdown());
        Assertions.assertEquals("jpllndnpdwrpq", response.iterator().next().extendedProperties().get("fgf"));
    }
}
