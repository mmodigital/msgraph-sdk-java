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
 * The interface for the Base Directory Role Template Request.
 */
public interface IBaseDirectoryRoleTemplateRequest extends IHttpRequest {

    /**
     * Gets the DirectoryRoleTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DirectoryRoleTemplate> callback);

    /**
     * Gets the DirectoryRoleTemplate from the service
     *
     * @return the DirectoryRoleTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryRoleTemplate get() throws ClientException;

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
     * Patches this DirectoryRoleTemplate with a source
     *
     * @param sourceDirectoryRoleTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DirectoryRoleTemplate sourceDirectoryRoleTemplate, final ICallback<DirectoryRoleTemplate> callback);

    /**
     * Patches this DirectoryRoleTemplate with a source
     *
     * @param sourceDirectoryRoleTemplate the source object with updates
     * @return the updated DirectoryRoleTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryRoleTemplate patch(final DirectoryRoleTemplate sourceDirectoryRoleTemplate) throws ClientException;

    /**
     * Posts a DirectoryRoleTemplate with a new object
     *
     * @param newDirectoryRoleTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DirectoryRoleTemplate newDirectoryRoleTemplate, final ICallback<DirectoryRoleTemplate> callback);

    /**
     * Posts a DirectoryRoleTemplate with a new object
     *
     * @param newDirectoryRoleTemplate the new object to create
     * @return the created DirectoryRoleTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryRoleTemplate post(final DirectoryRoleTemplate newDirectoryRoleTemplate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDirectoryRoleTemplateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDirectoryRoleTemplateRequest expand(final String value);

}

