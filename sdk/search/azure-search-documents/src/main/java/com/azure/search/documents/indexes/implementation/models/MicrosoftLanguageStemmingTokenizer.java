// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.documents.indexes.models.MicrosoftStemmingTokenizerLanguage;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Divides text using language-specific rules and reduces words to their base forms. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.MicrosoftLanguageStemmingTokenizer")
@Fluent
public final class MicrosoftLanguageStemmingTokenizer extends LexicalTokenizer {
    /*
     * Identifies the concrete type of the tokenizer.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.MicrosoftLanguageStemmingTokenizer";

    /*
     * The maximum token length. Tokens longer than the maximum length are split. Maximum token length that can be used
     * is 300 characters. Tokens longer than 300 characters are first split into tokens of length 300 and then each of
     * those tokens is split based on the max token length set. Default is 255.
     */
    @JsonProperty(value = "maxTokenLength")
    private Integer maxTokenLength;

    /*
     * A value indicating how the tokenizer is used. Set to true if used as the search tokenizer, set to false if used
     * as the indexing tokenizer. Default is false.
     */
    @JsonProperty(value = "isSearchTokenizer")
    private Boolean isSearchTokenizer;

    /*
     * The language to use. The default is English.
     */
    @JsonProperty(value = "language")
    private MicrosoftStemmingTokenizerLanguage language;

    /**
     * Creates an instance of MicrosoftLanguageStemmingTokenizer class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public MicrosoftLanguageStemmingTokenizer(@JsonProperty(value = "name", required = true) String name) {
        super(name);
    }

    /**
     * Get the odataType property: Identifies the concrete type of the tokenizer.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the maxTokenLength property: The maximum token length. Tokens longer than the maximum length are split.
     * Maximum token length that can be used is 300 characters. Tokens longer than 300 characters are first split into
     * tokens of length 300 and then each of those tokens is split based on the max token length set. Default is 255.
     *
     * @return the maxTokenLength value.
     */
    public Integer getMaxTokenLength() {
        return this.maxTokenLength;
    }

    /**
     * Set the maxTokenLength property: The maximum token length. Tokens longer than the maximum length are split.
     * Maximum token length that can be used is 300 characters. Tokens longer than 300 characters are first split into
     * tokens of length 300 and then each of those tokens is split based on the max token length set. Default is 255.
     *
     * @param maxTokenLength the maxTokenLength value to set.
     * @return the MicrosoftLanguageStemmingTokenizer object itself.
     */
    public MicrosoftLanguageStemmingTokenizer setMaxTokenLength(Integer maxTokenLength) {
        this.maxTokenLength = maxTokenLength;
        return this;
    }

    /**
     * Get the isSearchTokenizer property: A value indicating how the tokenizer is used. Set to true if used as the
     * search tokenizer, set to false if used as the indexing tokenizer. Default is false.
     *
     * @return the isSearchTokenizer value.
     */
    public Boolean isSearchTokenizer() {
        return this.isSearchTokenizer;
    }

    /**
     * Set the isSearchTokenizer property: A value indicating how the tokenizer is used. Set to true if used as the
     * search tokenizer, set to false if used as the indexing tokenizer. Default is false.
     *
     * @param isSearchTokenizer the isSearchTokenizer value to set.
     * @return the MicrosoftLanguageStemmingTokenizer object itself.
     */
    public MicrosoftLanguageStemmingTokenizer setIsSearchTokenizer(Boolean isSearchTokenizer) {
        this.isSearchTokenizer = isSearchTokenizer;
        return this;
    }

    /**
     * Get the language property: The language to use. The default is English.
     *
     * @return the language value.
     */
    public MicrosoftStemmingTokenizerLanguage getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The language to use. The default is English.
     *
     * @param language the language value to set.
     * @return the MicrosoftLanguageStemmingTokenizer object itself.
     */
    public MicrosoftLanguageStemmingTokenizer setLanguage(MicrosoftStemmingTokenizerLanguage language) {
        this.language = language;
        return this;
    }
}
