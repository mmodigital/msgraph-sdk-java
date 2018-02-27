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
 * The class for the Base Workbook Table Column Item At Request.
 */
public class BaseWorkbookTableColumnItemAtRequest extends BaseRequest implements IBaseWorkbookTableColumnItemAtRequest {

    /**
     * The request for this WorkbookTableColumnItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableColumnItemAtRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableColumn.class);
    }

    /**
     * Patches the WorkbookTableColumnItemAt
     * @param srcWorkbookTableColumn the WorkbookTableColumn with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(WorkbookTableColumn srcWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookTableColumn);
    }

    /**
     * Patches the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn with which to PATCH
     * @return the WorkbookTableColumn
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookTableColumn patch(WorkbookTableColumn srcWorkbookTableColumn) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookTableColumn);
    }

    /**
     * Puts the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookTableColumn srcWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookTableColumn);
    }

    /**
     * Puts the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn to PUT
     * @return the WorkbookTableColumn
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookTableColumn put(WorkbookTableColumn srcWorkbookTableColumn) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookTableColumn);
    }
    /**
     * Gets the WorkbookTableColumn
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookTableColumn> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableColumn
     *
     * @return the WorkbookTableColumn
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookTableColumn get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookTableColumnItemAtRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookTableColumnItemAtRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookTableColumnItemAtRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookTableColumnItemAtRequest)this;
    }

}
