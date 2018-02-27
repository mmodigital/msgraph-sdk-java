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
 * The class for the Base Remote Item.
 */
public class BaseRemoteItem implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Created By.
     * Identity of the user, device, and application which created the item. Read-only.
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * Date and time of item creation. Read-only.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The File.
     * Indicates that the remote item is a file. Read-only.
     */
    @SerializedName("file")
    @Expose
    public File file;

    /**
     * The File System Info.
     * Information about the remote item from the local file system. Read-only.
     */
    @SerializedName("fileSystemInfo")
    @Expose
    public FileSystemInfo fileSystemInfo;

    /**
     * The Folder.
     * Indicates that the remote item is a folder. Read-only.
     */
    @SerializedName("folder")
    @Expose
    public Folder folder;

    /**
     * The Id.
     * Unique identifier for the remote item in its drive. Read-only.
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The Last Modified By.
     * Identity of the user, device, and application which last modified the item. Read-only.
     */
    @SerializedName("lastModifiedBy")
    @Expose
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Date and time the item was last modified. Read-only.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Name.
     * Optional. Filename of the remote item. Read-only.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Package.
     * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     */
    @SerializedName("package")
    @Expose
    public com.microsoft.graph.models.extensions.Package msgraphpackage;

    /**
     * The Parent Reference.
     * Properties of the parent of the remote item. Read-only.
     */
    @SerializedName("parentReference")
    @Expose
    public ItemReference parentReference;

    /**
     * The Shared.
     * Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     */
    @SerializedName("shared")
    @Expose
    public Shared shared;

    /**
     * The Sharepoint Ids.
     * Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers. Read-only.
     */
    @SerializedName("sharepointIds")
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Size.
     * Size of the remote item. Read-only.
     */
    @SerializedName("size")
    @Expose
    public Long size;

    /**
     * The Special Folder.
     * If the current item is also available as a special folder, this facet is returned. Read-only.
     */
    @SerializedName("specialFolder")
    @Expose
    public SpecialFolder specialFolder;

    /**
     * The Web Dav Url.
     * DAV compatible URL for the item.
     */
    @SerializedName("webDavUrl")
    @Expose
    public String webDavUrl;

    /**
     * The Web Url.
     * URL that displays the resource in the browser. Read-only.
     */
    @SerializedName("webUrl")
    @Expose
    public String webUrl;


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

    }
}
