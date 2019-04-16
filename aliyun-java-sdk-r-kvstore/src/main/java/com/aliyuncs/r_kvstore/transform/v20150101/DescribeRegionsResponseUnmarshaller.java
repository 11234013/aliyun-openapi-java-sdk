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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeRegionsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeRegionsResponse.KVStoreRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext context) {
		
		describeRegionsResponse.setRequestId(context.stringValue("DescribeRegionsResponse.RequestId"));

		List<KVStoreRegion> regionIds = new ArrayList<KVStoreRegion>();
		for (int i = 0; i < context.lengthValue("DescribeRegionsResponse.RegionIds.Length"); i++) {
			KVStoreRegion kVStoreRegion = new KVStoreRegion();
			kVStoreRegion.setRegionId(context.stringValue("DescribeRegionsResponse.RegionIds["+ i +"].RegionId"));
			kVStoreRegion.setZoneIds(context.stringValue("DescribeRegionsResponse.RegionIds["+ i +"].ZoneIds"));
			kVStoreRegion.setLocalName(context.stringValue("DescribeRegionsResponse.RegionIds["+ i +"].LocalName"));
			kVStoreRegion.setRegionEndpoint(context.stringValue("DescribeRegionsResponse.RegionIds["+ i +"].RegionEndpoint"));

			List<String> zoneIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeRegionsResponse.RegionIds["+ i +"].ZoneIdList.Length"); j++) {
				zoneIdList.add(context.stringValue("DescribeRegionsResponse.RegionIds["+ i +"].ZoneIdList["+ j +"]"));
			}
			kVStoreRegion.setZoneIdList(zoneIdList);

			regionIds.add(kVStoreRegion);
		}
		describeRegionsResponse.setRegionIds(regionIds);
	 
	 	return describeRegionsResponse;
	}
}