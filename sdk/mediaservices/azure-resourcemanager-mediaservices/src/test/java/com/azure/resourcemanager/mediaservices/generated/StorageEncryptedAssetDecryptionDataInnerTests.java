// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.StorageEncryptedAssetDecryptionDataInner;
import com.azure.resourcemanager.mediaservices.models.AssetFileEncryptionMetadata;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class StorageEncryptedAssetDecryptionDataInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageEncryptedAssetDecryptionDataInner model =
            BinaryData
                .fromString(
                    "{\"assetFileEncryptionMetadata\":[{\"initializationVector\":\"pvecxgodeb\",\"assetFileName\":\"kk\",\"assetFileId\":\"dccf2728-8b94-453a-b3de-3ff81ebdf0cb\"},{\"initializationVector\":\"mpukgriw\",\"assetFileName\":\"zlfbxzpuzycispnq\",\"assetFileId\":\"ab43727f-d77e-4f0e-af13-64796ac16cf6\"}]}")
                .toObject(StorageEncryptedAssetDecryptionDataInner.class);
        Assertions.assertEquals("pvecxgodeb", model.assetFileEncryptionMetadata().get(0).initializationVector());
        Assertions.assertEquals("kk", model.assetFileEncryptionMetadata().get(0).assetFileName());
        Assertions
            .assertEquals(
                UUID.fromString("dccf2728-8b94-453a-b3de-3ff81ebdf0cb"),
                model.assetFileEncryptionMetadata().get(0).assetFileId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageEncryptedAssetDecryptionDataInner model =
            new StorageEncryptedAssetDecryptionDataInner()
                .withAssetFileEncryptionMetadata(
                    Arrays
                        .asList(
                            new AssetFileEncryptionMetadata()
                                .withInitializationVector("pvecxgodeb")
                                .withAssetFileName("kk")
                                .withAssetFileId(UUID.fromString("dccf2728-8b94-453a-b3de-3ff81ebdf0cb")),
                            new AssetFileEncryptionMetadata()
                                .withInitializationVector("mpukgriw")
                                .withAssetFileName("zlfbxzpuzycispnq")
                                .withAssetFileId(UUID.fromString("ab43727f-d77e-4f0e-af13-64796ac16cf6"))));
        model = BinaryData.fromObject(model).toObject(StorageEncryptedAssetDecryptionDataInner.class);
        Assertions.assertEquals("pvecxgodeb", model.assetFileEncryptionMetadata().get(0).initializationVector());
        Assertions.assertEquals("kk", model.assetFileEncryptionMetadata().get(0).assetFileName());
        Assertions
            .assertEquals(
                UUID.fromString("dccf2728-8b94-453a-b3de-3ff81ebdf0cb"),
                model.assetFileEncryptionMetadata().get(0).assetFileId());
    }
}
