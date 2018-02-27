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
 * The class for the Base Workbook Chart Collection Request Builder.
 */
public class BaseWorkbookChartCollectionRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookChartCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookChartCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookChartCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookChartRequestBuilder byId(final String id) {
        return new WorkbookChartRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IWorkbookChartAddRequestBuilder add(final String type, final com.google.gson.JsonElement sourceData, final String seriesBy) {
        return new WorkbookChartAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, type, sourceData, seriesBy);
    }

    public IWorkbookChartItemRequestBuilder item(final String name) {
        return new WorkbookChartItemRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.item"), getClient(), null, name);
    }

    public IWorkbookChartItemAtRequestBuilder itemAt(final Integer index) {
        return new WorkbookChartItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }

    public IWorkbookChartCountRequestBuilder count() {
        return new WorkbookChartCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }
}
