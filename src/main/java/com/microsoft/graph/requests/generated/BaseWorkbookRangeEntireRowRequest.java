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
 * The class for the Base Workbook Range Entire Row Request.
 */
public class BaseWorkbookRangeEntireRowRequest extends BaseRequest implements IBaseWorkbookRangeEntireRowRequest {

    /**
     * The request for this WorkbookRangeEntireRow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeEntireRowRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRange.class);
    }

    /**
     * Patches the WorkbookRangeEntireRow
     * @param srcWorkbookRange the WorkbookRange with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookRange);
    }

    /**
     * Patches the WorkbookRangeEntireRow
     *
     * @param srcWorkbookRange the WorkbookRange with which to PATCH
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookRange patch(WorkbookRange srcWorkbookRange) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookRange);
    }

    /**
     * Puts the WorkbookRangeEntireRow
     *
     * @param srcWorkbookRange the WorkbookRange to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookRange);
    }

    /**
     * Puts the WorkbookRangeEntireRow
     *
     * @param srcWorkbookRange the WorkbookRange to PUT
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookRange put(WorkbookRange srcWorkbookRange) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookRange);
    }
    /**
     * Gets the WorkbookRange
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookRange> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRange
     *
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookRange get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookRangeEntireRowRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookRangeEntireRowRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookRangeEntireRowRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookRangeEntireRowRequest)this;
    }

}
