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
 * The interface for the Base Thumbnail Request.
 */
public interface IBaseThumbnailRequest extends IHttpRequest {

    /**
     * Gets the Thumbnail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Thumbnail> callback);

    /**
     * Gets the Thumbnail from the service
     *
     * @return the Thumbnail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Thumbnail get() throws ClientException;

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
     * Patches this Thumbnail with a source
     *
     * @param sourceThumbnail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Thumbnail sourceThumbnail, final ICallback<Thumbnail> callback);

    /**
     * Patches this Thumbnail with a source
     *
     * @param sourceThumbnail the source object with updates
     * @return the updated Thumbnail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Thumbnail patch(final Thumbnail sourceThumbnail) throws ClientException;

    /**
     * Posts a Thumbnail with a new object
     *
     * @param newThumbnail the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Thumbnail newThumbnail, final ICallback<Thumbnail> callback);

    /**
     * Posts a Thumbnail with a new object
     *
     * @param newThumbnail the new object to create
     * @return the created Thumbnail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Thumbnail post(final Thumbnail newThumbnail) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseThumbnailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseThumbnailRequest expand(final String value);

}

