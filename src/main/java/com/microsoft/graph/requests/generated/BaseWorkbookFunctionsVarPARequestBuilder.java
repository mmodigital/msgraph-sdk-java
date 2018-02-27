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
 * The class for the Base Workbook Functions Var PARequest Builder.
 */
public class BaseWorkbookFunctionsVarPARequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsVarPA
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public BaseWorkbookFunctionsVarPARequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsVarPARequest
     *
     * @return the IWorkbookFunctionsVarPARequest instance
     */
    public IWorkbookFunctionsVarPARequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsVarPARequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsVarPARequest instance
     */
    public IWorkbookFunctionsVarPARequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsVarPARequest request = new WorkbookFunctionsVarPARequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
