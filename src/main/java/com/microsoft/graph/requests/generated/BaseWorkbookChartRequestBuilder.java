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
 * The class for the Base Workbook Chart Request Builder.
 */
public class BaseWorkbookChartRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartRequestBuilder {

    /**
     * The request builder for the WorkbookChart
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartRequest instance
     */
    public IWorkbookChartRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartRequest instance
     */
    public IWorkbookChartRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookChartRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookChartAxes
     *
     * @return the IWorkbookChartAxesRequestBuilder instance
     */
    public IWorkbookChartAxesRequestBuilder axes() {
        return new WorkbookChartAxesRequestBuilder(getRequestUrlWithAdditionalSegment("axes"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartDataLabels
     *
     * @return the IWorkbookChartDataLabelsRequestBuilder instance
     */
    public IWorkbookChartDataLabelsRequestBuilder dataLabels() {
        return new WorkbookChartDataLabelsRequestBuilder(getRequestUrlWithAdditionalSegment("dataLabels"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAreaFormat
     *
     * @return the IWorkbookChartAreaFormatRequestBuilder instance
     */
    public IWorkbookChartAreaFormatRequestBuilder format() {
        return new WorkbookChartAreaFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartLegend
     *
     * @return the IWorkbookChartLegendRequestBuilder instance
     */
    public IWorkbookChartLegendRequestBuilder legend() {
        return new WorkbookChartLegendRequestBuilder(getRequestUrlWithAdditionalSegment("legend"), getClient(), null);
    }
    public IWorkbookChartSeriesCollectionRequestBuilder series() {
        return new WorkbookChartSeriesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("series"), getClient(), null);
    }

    public IWorkbookChartSeriesRequestBuilder series(final String id) {
        return new WorkbookChartSeriesRequestBuilder(getRequestUrlWithAdditionalSegment("series") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartTitle
     *
     * @return the IWorkbookChartTitleRequestBuilder instance
     */
    public IWorkbookChartTitleRequestBuilder title() {
        return new WorkbookChartTitleRequestBuilder(getRequestUrlWithAdditionalSegment("title"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    public IWorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }

    public IWorkbookChartSetDataRequestBuilder setData(final com.google.gson.JsonElement sourceData, final String seriesBy) {
        return new WorkbookChartSetDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setData"), getClient(), null, sourceData, seriesBy);
    }

    public IWorkbookChartSetPositionRequestBuilder setPosition(final com.google.gson.JsonElement startCell, final com.google.gson.JsonElement endCell) {
        return new WorkbookChartSetPositionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setPosition"), getClient(), null, startCell, endCell);
    }

    public IWorkbookChartImageRequestBuilder image() {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null);
    }

    public IWorkbookChartImageRequestBuilder image(final Integer width) {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null, width);
    }

    public IWorkbookChartImageRequestBuilder image(final Integer width, final Integer height) {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null, width, height);
    }

    public IWorkbookChartImageRequestBuilder image(final Integer width, final Integer height, final String fittingMode) {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null, width, height, fittingMode);
    }
}
