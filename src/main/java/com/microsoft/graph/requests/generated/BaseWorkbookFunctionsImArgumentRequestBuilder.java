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
 * The class for the Base Workbook Functions Im Argument Request Builder.
 */
public class BaseWorkbookFunctionsImArgumentRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImArgument
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber the inumber
     */
    public BaseWorkbookFunctionsImArgumentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement inumber) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("inumber", inumber);
    }

    /**
     * Creates the IWorkbookFunctionsImArgumentRequest
     *
     * @return the IWorkbookFunctionsImArgumentRequest instance
     */
    public IWorkbookFunctionsImArgumentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsImArgumentRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImArgumentRequest instance
     */
    public IWorkbookFunctionsImArgumentRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsImArgumentRequest request = new WorkbookFunctionsImArgumentRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("inumber")) {
            request.body.inumber = getParameter("inumber");
        }

        return request;
    }
}
