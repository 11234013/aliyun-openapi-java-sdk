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

package com.aliyuncs.pts.transform.v20181111;

import com.aliyuncs.pts.model.v20181111.GetReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetReportResponseUnmarshaller {

	public static GetReportResponse unmarshall(GetReportResponse getReportResponse, UnmarshallerContext _ctx) {
		
		getReportResponse.setRequestId(_ctx.stringValue("GetReportResponse.RequestId"));
		getReportResponse.setCode(_ctx.stringValue("GetReportResponse.Code"));
		getReportResponse.setMessage(_ctx.stringValue("GetReportResponse.Message"));
		getReportResponse.setSuccess(_ctx.booleanValue("GetReportResponse.Success"));
		getReportResponse.setSnapshot(_ctx.stringValue("GetReportResponse.Snapshot"));
		getReportResponse.setSummary(_ctx.stringValue("GetReportResponse.Summary"));
	 
	 	return getReportResponse;
	}
}