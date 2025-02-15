// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.NotificationChannel;
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

public final class NotificationChannelsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"webHookUrl\":\"p\",\"emailRecipient\":\"xqcsehch\",\"notificationLocale\":\"ufmpqumqyjgy\",\"description\":\"ulodsaeuzanhsfnh\",\"events\":[],\"createdDate\":\"2020-12-23T17:30:48Z\",\"provisioningState\":\"pzfngqjcli\",\"uniqueIdentifier\":\"tujwjju\"},\"location\":\"wbeqrkuor\",\"tags\":{\"c\":\"sruqnmdvha\",\"iqswbqer\":\"jy\",\"iytxt\":\"w\",\"dstyouam\":\"gukvlbpkt\"},\"id\":\"ewres\",\"name\":\"moweg\",\"type\":\"mut\"}";

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

        NotificationChannel response =
            manager
                .notificationChannels()
                .define("juvsmbmslzoyovw")
                .withRegion("bbmnwagltb")
                .withExistingLab("ltixldzyyfytpq", "ixymmpujivyql")
                .withTags(mapOf("mvqdbpbhfckdvez", "eonqlnfwmy", "b", "rcssbzhddubbnq", "alehpav", "h"))
                .withWebhookUrl("bpqvybefg")
                .withEmailRecipient("x")
                .withNotificationLocale("kcvtl")
                .withDescription("seskvcuar")
                .withEvents(Arrays.asList())
                .create();

        Assertions.assertEquals("wbeqrkuor", response.location());
        Assertions.assertEquals("sruqnmdvha", response.tags().get("c"));
        Assertions.assertEquals("p", response.webhookUrl());
        Assertions.assertEquals("xqcsehch", response.emailRecipient());
        Assertions.assertEquals("ufmpqumqyjgy", response.notificationLocale());
        Assertions.assertEquals("ulodsaeuzanhsfnh", response.description());
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
