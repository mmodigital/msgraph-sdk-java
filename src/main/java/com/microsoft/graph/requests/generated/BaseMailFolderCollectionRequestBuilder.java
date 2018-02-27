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
 * The class for the Base Mail Folder Collection Request Builder.
 */
public class BaseMailFolderCollectionRequestBuilder extends BaseRequestBuilder implements IBaseMailFolderCollectionRequestBuilder {

    /**
     * The request builder for this collection of MailFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMailFolderCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMailFolderCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMailFolderCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new MailFolderCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMailFolderRequestBuilder byId(final String id) {
        return new MailFolderRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IMailFolderDeltaCollectionRequestBuilder delta() {
        return new MailFolderDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

	public IMailFolderDeltaCollectionRequestBuilder delta(final String deltaLink) {
        return new MailFolderDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}
