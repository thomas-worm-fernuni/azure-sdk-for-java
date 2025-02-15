// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The language codes supported for input text by KeyPhraseExtractionSkill. */
public final class KeyPhraseExtractionSkillLanguage extends ExpandableStringEnum<KeyPhraseExtractionSkillLanguage> {
    /** Static value da for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage DA = fromString("da");

    /** Static value nl for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage NL = fromString("nl");

    /** Static value en for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage EN = fromString("en");

    /** Static value fi for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage FI = fromString("fi");

    /** Static value fr for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage FR = fromString("fr");

    /** Static value de for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage DE = fromString("de");

    /** Static value it for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage IT = fromString("it");

    /** Static value ja for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage JA = fromString("ja");

    /** Static value ko for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage KO = fromString("ko");

    /** Static value no for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage NO = fromString("no");

    /** Static value pl for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage PL = fromString("pl");

    /** Static value pt-PT for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage PT_PT = fromString("pt-PT");

    /** Static value pt-BR for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage PT_BR = fromString("pt-BR");

    /** Static value ru for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage RU = fromString("ru");

    /** Static value es for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage ES = fromString("es");

    /** Static value sv for KeyPhraseExtractionSkillLanguage. */
    public static final KeyPhraseExtractionSkillLanguage SV = fromString("sv");

    /**
     * Creates or finds a KeyPhraseExtractionSkillLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KeyPhraseExtractionSkillLanguage.
     */
    @JsonCreator
    public static KeyPhraseExtractionSkillLanguage fromString(String name) {
        return fromString(name, KeyPhraseExtractionSkillLanguage.class);
    }

    /**
     * Gets known KeyPhraseExtractionSkillLanguage values.
     *
     * @return known KeyPhraseExtractionSkillLanguage values.
     */
    public static Collection<KeyPhraseExtractionSkillLanguage> values() {
        return values(KeyPhraseExtractionSkillLanguage.class);
    }
}
