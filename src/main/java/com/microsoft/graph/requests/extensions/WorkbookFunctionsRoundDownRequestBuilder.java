// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsRoundDownRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Round Down Request Builder.
 */
public class WorkbookFunctionsRoundDownRequestBuilder extends BaseWorkbookFunctionsRoundDownRequestBuilder implements IWorkbookFunctionsRoundDownRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRoundDown
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param numDigits the numDigits
     */
    public WorkbookFunctionsRoundDownRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement numDigits) {
        super(requestUrl, client, requestOptions, number, numDigits);
    }
}
