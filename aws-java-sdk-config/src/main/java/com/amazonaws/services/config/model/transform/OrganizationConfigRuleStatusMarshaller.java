/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrganizationConfigRuleStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrganizationConfigRuleStatusMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONCONFIGRULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationConfigRuleName").build();
    private static final MarshallingInfo<String> ORGANIZATIONRULESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationRuleStatus").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ErrorCode").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTime").timestampFormat("unixTimestamp").build();

    private static final OrganizationConfigRuleStatusMarshaller instance = new OrganizationConfigRuleStatusMarshaller();

    public static OrganizationConfigRuleStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrganizationConfigRuleStatus organizationConfigRuleStatus, ProtocolMarshaller protocolMarshaller) {

        if (organizationConfigRuleStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(organizationConfigRuleStatus.getOrganizationConfigRuleName(), ORGANIZATIONCONFIGRULENAME_BINDING);
            protocolMarshaller.marshall(organizationConfigRuleStatus.getOrganizationRuleStatus(), ORGANIZATIONRULESTATUS_BINDING);
            protocolMarshaller.marshall(organizationConfigRuleStatus.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(organizationConfigRuleStatus.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(organizationConfigRuleStatus.getLastUpdateTime(), LASTUPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
