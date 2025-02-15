// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.tracing.opentelemetry;

import com.azure.core.util.logging.ClientLogger;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static com.azure.core.util.tracing.Tracer.ENTITY_PATH_KEY;
import static com.azure.core.util.tracing.Tracer.HOST_NAME_KEY;

class OpenTelemetryUtils {
    private static final ClientLogger LOGGER = new ClientLogger(OpenTelemetryUtils.class);

    private static final Map<String, String> ATTRIBUTE_MAPPING_V1_17_0 = getMappingsV1200();
    static final String SERVICE_REQUEST_ID_ATTRIBUTE = "serviceRequestId";
    static final String CLIENT_REQUEST_ID_ATTRIBUTE = "requestId";

    private static Map<String, String> getMappingsV1200() {
        Map<String, String> mappings = new HashMap<>(8);
        // messaging mapping, attributes are defined in com.azure.core.amqp.implementation.ClientConstants
        mappings.put(ENTITY_PATH_KEY, "messaging.destination.name");
        mappings.put(HOST_NAME_KEY, "net.peer.name");
        mappings.put(CLIENT_REQUEST_ID_ATTRIBUTE, "az.client_request_id");
        mappings.put(SERVICE_REQUEST_ID_ATTRIBUTE, "az.service_request_id");

        return Collections.unmodifiableMap(mappings);
    }

    public static Attributes convert(Map<String, Object> attributeMap, OpenTelemetrySchemaVersion schemaVersion) {
        if (attributeMap == null || attributeMap.isEmpty()) {
            return Attributes.empty();
        }

        Map<String, String> mappings = getMappingsForVersion(schemaVersion);

        AttributesBuilder builder = Attributes.builder();
        for (Map.Entry<String, Object> kvp : attributeMap.entrySet()) {
            if (kvp.getValue() == null) {
                continue;
            }

            addAttribute(builder, mappings.getOrDefault(kvp.getKey(), kvp.getKey()), kvp.getValue());
        }

        return builder.build();
    }

    private static Map<String, String> getMappingsForVersion(OpenTelemetrySchemaVersion version) {
        if (version == OpenTelemetrySchemaVersion.V1_17_0) {
            return ATTRIBUTE_MAPPING_V1_17_0;
        }

        LOGGER.verbose("Unknown OpenTelemetry Semantic Conventions version: {}, using latest instead: {}", version, OpenTelemetrySchemaVersion.getLatest());
        return getMappingsForVersion(OpenTelemetrySchemaVersion.getLatest());
    }

    /**
     * Adds attribute key-value pair to OpenTelemetry {@link AttributesBuilder}, if value type is not supported by
     * OpenTelemetry, drops the attribute.
     *
     * @param attributesBuilder initialized {@link AttributesBuilder} instance
     * @param key key of the attribute to be added
     * @param value value of the attribute to be added
     */
    private static void addAttribute(AttributesBuilder attributesBuilder, String key, Object value) {
        Objects.requireNonNull(key, "OpenTelemetry attribute name cannot be null.");
        if (value instanceof String) {
            attributesBuilder.put(AttributeKey.stringKey(key), (String) value);
        } else if (value instanceof Long) {
            attributesBuilder.put(AttributeKey.longKey(key), (Long) value);
        } else if (value instanceof Integer) {
            attributesBuilder.put(AttributeKey.longKey(key), (Integer) value);
        } else if (value instanceof Boolean) {
            attributesBuilder.put(AttributeKey.booleanKey(key), (Boolean) value);
        } else if (value instanceof Double) {
            attributesBuilder.put(AttributeKey.doubleKey(key), (Double) value);
        } else if (value instanceof Float) {
            attributesBuilder.put(AttributeKey.doubleKey(key), ((Float) value).doubleValue());
        } else if (value instanceof Short) {
            attributesBuilder.put(AttributeKey.longKey(key), (Short) value);
        } else if (value instanceof Byte) {
            attributesBuilder.put(AttributeKey.longKey(key), (Byte) value);
        } else {
            LOGGER.warning("Could not populate attribute with key '{}', type {} is not supported.", key, value.getClass().getName());
        }
    }

    /**
     * Adds attribute key-value pair to OpenTelemetry {@link Span}, if value type is not supported by
     * OpenTelemetry, drops the attribute.
     *
     * @param span {@link Span} instance
     * @param key key of the attribute to be added
     * @param value value of the attribute to be added
     * @param schemaVersion version of OpenTelemetry semantic conventions to map attribute names with.
     */
    static void addAttribute(Span span, String key, Object value, OpenTelemetrySchemaVersion schemaVersion) {
        Objects.requireNonNull(key, "OpenTelemetry attribute name cannot be null.");

        key = getMappingsForVersion(schemaVersion).getOrDefault(key, key);
        if (value instanceof String) {
            span.setAttribute(AttributeKey.stringKey(key), (String) value);
        } else if (value instanceof Long) {
            span.setAttribute(AttributeKey.longKey(key), (Long) value);
        } else if (value instanceof Integer) {
            span.setAttribute(AttributeKey.longKey(key), (Integer) value);
        } else if (value instanceof Boolean) {
            span.setAttribute(AttributeKey.booleanKey(key), (Boolean) value);
        } else if (value instanceof Double) {
            span.setAttribute(AttributeKey.doubleKey(key), (Double) value);
        } else if (value instanceof Float) {
            span.setAttribute(AttributeKey.doubleKey(key), ((Float) value).doubleValue());
        } else if (value instanceof Short) {
            span.setAttribute(AttributeKey.longKey(key), (Short) value);
        } else if (value instanceof Byte) {
            span.setAttribute(AttributeKey.longKey(key), (Byte) value);
        } else {
            LOGGER.warning("Could not populate attribute with key '{}', type {} is not supported.", key, value.getClass().getName());
        }
    }

    /**
     * Parses an OpenTelemetry Status from AMQP Error Condition.
     *
     * @param span the span to set the status for.
     * @param statusMessage description for this error condition.
     * @param throwable the error occurred during response transmission (optional).
     * @return the corresponding OpenTelemetry {@link Span}.
     */
    public static Span setError(Span span, String statusMessage, Throwable throwable) {
        if (throwable != null) {
            span.recordException(throwable);
            return span.setStatus(StatusCode.ERROR, statusMessage);
        }

        if (statusMessage != null) {
            if ("error".equals(statusMessage)) {
                return span.setStatus(StatusCode.ERROR);
            }
            return span.setStatus(StatusCode.ERROR, statusMessage);
        }

        return span;
    }
}
