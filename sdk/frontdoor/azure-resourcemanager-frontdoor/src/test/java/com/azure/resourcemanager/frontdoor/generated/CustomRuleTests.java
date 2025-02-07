// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.ActionType;
import com.azure.resourcemanager.frontdoor.models.CustomRule;
import com.azure.resourcemanager.frontdoor.models.CustomRuleEnabledState;
import com.azure.resourcemanager.frontdoor.models.MatchCondition;
import com.azure.resourcemanager.frontdoor.models.MatchVariable;
import com.azure.resourcemanager.frontdoor.models.Operator;
import com.azure.resourcemanager.frontdoor.models.RuleType;
import com.azure.resourcemanager.frontdoor.models.TransformType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomRule model =
            BinaryData
                .fromString(
                    "{\"name\":\"cgpik\",\"priority\":1004253647,\"enabledState\":\"Enabled\",\"ruleType\":\"MatchRule\",\"rateLimitDurationInMinutes\":866811107,\"rateLimitThreshold\":923723764,\"matchConditions\":[{\"matchVariable\":\"RequestMethod\",\"selector\":\"xi\",\"operator\":\"GeoMatch\",\"negateCondition\":true,\"matchValue\":[\"zonokixrjqci\",\"gzpfrla\"],\"transforms\":[\"UrlDecode\"]},{\"matchVariable\":\"Cookies\",\"selector\":\"oiindfpwpjy\",\"operator\":\"LessThan\",\"negateCondition\":true,\"matchValue\":[\"h\",\"lsj\",\"dhszfjv\",\"bgofeljag\"],\"transforms\":[\"Lowercase\",\"UrlEncode\",\"UrlDecode\"]},{\"matchVariable\":\"RequestBody\",\"selector\":\"riiiojnalghfkv\",\"operator\":\"Equal\",\"negateCondition\":false,\"matchValue\":[\"sowueluqhhahhx\",\"rhmzkwpj\"],\"transforms\":[\"UrlEncode\",\"UrlEncode\",\"RemoveNulls\",\"Trim\"]},{\"matchVariable\":\"RequestHeader\",\"selector\":\"tqs\",\"operator\":\"LessThan\",\"negateCondition\":false,\"matchValue\":[\"j\",\"ukndxdigrjgu\",\"fzdm\"],\"transforms\":[\"Lowercase\",\"UrlDecode\",\"UrlDecode\",\"Lowercase\"]}],\"action\":\"Log\"}")
                .toObject(CustomRule.class);
        Assertions.assertEquals("cgpik", model.name());
        Assertions.assertEquals(1004253647, model.priority());
        Assertions.assertEquals(CustomRuleEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals(RuleType.MATCH_RULE, model.ruleType());
        Assertions.assertEquals(866811107, model.rateLimitDurationInMinutes());
        Assertions.assertEquals(923723764, model.rateLimitThreshold());
        Assertions.assertEquals(MatchVariable.REQUEST_METHOD, model.matchConditions().get(0).matchVariable());
        Assertions.assertEquals("xi", model.matchConditions().get(0).selector());
        Assertions.assertEquals(Operator.GEO_MATCH, model.matchConditions().get(0).operator());
        Assertions.assertEquals(true, model.matchConditions().get(0).negateCondition());
        Assertions.assertEquals("zonokixrjqci", model.matchConditions().get(0).matchValue().get(0));
        Assertions.assertEquals(TransformType.URL_DECODE, model.matchConditions().get(0).transforms().get(0));
        Assertions.assertEquals(ActionType.LOG, model.action());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomRule model =
            new CustomRule()
                .withName("cgpik")
                .withPriority(1004253647)
                .withEnabledState(CustomRuleEnabledState.ENABLED)
                .withRuleType(RuleType.MATCH_RULE)
                .withRateLimitDurationInMinutes(866811107)
                .withRateLimitThreshold(923723764)
                .withMatchConditions(
                    Arrays
                        .asList(
                            new MatchCondition()
                                .withMatchVariable(MatchVariable.REQUEST_METHOD)
                                .withSelector("xi")
                                .withOperator(Operator.GEO_MATCH)
                                .withNegateCondition(true)
                                .withMatchValue(Arrays.asList("zonokixrjqci", "gzpfrla"))
                                .withTransforms(Arrays.asList(TransformType.URL_DECODE)),
                            new MatchCondition()
                                .withMatchVariable(MatchVariable.COOKIES)
                                .withSelector("oiindfpwpjy")
                                .withOperator(Operator.LESS_THAN)
                                .withNegateCondition(true)
                                .withMatchValue(Arrays.asList("h", "lsj", "dhszfjv", "bgofeljag"))
                                .withTransforms(
                                    Arrays
                                        .asList(
                                            TransformType.LOWERCASE,
                                            TransformType.URL_ENCODE,
                                            TransformType.URL_DECODE)),
                            new MatchCondition()
                                .withMatchVariable(MatchVariable.REQUEST_BODY)
                                .withSelector("riiiojnalghfkv")
                                .withOperator(Operator.EQUAL)
                                .withNegateCondition(false)
                                .withMatchValue(Arrays.asList("sowueluqhhahhx", "rhmzkwpj"))
                                .withTransforms(
                                    Arrays
                                        .asList(
                                            TransformType.URL_ENCODE,
                                            TransformType.URL_ENCODE,
                                            TransformType.REMOVE_NULLS,
                                            TransformType.TRIM)),
                            new MatchCondition()
                                .withMatchVariable(MatchVariable.REQUEST_HEADER)
                                .withSelector("tqs")
                                .withOperator(Operator.LESS_THAN)
                                .withNegateCondition(false)
                                .withMatchValue(Arrays.asList("j", "ukndxdigrjgu", "fzdm"))
                                .withTransforms(
                                    Arrays
                                        .asList(
                                            TransformType.LOWERCASE,
                                            TransformType.URL_DECODE,
                                            TransformType.URL_DECODE,
                                            TransformType.LOWERCASE))))
                .withAction(ActionType.LOG);
        model = BinaryData.fromObject(model).toObject(CustomRule.class);
        Assertions.assertEquals("cgpik", model.name());
        Assertions.assertEquals(1004253647, model.priority());
        Assertions.assertEquals(CustomRuleEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals(RuleType.MATCH_RULE, model.ruleType());
        Assertions.assertEquals(866811107, model.rateLimitDurationInMinutes());
        Assertions.assertEquals(923723764, model.rateLimitThreshold());
        Assertions.assertEquals(MatchVariable.REQUEST_METHOD, model.matchConditions().get(0).matchVariable());
        Assertions.assertEquals("xi", model.matchConditions().get(0).selector());
        Assertions.assertEquals(Operator.GEO_MATCH, model.matchConditions().get(0).operator());
        Assertions.assertEquals(true, model.matchConditions().get(0).negateCondition());
        Assertions.assertEquals("zonokixrjqci", model.matchConditions().get(0).matchValue().get(0));
        Assertions.assertEquals(TransformType.URL_DECODE, model.matchConditions().get(0).transforms().get(0));
        Assertions.assertEquals(ActionType.LOG, model.action());
    }
}
