// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IOfficeGraphInsightsRequest;
import com.microsoft.graph.requests.extensions.OfficeGraphInsightsRequest;
import com.microsoft.graph.requests.extensions.ITrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrendingRequestBuilder;
import com.microsoft.graph.requests.extensions.TrendingRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.IUsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUsedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.UsedInsightRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Office Graph Insights Request Builder.
 */
public class BaseOfficeGraphInsightsRequestBuilder extends BaseRequestBuilder implements IBaseOfficeGraphInsightsRequestBuilder {

    /**
     * The request builder for the OfficeGraphInsights
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseOfficeGraphInsightsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IOfficeGraphInsightsRequest instance
     */
    public IOfficeGraphInsightsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOfficeGraphInsightsRequest instance
     */
    public IOfficeGraphInsightsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new OfficeGraphInsightsRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITrendingCollectionRequestBuilder trending() {
        return new TrendingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("trending"), getClient(), null);
    }

    public ITrendingRequestBuilder trending(final String id) {
        return new TrendingRequestBuilder(getRequestUrlWithAdditionalSegment("trending") + "/" + id, getClient(), null);
    }
    public ISharedInsightCollectionRequestBuilder shared() {
        return new SharedInsightCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("shared"), getClient(), null);
    }

    public ISharedInsightRequestBuilder shared(final String id) {
        return new SharedInsightRequestBuilder(getRequestUrlWithAdditionalSegment("shared") + "/" + id, getClient(), null);
    }
    public IUsedInsightCollectionRequestBuilder used() {
        return new UsedInsightCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("used"), getClient(), null);
    }

    public IUsedInsightRequestBuilder used(final String id) {
        return new UsedInsightRequestBuilder(getRequestUrlWithAdditionalSegment("used") + "/" + id, getClient(), null);
    }
}

