// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EducationUserRole;
import com.microsoft.graph.models.generated.EducationExternalSource;
import com.microsoft.graph.models.extensions.PhysicalAddress;
import com.microsoft.graph.models.extensions.EducationStudent;
import com.microsoft.graph.models.extensions.EducationTeacher;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AssignedPlan;
import com.microsoft.graph.models.extensions.PasswordProfile;
import com.microsoft.graph.models.extensions.ProvisionedPlan;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionResponse;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionPage;
import com.microsoft.graph.requests.extensions.EducationClassCollectionResponse;
import com.microsoft.graph.requests.extensions.EducationClassCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User.
 */
public class EducationUser extends Entity implements IJsonBackedObject {


    /**
     * The Primary Role.
     * Default role for a user. The user's role might be different in an individual class. The possible values are: student, teacher. Supports $filter.
     */
    @SerializedName("primaryRole")
    @Expose
    public EducationUserRole primaryRole;

    /**
     * The Middle Name.
     * The middle name of user.
     */
    @SerializedName("middleName")
    @Expose
    public String middleName;

    /**
     * The External Source.
     * Where this user was created from. The possible values are: sis, manual.
     */
    @SerializedName("externalSource")
    @Expose
    public EducationExternalSource externalSource;

    /**
     * The Residence Address.
     * Address where user lives.
     */
    @SerializedName("residenceAddress")
    @Expose
    public PhysicalAddress residenceAddress;

    /**
     * The Mailing Address.
     * Mail address of user.
     */
    @SerializedName("mailingAddress")
    @Expose
    public PhysicalAddress mailingAddress;

    /**
     * The Student.
     * If the primary role is student, this block will contain student specific data.
     */
    @SerializedName("student")
    @Expose
    public EducationStudent student;

    /**
     * The Teacher.
     * If the primary role is teacher, this block will conatin teacher specific data.
     */
    @SerializedName("teacher")
    @Expose
    public EducationTeacher teacher;

    /**
     * The Created By.
     * Entity who created the user.
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The Account Enabled.
     * True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
     */
    @SerializedName("accountEnabled")
    @Expose
    public Boolean accountEnabled;

    /**
     * The Assigned Licenses.
     * The licenses that are assigned to the user. Not nullable.
     */
    @SerializedName("assignedLicenses")
    @Expose
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Assigned Plans.
     * The plans that are assigned to the user. Read-only. Not nullable.
     */
    @SerializedName("assignedPlans")
    @Expose
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     */
    @SerializedName("businessPhones")
    @Expose
    public java.util.List<String> businessPhones;

    /**
     * The Department.
     * The name for the department in which the user works. Supports $filter.
     */
    @SerializedName("department")
    @Expose
    public String department;

    /**
     * The Display Name.
     * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Given Name.
     * The given name (first name) of the user. Supports $filter.
     */
    @SerializedName("givenName")
    @Expose
    public String givenName;

    /**
     * The Mail.
     * The SMTP address for the user; for example, 'jeff@contoso.onmicrosoft.com'. Read-Only. Supports $filter.
     */
    @SerializedName("mail")
    @Expose
    public String mail;

    /**
     * The Mail Nickname.
     * The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     */
    @SerializedName("mailNickname")
    @Expose
    public String mailNickname;

    /**
     * The Mobile Phone.
     * The primary cellular telephone number for the user.
     */
    @SerializedName("mobilePhone")
    @Expose
    public String mobilePhone;

    /**
     * The Password Policies.
     * Specifies password policies for the user. This value is an enumeration with one possible value being 'DisableStrongPassword', which allows weaker passwords than the default policy to be specified. 'DisablePasswordExpiration' can also be specified. The two can be specified together; for example: 'DisablePasswordExpiration, DisableStrongPassword'.
     */
    @SerializedName("passwordPolicies")
    @Expose
    public String passwordPolicies;

    /**
     * The Password Profile.
     * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     */
    @SerializedName("passwordProfile")
    @Expose
    public PasswordProfile passwordProfile;

    /**
     * The Office Location.
     * 
     */
    @SerializedName("officeLocation")
    @Expose
    public String officeLocation;

    /**
     * The Preferred Language.
     * The preferred language for the user. Should follow ISO 639-1 Code; for example, 'en-US'.
     */
    @SerializedName("preferredLanguage")
    @Expose
    public String preferredLanguage;

    /**
     * The Provisioned Plans.
     * The plans that are provisioned for the user. Read-only. Not nullable.
     */
    @SerializedName("provisionedPlans")
    @Expose
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Refresh Tokens Valid From Date Time.
     * 
     */
    @SerializedName("refreshTokensValidFromDateTime")
    @Expose
    public java.util.Calendar refreshTokensValidFromDateTime;

    /**
     * The Show In Address List.
     * 
     */
    @SerializedName("showInAddressList")
    @Expose
    public Boolean showInAddressList;

    /**
     * The Surname.
     * The user's surname (family name or last name). Supports $filter.
     */
    @SerializedName("surname")
    @Expose
    public String surname;

    /**
     * The Usage Location.
     * A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal requirement to check for availability of services in countries or regions. Examples include: 'US', 'JP', and 'GB'. Not nullable. Supports $filter.
     */
    @SerializedName("usageLocation")
    @Expose
    public String usageLocation;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant’s collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization. Supports $filter and $orderby.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The User Type.
     * A string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Supports $filter.
     */
    @SerializedName("userType")
    @Expose
    public String userType;

    /**
     * The Schools.
     * Schools to which the user belongs. Nullable.
     */
    public EducationSchoolCollectionPage schools;

    /**
     * The Classes.
     * Classes to which the user belongs. Nullable.
     */
    public EducationClassCollectionPage classes;

    /**
     * The User.
     * The directory user corresponding to this user.
     */
    @SerializedName("user")
    @Expose
    public User user;


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


        if (json.has("schools")) {
            final EducationSchoolCollectionResponse response = new EducationSchoolCollectionResponse();
            if (json.has("schools@odata.nextLink")) {
                response.nextLink = json.get("schools@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("schools").toString(), JsonObject[].class);
            final EducationSchool[] array = new EducationSchool[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationSchool.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            schools = new EducationSchoolCollectionPage(response, null);
        }

        if (json.has("classes")) {
            final EducationClassCollectionResponse response = new EducationClassCollectionResponse();
            if (json.has("classes@odata.nextLink")) {
                response.nextLink = json.get("classes@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("classes").toString(), JsonObject[].class);
            final EducationClass[] array = new EducationClass[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationClass.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            classes = new EducationClassCollectionPage(response, null);
        }
    }
}
