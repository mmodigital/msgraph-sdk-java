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
 * The class for the Base Workbook Functions Ln Request Builder.
 */
public class BaseWorkbookFunctionsLnRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     */
    public BaseWorkbookFunctionsLnRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsLnRequest
     *
     * @return the IWorkbookFunctionsLnRequest instance
     */
    public IWorkbookFunctionsLnRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsLnRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLnRequest instance
     */
    public IWorkbookFunctionsLnRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsLnRequest request = new WorkbookFunctionsLnRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        return request;
    }
}
