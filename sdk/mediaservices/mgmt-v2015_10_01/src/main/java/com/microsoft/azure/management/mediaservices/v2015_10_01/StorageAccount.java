/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2015_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a storage account associated with this resource.
 */
public class StorageAccount {
    /**
     * The id of the storage account resource. Media Services relies on tables
     * and queues as well as blobs, so the primary storage account must be a
     * Standard Storage account (either Microsoft.ClassicStorage or
     * Microsoft.Storage). Blob only storage accounts can be added as secondary
     * storage accounts (isPrimary false).
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Is this storage account resource the primary storage account for the
     * Media Service resource. Blob only storage must set this to false.
     */
    @JsonProperty(value = "isPrimary", required = true)
    private boolean isPrimary;

    /**
     * Get the id of the storage account resource. Media Services relies on tables and queues as well as blobs, so the primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or Microsoft.Storage). Blob only storage accounts can be added as secondary storage accounts (isPrimary false).
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id of the storage account resource. Media Services relies on tables and queues as well as blobs, so the primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or Microsoft.Storage). Blob only storage accounts can be added as secondary storage accounts (isPrimary false).
     *
     * @param id the id value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get is this storage account resource the primary storage account for the Media Service resource. Blob only storage must set this to false.
     *
     * @return the isPrimary value
     */
    public boolean isPrimary() {
        return this.isPrimary;
    }

    /**
     * Set is this storage account resource the primary storage account for the Media Service resource. Blob only storage must set this to false.
     *
     * @param isPrimary the isPrimary value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

}
