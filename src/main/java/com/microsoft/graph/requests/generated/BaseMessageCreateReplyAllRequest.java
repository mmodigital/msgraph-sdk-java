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
 * The class for the Base Message Create Reply All Request.
 */
public class BaseMessageCreateReplyAllRequest extends BaseRequest implements IBaseMessageCreateReplyAllRequest {

    /**
     * The request for this MessageCreateReplyAll
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMessageCreateReplyAllRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Message.class);
    }

    /**
     * Creates the MessageCreateReplyAll
     *
     * @param callback the callback to be called after success or failure
     */
    public void post(final ICallback<Message> callback) {
        send(HttpMethod.POST, callback, null);
    }

    /**
     * Creates the MessageCreateReplyAll
     *
     * @return the Message
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Message post() throws ClientException {
       return send(HttpMethod.POST, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMessageCreateReplyAllRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (MessageCreateReplyAllRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMessageCreateReplyAllRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (MessageCreateReplyAllRequest)this;
    }

}
