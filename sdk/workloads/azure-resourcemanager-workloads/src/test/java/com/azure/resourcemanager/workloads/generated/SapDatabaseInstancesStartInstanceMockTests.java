// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.workloads.WorkloadsManager;
import com.azure.resourcemanager.workloads.models.OperationStatusResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SapDatabaseInstancesStartInstanceMockTests {
    @Test
    public void testStartInstance() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"niexzsrzpgepq\",\"name\":\"bb\",\"status\":\"wpgdak\",\"percentComplete\":27.999931,\"startTime\":\"2021-03-31T06:49:58Z\",\"endTime\":\"2021-04-07T03:58:53Z\",\"operations\":[{\"id\":\"rkcxkj\",\"name\":\"nxm\",\"status\":\"suxswqrntvlwijp\",\"percentComplete\":53.95531,\"startTime\":\"2021-02-23T21:39:28Z\",\"endTime\":\"2021-11-08T06:52:34Z\",\"operations\":[]}]}";

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

        WorkloadsManager manager =
            WorkloadsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatusResult response =
            manager
                .sapDatabaseInstances()
                .startInstance("wyh", "hnomdrkywuh", "svfuurutlwexxwl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("niexzsrzpgepq", response.id());
        Assertions.assertEquals("bb", response.name());
        Assertions.assertEquals("wpgdak", response.status());
        Assertions.assertEquals(27.999931F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-31T06:49:58Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-07T03:58:53Z"), response.endTime());
        Assertions.assertEquals("rkcxkj", response.operations().get(0).id());
        Assertions.assertEquals("nxm", response.operations().get(0).name());
        Assertions.assertEquals("suxswqrntvlwijp", response.operations().get(0).status());
        Assertions.assertEquals(53.95531F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T21:39:28Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-08T06:52:34Z"), response.operations().get(0).endTime());
    }
}
