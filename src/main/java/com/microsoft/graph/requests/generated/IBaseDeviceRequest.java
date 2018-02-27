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
 * The interface for the Base Device Request.
 */
public interface IBaseDeviceRequest extends IHttpRequest {

    /**
     * Gets the Device from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Device> callback);

    /**
     * Gets the Device from the service
     *
     * @return the Device from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Device get() throws ClientException;

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
     * Patches this Device with a source
     *
     * @param sourceDevice the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Device sourceDevice, final ICallback<Device> callback);

    /**
     * Patches this Device with a source
     *
     * @param sourceDevice the source object with updates
     * @return the updated Device
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Device patch(final Device sourceDevice) throws ClientException;

    /**
     * Posts a Device with a new object
     *
     * @param newDevice the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Device newDevice, final ICallback<Device> callback);

    /**
     * Posts a Device with a new object
     *
     * @param newDevice the new object to create
     * @return the created Device
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Device post(final Device newDevice) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceRequest expand(final String value);

}

