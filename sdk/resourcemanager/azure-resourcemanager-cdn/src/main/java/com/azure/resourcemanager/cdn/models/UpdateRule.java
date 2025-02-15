// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes the action that shall be taken when the certificate is updated in Key Vault. */
public final class UpdateRule extends ExpandableStringEnum<UpdateRule> {
    /** Static value NoAction for UpdateRule. */
    public static final UpdateRule NO_ACTION = fromString("NoAction");

    /**
     * Creates or finds a UpdateRule from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpdateRule.
     */
    @JsonCreator
    public static UpdateRule fromString(String name) {
        return fromString(name, UpdateRule.class);
    }

    /**
     * Gets known UpdateRule values.
     *
     * @return known UpdateRule values.
     */
    public static Collection<UpdateRule> values() {
        return values(UpdateRule.class);
    }
}
