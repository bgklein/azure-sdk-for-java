// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.changefeed;

import com.azure.cosmos.model.CosmosItemRequestOptions;
import com.azure.cosmos.model.FeedOptions;

/**
 * Defines request options for lease requests to use with {@link LeaseStoreManager}.
 */
public interface RequestOptionsFactory {

    CosmosItemRequestOptions createRequestOptions(Lease lease);

    FeedOptions createFeedOptions();
}
