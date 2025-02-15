// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The availability strategy for the private cloud. */
public final class AvailabilityStrategy extends ExpandableStringEnum<AvailabilityStrategy> {
    /** Static value SingleZone for AvailabilityStrategy. */
    public static final AvailabilityStrategy SINGLE_ZONE = fromString("SingleZone");

    /** Static value DualZone for AvailabilityStrategy. */
    public static final AvailabilityStrategy DUAL_ZONE = fromString("DualZone");

    /**
     * Creates or finds a AvailabilityStrategy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AvailabilityStrategy.
     */
    @JsonCreator
    public static AvailabilityStrategy fromString(String name) {
        return fromString(name, AvailabilityStrategy.class);
    }

    /**
     * Gets known AvailabilityStrategy values.
     *
     * @return known AvailabilityStrategy values.
     */
    public static Collection<AvailabilityStrategy> values() {
        return values(AvailabilityStrategy.class);
    }
}
