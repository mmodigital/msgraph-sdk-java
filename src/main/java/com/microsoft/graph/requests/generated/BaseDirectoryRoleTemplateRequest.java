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
 * The class for the Base Directory Role Template Request.
 */
public class BaseDirectoryRoleTemplateRequest extends BaseRequest implements IBaseDirectoryRoleTemplateRequest {

    /**
     * The request for the DirectoryRoleTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDirectoryRoleTemplateRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DirectoryRoleTemplate> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DirectoryRoleTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DirectoryRoleTemplate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DirectoryRoleTemplate from the service
     *
     * @return the DirectoryRoleTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleTemplate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DirectoryRoleTemplate with a source
     *
     * @param sourceDirectoryRoleTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DirectoryRoleTemplate sourceDirectoryRoleTemplate, final ICallback<DirectoryRoleTemplate> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectoryRoleTemplate);
    }

    /**
     * Patches this DirectoryRoleTemplate with a source
     *
     * @param sourceDirectoryRoleTemplate the source object with updates
     * @return the updated DirectoryRoleTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleTemplate patch(final DirectoryRoleTemplate sourceDirectoryRoleTemplate) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryRoleTemplate);
    }

    /**
     * Creates a DirectoryRoleTemplate with a new object
     *
     * @param newDirectoryRoleTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DirectoryRoleTemplate newDirectoryRoleTemplate, final ICallback<DirectoryRoleTemplate> callback) {
        send(HttpMethod.POST, callback, newDirectoryRoleTemplate);
    }

    /**
     * Creates a DirectoryRoleTemplate with a new object
     *
     * @param newDirectoryRoleTemplate the new object to create
     * @return the created DirectoryRoleTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleTemplate post(final DirectoryRoleTemplate newDirectoryRoleTemplate) throws ClientException {
        return send(HttpMethod.POST, newDirectoryRoleTemplate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDirectoryRoleTemplateRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DirectoryRoleTemplateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDirectoryRoleTemplateRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DirectoryRoleTemplateRequest)this;
     }

}

