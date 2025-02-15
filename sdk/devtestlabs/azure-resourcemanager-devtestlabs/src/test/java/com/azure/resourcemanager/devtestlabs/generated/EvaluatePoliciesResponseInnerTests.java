// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.EvaluatePoliciesResponseInner;
import com.azure.resourcemanager.devtestlabs.models.PolicySetResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EvaluatePoliciesResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EvaluatePoliciesResponseInner model =
            BinaryData
                .fromString("{\"results\":[{\"hasError\":false,\"policyViolations\":[]}]}")
                .toObject(EvaluatePoliciesResponseInner.class);
        Assertions.assertEquals(false, model.results().get(0).hasError());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EvaluatePoliciesResponseInner model =
            new EvaluatePoliciesResponseInner()
                .withResults(
                    Arrays.asList(new PolicySetResult().withHasError(false).withPolicyViolations(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(EvaluatePoliciesResponseInner.class);
        Assertions.assertEquals(false, model.results().get(0).hasError());
    }
}
