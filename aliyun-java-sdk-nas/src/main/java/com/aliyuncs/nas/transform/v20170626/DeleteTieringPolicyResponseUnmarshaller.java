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

package com.aliyuncs.nas.transform.v20170626;

import com.aliyuncs.nas.model.v20170626.DeleteTieringPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTieringPolicyResponseUnmarshaller {

	public static DeleteTieringPolicyResponse unmarshall(DeleteTieringPolicyResponse deleteTieringPolicyResponse, UnmarshallerContext _ctx) {
		
		deleteTieringPolicyResponse.setRequestId(_ctx.stringValue("DeleteTieringPolicyResponse.RequestId"));
		deleteTieringPolicyResponse.setSuccess(_ctx.booleanValue("DeleteTieringPolicyResponse.Success"));
	 
	 	return deleteTieringPolicyResponse;
	}
}