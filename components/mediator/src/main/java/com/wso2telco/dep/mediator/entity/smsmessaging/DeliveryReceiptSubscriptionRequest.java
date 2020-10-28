/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under  the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.dep.mediator.entity.smsmessaging;

// TODO: Auto-generated Javadoc
/**
 * The Class DeliveryReceiptSubscriptionRequest.
 */
public class DeliveryReceiptSubscriptionRequest implements ISMSresponse {

	/** The delivery receipt subscription. */
	private DeliveryReceiptSubscription deliveryReceiptSubscription;

	/**
	 * Gets the delivery receipt subscription.
	 *
	 * @return the delivery receipt subscription
	 */
	public DeliveryReceiptSubscription getDeliveryReceiptSubscription() {
		return deliveryReceiptSubscription;
	}

	/**
	 * Sets the delivery receipt subscription.
	 *
	 * @param deliveryReceiptSubscription the new delivery receipt subscription
	 */
	public void setDeliveryReceiptSubscription(DeliveryReceiptSubscription deliveryReceiptSubscription) {
		this.deliveryReceiptSubscription = deliveryReceiptSubscription;
	}

}
