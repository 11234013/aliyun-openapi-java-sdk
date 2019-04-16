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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.ModifyInstanceSpecPreCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceSpecPreCheckResponse extends AcsResponse {

	private String requestId;

	private Boolean isAllowModify;

	private String disableCommands;

	private PreCheckResult preCheckResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsAllowModify() {
		return this.isAllowModify;
	}

	public void setIsAllowModify(Boolean isAllowModify) {
		this.isAllowModify = isAllowModify;
	}

	public String getDisableCommands() {
		return this.disableCommands;
	}

	public void setDisableCommands(String disableCommands) {
		this.disableCommands = disableCommands;
	}

	public PreCheckResult getPreCheckResult() {
		return this.preCheckResult;
	}

	public void setPreCheckResult(PreCheckResult preCheckResult) {
		this.preCheckResult = preCheckResult;
	}

	public static class PreCheckResult {

		private String usedMemorySize;

		private String allowModify;

		private String code;

		private String message;

		public String getUsedMemorySize() {
			return this.usedMemorySize;
		}

		public void setUsedMemorySize(String usedMemorySize) {
			this.usedMemorySize = usedMemorySize;
		}

		public String getAllowModify() {
			return this.allowModify;
		}

		public void setAllowModify(String allowModify) {
			this.allowModify = allowModify;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public ModifyInstanceSpecPreCheckResponse getInstance(UnmarshallerContext context) {
		return	ModifyInstanceSpecPreCheckResponseUnmarshaller.unmarshall(this, context);
	}
}
