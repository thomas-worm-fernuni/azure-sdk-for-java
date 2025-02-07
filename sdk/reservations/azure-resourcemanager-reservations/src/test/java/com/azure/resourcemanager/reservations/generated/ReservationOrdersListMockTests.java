// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.reservations.ReservationsManager;
import com.azure.resourcemanager.reservations.models.ProvisioningState;
import com.azure.resourcemanager.reservations.models.ReservationBillingPlan;
import com.azure.resourcemanager.reservations.models.ReservationOrderResponse;
import com.azure.resourcemanager.reservations.models.ReservationTerm;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReservationOrdersListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"etag\":1047026822,\"properties\":{\"displayName\":\"hcrat\",\"requestDateTime\":\"2021-08-13T20:41:57Z\",\"createdDateTime\":\"2021-06-27T16:40:41Z\",\"expiryDateTime\":\"2021-01-21T03:47:46Z\",\"benefitStartTime\":\"2021-07-03T11:09:27Z\",\"originalQuantity\":1438708374,\"term\":\"P1Y\",\"provisioningState\":\"PendingBilling\",\"billingPlan\":\"Monthly\",\"planInformation\":{\"transactions\":[]},\"reservations\":[],\"reviewDateTime\":\"2021-06-13T10:36:32Z\"},\"id\":\"honnxkrlgnyhmos\",\"name\":\"xkk\",\"type\":\"thrrgh\"}]}";

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

        ReservationsManager manager =
            ReservationsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ReservationOrderResponse> response =
            manager.reservationOrders().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals(1047026822, response.iterator().next().etag());
        Assertions.assertEquals("hcrat", response.iterator().next().displayName());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-08-13T20:41:57Z"), response.iterator().next().requestDateTime());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-06-27T16:40:41Z"), response.iterator().next().createdDateTime());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-01-21T03:47:46Z"), response.iterator().next().expiryDateTime());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-07-03T11:09:27Z"), response.iterator().next().benefitStartTime());
        Assertions.assertEquals(1438708374, response.iterator().next().originalQuantity());
        Assertions.assertEquals(ReservationTerm.P1Y, response.iterator().next().term());
        Assertions.assertEquals(ProvisioningState.PENDING_BILLING, response.iterator().next().provisioningState());
        Assertions.assertEquals(ReservationBillingPlan.MONTHLY, response.iterator().next().billingPlan());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-06-13T10:36:32Z"), response.iterator().next().reviewDateTime());
    }
}
