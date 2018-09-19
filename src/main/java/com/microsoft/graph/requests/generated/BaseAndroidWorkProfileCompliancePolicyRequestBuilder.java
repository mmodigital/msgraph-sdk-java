// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IAndroidWorkProfileCompliancePolicyRequest;
import com.microsoft.graph.requests.extensions.AndroidWorkProfileCompliancePolicyRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Android Work Profile Compliance Policy Request Builder.
 */
public class BaseAndroidWorkProfileCompliancePolicyRequestBuilder extends BaseRequestBuilder implements IBaseAndroidWorkProfileCompliancePolicyRequestBuilder {

    /**
     * The request builder for the AndroidWorkProfileCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseAndroidWorkProfileCompliancePolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IAndroidWorkProfileCompliancePolicyRequest instance
     */
    public IAndroidWorkProfileCompliancePolicyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAndroidWorkProfileCompliancePolicyRequest instance
     */
    public IAndroidWorkProfileCompliancePolicyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new AndroidWorkProfileCompliancePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }

}

