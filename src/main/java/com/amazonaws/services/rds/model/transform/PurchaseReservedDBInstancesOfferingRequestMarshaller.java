/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Purchase Reserved D B Instances Offering Request Marshaller
 */
public class PurchaseReservedDBInstancesOfferingRequestMarshaller implements Marshaller<Request<PurchaseReservedDBInstancesOfferingRequest>, PurchaseReservedDBInstancesOfferingRequest> {

    public Request<PurchaseReservedDBInstancesOfferingRequest> marshall(PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest) {
        Request<PurchaseReservedDBInstancesOfferingRequest> request = new DefaultRequest<PurchaseReservedDBInstancesOfferingRequest>(purchaseReservedDBInstancesOfferingRequest, "AmazonRDS");
        request.addParameter("Action", "PurchaseReservedDBInstancesOffering");
        request.addParameter("Version", "2010-06-28");
        if (purchaseReservedDBInstancesOfferingRequest != null) {
            if (purchaseReservedDBInstancesOfferingRequest.getReservedDBInstancesOfferingId() != null) {
                request.addParameter("ReservedDBInstancesOfferingId", StringUtils.fromString(purchaseReservedDBInstancesOfferingRequest.getReservedDBInstancesOfferingId()));
            }
        }
        if (purchaseReservedDBInstancesOfferingRequest != null) {
            if (purchaseReservedDBInstancesOfferingRequest.getReservedDBInstanceId() != null) {
                request.addParameter("ReservedDBInstanceId", StringUtils.fromString(purchaseReservedDBInstancesOfferingRequest.getReservedDBInstanceId()));
            }
        }
        if (purchaseReservedDBInstancesOfferingRequest != null) {
            if (purchaseReservedDBInstancesOfferingRequest.getDBInstanceCount() != null) {
                request.addParameter("DBInstanceCount", StringUtils.fromInteger(purchaseReservedDBInstancesOfferingRequest.getDBInstanceCount()));
            }
        }


        return request;
    }
}