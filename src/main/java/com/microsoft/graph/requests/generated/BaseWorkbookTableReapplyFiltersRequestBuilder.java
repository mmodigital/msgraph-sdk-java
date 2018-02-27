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
 * The class for the Base Workbook Table Reapply Filters Request Builder.
 */
public class BaseWorkbookTableReapplyFiltersRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableReapplyFilters
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableReapplyFiltersRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableReapplyFiltersRequest
     *
     * @return the IWorkbookTableReapplyFiltersRequest instance
     */
    public IWorkbookTableReapplyFiltersRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableReapplyFiltersRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableReapplyFiltersRequest instance
     */
    public IWorkbookTableReapplyFiltersRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableReapplyFiltersRequest request = new WorkbookTableReapplyFiltersRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
