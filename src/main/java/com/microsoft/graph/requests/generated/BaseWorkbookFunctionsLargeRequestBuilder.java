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
 * The class for the Base Workbook Functions Large Request Builder.
 */
public class BaseWorkbookFunctionsLargeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLarge
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param k the k
     */
    public BaseWorkbookFunctionsLargeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement k) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
        bodyParams.put("k", k);
    }

    /**
     * Creates the IWorkbookFunctionsLargeRequest
     *
     * @return the IWorkbookFunctionsLargeRequest instance
     */
    public IWorkbookFunctionsLargeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsLargeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLargeRequest instance
     */
    public IWorkbookFunctionsLargeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsLargeRequest request = new WorkbookFunctionsLargeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        if (hasParameter("k")) {
            request.body.k = getParameter("k");
        }

        return request;
    }
}
