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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Graph Service Client.
 */
public interface IBaseGraphServiceClient extends IBaseClient {

    /**
     * Gets the collection of DirectoryObjects objects
     *
     * @return the request builder for the collection of DirectoryObjects objects
     */
    IDirectoryObjectCollectionRequestBuilder directoryObjects();

    /**
     * Gets a single DirectoryObjects
     *
     * @param id the id of the DirectoryObjects to retrieve
     * @return the request builder for the DirectoryObjects object
     */
    IDirectoryObjectRequestBuilder directoryObjects(final String id);

    /**
     * Gets the collection of Devices objects
     *
     * @return the request builder for the collection of Devices objects
     */
    IDeviceCollectionRequestBuilder devices();

    /**
     * Gets a single Devices
     *
     * @param id the id of the Devices to retrieve
     * @return the request builder for the Devices object
     */
    IDeviceRequestBuilder devices(final String id);

    /**
     * Gets the collection of Domains objects
     *
     * @return the request builder for the collection of Domains objects
     */
    IDomainCollectionRequestBuilder domains();

    /**
     * Gets a single Domains
     *
     * @param id the id of the Domains to retrieve
     * @return the request builder for the Domains object
     */
    IDomainRequestBuilder domains(final String id);

    /**
     * Gets the collection of DomainDnsRecords objects
     *
     * @return the request builder for the collection of DomainDnsRecords objects
     */
    IDomainDnsRecordCollectionRequestBuilder domainDnsRecords();

    /**
     * Gets a single DomainDnsRecords
     *
     * @param id the id of the DomainDnsRecords to retrieve
     * @return the request builder for the DomainDnsRecords object
     */
    IDomainDnsRecordRequestBuilder domainDnsRecords(final String id);

    /**
     * Gets the collection of Groups objects
     *
     * @return the request builder for the collection of Groups objects
     */
    IGroupCollectionRequestBuilder groups();

    /**
     * Gets a single Groups
     *
     * @param id the id of the Groups to retrieve
     * @return the request builder for the Groups object
     */
    IGroupRequestBuilder groups(final String id);

    /**
     * Gets the collection of DirectoryRoles objects
     *
     * @return the request builder for the collection of DirectoryRoles objects
     */
    IDirectoryRoleCollectionRequestBuilder directoryRoles();

    /**
     * Gets a single DirectoryRoles
     *
     * @param id the id of the DirectoryRoles to retrieve
     * @return the request builder for the DirectoryRoles object
     */
    IDirectoryRoleRequestBuilder directoryRoles(final String id);

    /**
     * Gets the collection of DirectoryRoleTemplates objects
     *
     * @return the request builder for the collection of DirectoryRoleTemplates objects
     */
    IDirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates();

    /**
     * Gets a single DirectoryRoleTemplates
     *
     * @param id the id of the DirectoryRoleTemplates to retrieve
     * @return the request builder for the DirectoryRoleTemplates object
     */
    IDirectoryRoleTemplateRequestBuilder directoryRoleTemplates(final String id);

    /**
     * Gets the collection of Organization objects
     *
     * @return the request builder for the collection of Organization objects
     */
    IOrganizationCollectionRequestBuilder organization();

    /**
     * Gets a single Organization
     *
     * @param id the id of the Organization to retrieve
     * @return the request builder for the Organization object
     */
    IOrganizationRequestBuilder organization(final String id);

    /**
     * Gets the collection of GroupSettings objects
     *
     * @return the request builder for the collection of GroupSettings objects
     */
    IGroupSettingCollectionRequestBuilder groupSettings();

    /**
     * Gets a single GroupSettings
     *
     * @param id the id of the GroupSettings to retrieve
     * @return the request builder for the GroupSettings object
     */
    IGroupSettingRequestBuilder groupSettings(final String id);

    /**
     * Gets the collection of GroupSettingTemplates objects
     *
     * @return the request builder for the collection of GroupSettingTemplates objects
     */
    IGroupSettingTemplateCollectionRequestBuilder groupSettingTemplates();

    /**
     * Gets a single GroupSettingTemplates
     *
     * @param id the id of the GroupSettingTemplates to retrieve
     * @return the request builder for the GroupSettingTemplates object
     */
    IGroupSettingTemplateRequestBuilder groupSettingTemplates(final String id);

    /**
     * Gets the collection of SubscribedSkus objects
     *
     * @return the request builder for the collection of SubscribedSkus objects
     */
    ISubscribedSkuCollectionRequestBuilder subscribedSkus();

    /**
     * Gets a single SubscribedSkus
     *
     * @param id the id of the SubscribedSkus to retrieve
     * @return the request builder for the SubscribedSkus object
     */
    ISubscribedSkuRequestBuilder subscribedSkus(final String id);

    /**
     * Gets the collection of Users objects
     *
     * @return the request builder for the collection of Users objects
     */
    IUserCollectionRequestBuilder users();

    /**
     * Gets a single Users
     *
     * @param id the id of the Users to retrieve
     * @return the request builder for the Users object
     */
    IUserRequestBuilder users(final String id);

    /**
     * Gets the collection of Contracts objects
     *
     * @return the request builder for the collection of Contracts objects
     */
    IContractCollectionRequestBuilder contracts();

    /**
     * Gets a single Contracts
     *
     * @param id the id of the Contracts to retrieve
     * @return the request builder for the Contracts object
     */
    IContractRequestBuilder contracts(final String id);

    /**
     * Gets the collection of SchemaExtensions objects
     *
     * @return the request builder for the collection of SchemaExtensions objects
     */
    ISchemaExtensionCollectionRequestBuilder schemaExtensions();

    /**
     * Gets a single SchemaExtensions
     *
     * @param id the id of the SchemaExtensions to retrieve
     * @return the request builder for the SchemaExtensions object
     */
    ISchemaExtensionRequestBuilder schemaExtensions(final String id);

    /**
     * Gets the collection of Drives objects
     *
     * @return the request builder for the collection of Drives objects
     */
    IDriveCollectionRequestBuilder drives();

    /**
     * Gets a single Drives
     *
     * @param id the id of the Drives to retrieve
     * @return the request builder for the Drives object
     */
    IDriveRequestBuilder drives(final String id);

    /**
     * Gets the collection of Shares objects
     *
     * @return the request builder for the collection of Shares objects
     */
    ISharedDriveItemCollectionRequestBuilder shares();

    /**
     * Gets a single Shares
     *
     * @param id the id of the Shares to retrieve
     * @return the request builder for the Shares object
     */
    ISharedDriveItemRequestBuilder shares(final String id);

    /**
     * Gets the collection of Sites objects
     *
     * @return the request builder for the collection of Sites objects
     */
    ISiteCollectionRequestBuilder sites();

    /**
     * Gets a single Sites
     *
     * @param id the id of the Sites to retrieve
     * @return the request builder for the Sites object
     */
    ISiteRequestBuilder sites(final String id);

    /**
     * Gets the collection of Workbooks objects
     *
     * @return the request builder for the collection of Workbooks objects
     */
    IDriveItemCollectionRequestBuilder workbooks();

    /**
     * Gets a single Workbooks
     *
     * @param id the id of the Workbooks to retrieve
     * @return the request builder for the Workbooks object
     */
    IDriveItemRequestBuilder workbooks(final String id);

    /**
     * Gets the collection of Subscriptions objects
     *
     * @return the request builder for the collection of Subscriptions objects
     */
    ISubscriptionCollectionRequestBuilder subscriptions();

    /**
     * Gets a single Subscriptions
     *
     * @param id the id of the Subscriptions to retrieve
     * @return the request builder for the Subscriptions object
     */
    ISubscriptionRequestBuilder subscriptions(final String id);

    /**
     * Gets the collection of Invitations objects
     *
     * @return the request builder for the collection of Invitations objects
     */
    IInvitationCollectionRequestBuilder invitations();

    /**
     * Gets a single Invitations
     *
     * @param id the id of the Invitations to retrieve
     * @return the request builder for the Invitations object
     */
    IInvitationRequestBuilder invitations(final String id);

    /**
     * Gets the collection of GroupLifecyclePolicies objects
     *
     * @return the request builder for the collection of GroupLifecyclePolicies objects
     */
    IGroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies();

    /**
     * Gets a single GroupLifecyclePolicies
     *
     * @param id the id of the GroupLifecyclePolicies to retrieve
     * @return the request builder for the GroupLifecyclePolicies object
     */
    IGroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id);

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the User
     */
    IUserRequestBuilder me();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Directory
     */
    IDirectoryRequestBuilder directory();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Drive
     */
    IDriveRequestBuilder drive();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Planner
     */
    IPlannerRequestBuilder planner();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the ReportRoot
     */
    IReportRootRequestBuilder reports();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the EducationRoot
     */
    IEducationRootRequestBuilder education();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceAppManagement
     */
    IDeviceAppManagementRequestBuilder deviceAppManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceManagement
     */
    IDeviceManagementRequestBuilder deviceManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Security
     */
    ISecurityRequestBuilder Security();

}
