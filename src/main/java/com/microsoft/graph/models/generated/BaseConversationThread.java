// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Conversation Thread.
 */
public class BaseConversationThread extends Entity implements IJsonBackedObject {


    /**
     * The To Recipients.
     * The To: recipients for the thread.
     */
    @SerializedName("toRecipients")
    @Expose
    public java.util.List<Recipient> toRecipients;

    /**
     * The Topic.
     * The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
     */
    @SerializedName("topic")
    @Expose
    public String topic;

    /**
     * The Has Attachments.
     * Indicates whether any of the posts within this thread has at least one attachment.
     */
    @SerializedName("hasAttachments")
    @Expose
    public Boolean hasAttachments;

    /**
     * The Last Delivered Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("lastDeliveredDateTime")
    @Expose
    public java.util.Calendar lastDeliveredDateTime;

    /**
     * The Unique Senders.
     * All the users that sent a message to this thread.
     */
    @SerializedName("uniqueSenders")
    @Expose
    public java.util.List<String> uniqueSenders;

    /**
     * The Cc Recipients.
     * The Cc: recipients for the thread.
     */
    @SerializedName("ccRecipients")
    @Expose
    public java.util.List<Recipient> ccRecipients;

    /**
     * The Preview.
     * A short summary from the body of the latest post in this converstaion.
     */
    @SerializedName("preview")
    @Expose
    public String preview;

    /**
     * The Is Locked.
     * Indicates if the thread is locked.
     */
    @SerializedName("isLocked")
    @Expose
    public Boolean isLocked;

    /**
     * The Posts.
     * Read-only. Nullable.
     */
    public PostCollectionPage posts;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("posts")) {
            final BasePostCollectionResponse response = new BasePostCollectionResponse();
            if (json.has("posts@odata.nextLink")) {
                response.nextLink = json.get("posts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("posts").toString(), JsonObject[].class);
            final Post[] array = new Post[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Post.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            posts = new PostCollectionPage(response, null);
        }
    }
}
