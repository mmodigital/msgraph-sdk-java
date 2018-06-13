// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsDayRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Day Request Builder.
 */
public class WorkbookFunctionsDayRequestBuilder extends BaseWorkbookFunctionsDayRequestBuilder implements IWorkbookFunctionsDayRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDay
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param serialNumber the serialNumber
     */
    public WorkbookFunctionsDayRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement serialNumber) {
        super(requestUrl, client, requestOptions, serialNumber);
    }
}
