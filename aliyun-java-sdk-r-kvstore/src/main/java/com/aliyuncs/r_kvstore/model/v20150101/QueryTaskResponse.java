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
import com.aliyuncs.r_kvstore.transform.v20150101.QueryTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskResponse extends AcsResponse {

	private String requestId;

	private String action;

	private Integer progress;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizAction() {
		return this.action;
	}

	public void setBizAction(String action) {
		this.action = action;
	}

	/**
	 * @deprecated use getBizAction instead of this.
	 */
	@Deprecated
	public String getAction() {
		return this.action;
	}

	/**
	 * @deprecated use setBizAction instead of this.
	 */
	@Deprecated
	public void setAction(String action) {
		this.action = action;
	}

	public Integer getProgress() {
		return this.progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	@Override
	public QueryTaskResponse getInstance(UnmarshallerContext context) {
		return	QueryTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
