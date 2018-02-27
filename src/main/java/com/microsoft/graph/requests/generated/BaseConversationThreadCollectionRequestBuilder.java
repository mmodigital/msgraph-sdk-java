// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Conversation Thread Collection Request Builder.
 */
public class BaseConversationThreadCollectionRequestBuilder extends BaseRequestBuilder implements IBaseConversationThreadCollectionRequestBuilder {

    /**
     * The request builder for this collection of Conversation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseConversationThreadCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IConversationThreadCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IConversationThreadCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ConversationThreadCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IConversationThreadRequestBuilder byId(final String id) {
        return new ConversationThreadRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
