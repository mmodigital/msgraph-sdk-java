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
 * The interface for the Base Workbook Table Row Request.
 */
public interface IBaseWorkbookTableRowRequest extends IHttpRequest {

    /**
     * Gets the WorkbookTableRow from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookTableRow> callback);

    /**
     * Gets the WorkbookTableRow from the service
     *
     * @return the WorkbookTableRow from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableRow get() throws ClientException;

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
     * Patches this WorkbookTableRow with a source
     *
     * @param sourceWorkbookTableRow the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookTableRow sourceWorkbookTableRow, final ICallback<WorkbookTableRow> callback);

    /**
     * Patches this WorkbookTableRow with a source
     *
     * @param sourceWorkbookTableRow the source object with updates
     * @return the updated WorkbookTableRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableRow patch(final WorkbookTableRow sourceWorkbookTableRow) throws ClientException;

    /**
     * Posts a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookTableRow newWorkbookTableRow, final ICallback<WorkbookTableRow> callback);

    /**
     * Posts a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the new object to create
     * @return the created WorkbookTableRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableRow post(final WorkbookTableRow newWorkbookTableRow) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWorkbookTableRowRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWorkbookTableRowRequest expand(final String value);

}

