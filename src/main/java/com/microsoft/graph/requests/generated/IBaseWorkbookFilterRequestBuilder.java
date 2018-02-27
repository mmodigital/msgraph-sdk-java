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
 * The interface for the Base Workbook Filter Request Builder.
 */
public interface IBaseWorkbookFilterRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookFilterRequest instance
     */
    IWorkbookFilterRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookFilterRequest instance
     */
    IWorkbookFilterRequest buildRequest(final java.util.List<? extends Option> requestOptions);
    IWorkbookFilterApplyRequestBuilder apply(final WorkbookFilterCriteria criteria);
    IWorkbookFilterApplyBottomItemsFilterRequestBuilder applyBottomItemsFilter(final Integer count);
    IWorkbookFilterApplyBottomPercentFilterRequestBuilder applyBottomPercentFilter(final Integer percent);
    IWorkbookFilterApplyCellColorFilterRequestBuilder applyCellColorFilter(final String color);
    IWorkbookFilterApplyCustomFilterRequestBuilder applyCustomFilter(final String criteria1, final String criteria2, final String oper);
    IWorkbookFilterApplyDynamicFilterRequestBuilder applyDynamicFilter(final String criteria);
    IWorkbookFilterApplyFontColorFilterRequestBuilder applyFontColorFilter(final String color);
    IWorkbookFilterApplyIconFilterRequestBuilder applyIconFilter(final WorkbookIcon icon);
    IWorkbookFilterApplyTopItemsFilterRequestBuilder applyTopItemsFilter(final Integer count);
    IWorkbookFilterApplyTopPercentFilterRequestBuilder applyTopPercentFilter(final Integer percent);
    IWorkbookFilterApplyValuesFilterRequestBuilder applyValuesFilter(final com.google.gson.JsonElement values);
    IWorkbookFilterClearRequestBuilder clear();

}
