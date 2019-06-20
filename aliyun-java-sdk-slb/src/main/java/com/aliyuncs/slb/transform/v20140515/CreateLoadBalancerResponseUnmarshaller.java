/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.slb.transform.v20140515;

import com.aliyuncs.slb.model.v20140515.CreateLoadBalancerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLoadBalancerResponseUnmarshaller {

	public static CreateLoadBalancerResponse unmarshall(CreateLoadBalancerResponse createLoadBalancerResponse, UnmarshallerContext context) {
		
		createLoadBalancerResponse.setRequestId(context.stringValue("CreateLoadBalancerResponse.RequestId"));
		createLoadBalancerResponse.setLoadBalancerId(context.stringValue("CreateLoadBalancerResponse.LoadBalancerId"));
		createLoadBalancerResponse.setResourceGroupId(context.stringValue("CreateLoadBalancerResponse.ResourceGroupId"));
		createLoadBalancerResponse.setAddress(context.stringValue("CreateLoadBalancerResponse.Address"));
		createLoadBalancerResponse.setLoadBalancerName(context.stringValue("CreateLoadBalancerResponse.LoadBalancerName"));
		createLoadBalancerResponse.setVpcId(context.stringValue("CreateLoadBalancerResponse.VpcId"));
		createLoadBalancerResponse.setVSwitchId(context.stringValue("CreateLoadBalancerResponse.VSwitchId"));
		createLoadBalancerResponse.setNetworkType(context.stringValue("CreateLoadBalancerResponse.NetworkType"));
		createLoadBalancerResponse.setOrderId(context.longValue("CreateLoadBalancerResponse.OrderId"));
		createLoadBalancerResponse.setAddressIPVersion(context.stringValue("CreateLoadBalancerResponse.AddressIPVersion"));
	 
	 	return createLoadBalancerResponse;
	}
}