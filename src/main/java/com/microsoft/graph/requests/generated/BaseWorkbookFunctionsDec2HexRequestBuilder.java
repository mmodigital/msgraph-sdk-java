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
 * The class for the Base Workbook Functions Dec2Hex Request Builder.
 */
public class BaseWorkbookFunctionsDec2HexRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDec2Hex
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param places the places
     */
    public BaseWorkbookFunctionsDec2HexRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement places) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("places", places);
    }

    /**
     * Creates the IWorkbookFunctionsDec2HexRequest
     *
     * @return the IWorkbookFunctionsDec2HexRequest instance
     */
    public IWorkbookFunctionsDec2HexRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDec2HexRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDec2HexRequest instance
     */
    public IWorkbookFunctionsDec2HexRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDec2HexRequest request = new WorkbookFunctionsDec2HexRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("places")) {
            request.body.places = getParameter("places");
        }

        return request;
    }
}
