/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.EntityNameAvailabilityCheckOutput;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class EntityNameAvailabilityCheckOutputImpl extends WrapperImpl<EntityNameAvailabilityCheckOutputInner> implements EntityNameAvailabilityCheckOutput {
    private final MediaManager manager;
    EntityNameAvailabilityCheckOutputImpl(EntityNameAvailabilityCheckOutputInner inner, MediaManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public boolean nameAvailable() {
        return this.inner().nameAvailable();
    }

    @Override
    public String reason() {
        return this.inner().reason();
    }

}
