// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import java.util.Map;

/**
 * Job output processing event data. Schema of the data property of an EventGridEvent for a
 * Microsoft.Media.JobOutputProcessing event.
 */
@Fluent
public final class MediaJobOutputProcessingEventData extends MediaJobOutputStateChangeEventData {
    /** {@inheritDoc} */
    @Override
    public MediaJobOutputProcessingEventData setOutput(MediaJobOutput output) {
        super.setOutput(output);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MediaJobOutputProcessingEventData setJobCorrelationData(Map<String, String> jobCorrelationData) {
        super.setJobCorrelationData(jobCorrelationData);
        return this;
    }
}
