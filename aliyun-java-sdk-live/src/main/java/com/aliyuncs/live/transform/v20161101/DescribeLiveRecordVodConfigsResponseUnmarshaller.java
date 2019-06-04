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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveRecordVodConfigsResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveRecordVodConfigsResponseUnmarshaller {

	public static DescribeLiveRecordVodConfigsResponse unmarshall(DescribeLiveRecordVodConfigsResponse describeLiveRecordVodConfigsResponse, UnmarshallerContext context) {
		
		describeLiveRecordVodConfigsResponse.setRequestId(context.stringValue("DescribeLiveRecordVodConfigsResponse.RequestId"));
		describeLiveRecordVodConfigsResponse.setPageNum(context.integerValue("DescribeLiveRecordVodConfigsResponse.PageNum"));
		describeLiveRecordVodConfigsResponse.setPageSize(context.integerValue("DescribeLiveRecordVodConfigsResponse.PageSize"));
		describeLiveRecordVodConfigsResponse.setTotal(context.stringValue("DescribeLiveRecordVodConfigsResponse.Total"));

		List<LiveRecordVodConfig> liveRecordVodConfigs = new ArrayList<LiveRecordVodConfig>();
		for (int i = 0; i < context.lengthValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs.Length"); i++) {
			LiveRecordVodConfig liveRecordVodConfig = new LiveRecordVodConfig();
			liveRecordVodConfig.setCreateTime(context.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].CreateTime"));
			liveRecordVodConfig.setDomainName(context.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].DomainName"));
			liveRecordVodConfig.setAppName(context.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].AppName"));
			liveRecordVodConfig.setStreamName(context.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].StreamName"));
			liveRecordVodConfig.setVodTranscodeGroupId(context.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].VodTranscodeGroupId"));
			liveRecordVodConfig.setCycleDuration(context.integerValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].CycleDuration"));
			liveRecordVodConfig.setAutoCompose(context.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].AutoCompose"));
			liveRecordVodConfig.setComposeVodTranscodeGroupId(context.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].ComposeVodTranscodeGroupId"));

			liveRecordVodConfigs.add(liveRecordVodConfig);
		}
		describeLiveRecordVodConfigsResponse.setLiveRecordVodConfigs(liveRecordVodConfigs);
	 
	 	return describeLiveRecordVodConfigsResponse;
	}
}