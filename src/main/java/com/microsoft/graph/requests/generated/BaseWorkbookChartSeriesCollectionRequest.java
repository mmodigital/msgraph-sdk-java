// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Workbook Chart Series Collection Request.
 */
public class BaseWorkbookChartSeriesCollectionRequest extends BaseCollectionRequest<BaseWorkbookChartSeriesCollectionResponse, IWorkbookChartSeriesCollectionPage> implements IBaseWorkbookChartSeriesCollectionRequest {

    /**
     * The request builder for this collection of WorkbookChartSeries
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartSeriesCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseWorkbookChartSeriesCollectionResponse.class, IWorkbookChartSeriesCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookChartSeriesCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookChartSeriesCollectionPage get() throws ClientException {
        final BaseWorkbookChartSeriesCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookChartSeries newWorkbookChartSeries, final ICallback<WorkbookChartSeries> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookChartSeriesRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWorkbookChartSeries, callback);
    }

    public WorkbookChartSeries post(final WorkbookChartSeries newWorkbookChartSeries) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookChartSeriesRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWorkbookChartSeries);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartSeriesCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WorkbookChartSeriesCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartSeriesCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WorkbookChartSeriesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookChartSeriesCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WorkbookChartSeriesCollectionRequest)this;
    }

    public IWorkbookChartSeriesCollectionPage buildFromResponse(final BaseWorkbookChartSeriesCollectionResponse response) {
        final IWorkbookChartSeriesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookChartSeriesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookChartSeriesCollectionPage page = new WorkbookChartSeriesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
