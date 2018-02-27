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
 * The interface for the Base Workbook Range View Request.
 */
public interface IBaseWorkbookRangeViewRequest extends IHttpRequest {

    /**
     * Gets the WorkbookRangeView from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookRangeView> callback);

    /**
     * Gets the WorkbookRangeView from the service
     *
     * @return the WorkbookRangeView from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeView get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookRangeView with a source
     *
     * @param sourceWorkbookRangeView the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookRangeView sourceWorkbookRangeView, final ICallback<WorkbookRangeView> callback);

    /**
     * Patches this WorkbookRangeView with a source
     *
     * @param sourceWorkbookRangeView the source object with updates
     * @return the updated WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeView patch(final WorkbookRangeView sourceWorkbookRangeView) throws ClientException;

    /**
     * Posts a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookRangeView newWorkbookRangeView, final ICallback<WorkbookRangeView> callback);

    /**
     * Posts a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the new object to create
     * @return the created WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeView post(final WorkbookRangeView newWorkbookRangeView) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWorkbookRangeViewRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWorkbookRangeViewRequest expand(final String value);

}

