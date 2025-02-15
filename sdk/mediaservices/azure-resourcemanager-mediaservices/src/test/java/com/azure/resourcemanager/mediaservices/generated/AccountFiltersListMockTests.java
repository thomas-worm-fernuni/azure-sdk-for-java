// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.AccountFilter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AccountFiltersListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"presentationTimeRange\":{\"startTimestamp\":8913545670750605330,\"endTimestamp\":3973378741757225824,\"presentationWindowDuration\":2211068744764574352,\"liveBackoffDuration\":405777286175718528,\"timescale\":7995359679400580024,\"forceEndTimestamp\":false},\"firstQuality\":{\"bitrate\":1434818568},\"tracks\":[]},\"id\":\"ubdyhgk\",\"name\":\"minsgowzf\",\"type\":\"tsttktlahbq\"}]}";

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

        MediaServicesManager manager =
            MediaServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AccountFilter> response =
            manager.accountFilters().list("ksbpimlqoljx", "cgxxlxs", com.azure.core.util.Context.NONE);

        Assertions
            .assertEquals(8913545670750605330L, response.iterator().next().presentationTimeRange().startTimestamp());
        Assertions
            .assertEquals(3973378741757225824L, response.iterator().next().presentationTimeRange().endTimestamp());
        Assertions
            .assertEquals(
                2211068744764574352L, response.iterator().next().presentationTimeRange().presentationWindowDuration());
        Assertions
            .assertEquals(
                405777286175718528L, response.iterator().next().presentationTimeRange().liveBackoffDuration());
        Assertions.assertEquals(7995359679400580024L, response.iterator().next().presentationTimeRange().timescale());
        Assertions.assertEquals(false, response.iterator().next().presentationTimeRange().forceEndTimestamp());
        Assertions.assertEquals(1434818568, response.iterator().next().firstQuality().bitrate());
    }
}
