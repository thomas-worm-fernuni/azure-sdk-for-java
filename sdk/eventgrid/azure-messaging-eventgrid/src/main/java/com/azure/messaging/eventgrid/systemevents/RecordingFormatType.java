// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecordingFormatType. */
public final class RecordingFormatType extends ExpandableStringEnum<RecordingFormatType> {
    /** Static value Wav for RecordingFormatType. */
    public static final RecordingFormatType WAV = fromString("Wav");

    /** Static value Mp3 for RecordingFormatType. */
    public static final RecordingFormatType MP3 = fromString("Mp3");

    /** Static value Mp4 for RecordingFormatType. */
    public static final RecordingFormatType MP4 = fromString("Mp4");

    /**
     * Creates or finds a RecordingFormatType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecordingFormatType.
     */
    @JsonCreator
    public static RecordingFormatType fromString(String name) {
        return fromString(name, RecordingFormatType.class);
    }

    /**
     * Gets known RecordingFormatType values.
     *
     * @return known RecordingFormatType values.
     */
    public static Collection<RecordingFormatType> values() {
        return values(RecordingFormatType.class);
    }
}
