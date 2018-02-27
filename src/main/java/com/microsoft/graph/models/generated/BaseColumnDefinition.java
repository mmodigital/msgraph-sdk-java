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
 * The class for the Base Column Definition.
 */
public class BaseColumnDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Boolean.
     * This column stores boolean values.
     */
    @SerializedName("boolean")
    @Expose
    public BooleanColumn msgraphboolean;

    /**
     * The Calculated.
     * This column's data is calculated based on other columns.
     */
    @SerializedName("calculated")
    @Expose
    public CalculatedColumn calculated;

    /**
     * The Choice.
     * This column stores data from a list of choices.
     */
    @SerializedName("choice")
    @Expose
    public ChoiceColumn choice;

    /**
     * The Column Group.
     * For site columns, the name of the group this column belongs to. Helps organize related columns.
     */
    @SerializedName("columnGroup")
    @Expose
    public String columnGroup;

    /**
     * The Currency.
     * This column stores currency values.
     */
    @SerializedName("currency")
    @Expose
    public CurrencyColumn currency;

    /**
     * The Date Time.
     * This column stores DateTime values.
     */
    @SerializedName("dateTime")
    @Expose
    public DateTimeColumn dateTime;

    /**
     * The Default Value.
     * The default value for this column.
     */
    @SerializedName("defaultValue")
    @Expose
    public DefaultColumnValue defaultValue;

    /**
     * The Description.
     * The user-facing description of the column.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * The user-facing name of the column.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Enforce Unique Values.
     * If true, no two list items may have the same value for this column.
     */
    @SerializedName("enforceUniqueValues")
    @Expose
    public Boolean enforceUniqueValues;

    /**
     * The Hidden.
     * Specifies whether the column is displayed in the user interface.
     */
    @SerializedName("hidden")
    @Expose
    public Boolean hidden;

    /**
     * The Indexed.
     * Specifies whether the column values can used for sorting and searching.
     */
    @SerializedName("indexed")
    @Expose
    public Boolean indexed;

    /**
     * The Lookup.
     * This column's data is looked up from another source in the site.
     */
    @SerializedName("lookup")
    @Expose
    public LookupColumn lookup;

    /**
     * The Name.
     * The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Number.
     * This column stores number values.
     */
    @SerializedName("number")
    @Expose
    public NumberColumn number;

    /**
     * The Person Or Group.
     * This column stores Person or Group values.
     */
    @SerializedName("personOrGroup")
    @Expose
    public PersonOrGroupColumn personOrGroup;

    /**
     * The Read Only.
     * Specifies whether the column values can be modified.
     */
    @SerializedName("readOnly")
    @Expose
    public Boolean readOnly;

    /**
     * The Required.
     * Specifies whether the column value is not optional.
     */
    @SerializedName("required")
    @Expose
    public Boolean required;

    /**
     * The Text.
     * This column stores text values.
     */
    @SerializedName("text")
    @Expose
    public TextColumn text;


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
