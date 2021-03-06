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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRoomRequest extends RpcAcsRequest<CreateRoomResponse> {
	
	public CreateRoomRequest() {
		super("live", "2016-11-01", "CreateRoom", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String templateIds;

	private String anchorId;

	private Boolean useAppTranscode;

	private Long ownerId;

	private String roomId;

	private String appId;

	public String getTemplateIds() {
		return this.templateIds;
	}

	public void setTemplateIds(String templateIds) {
		this.templateIds = templateIds;
		if(templateIds != null){
			putQueryParameter("TemplateIds", templateIds);
		}
	}

	public String getAnchorId() {
		return this.anchorId;
	}

	public void setAnchorId(String anchorId) {
		this.anchorId = anchorId;
		if(anchorId != null){
			putQueryParameter("AnchorId", anchorId);
		}
	}

	public Boolean getUseAppTranscode() {
		return this.useAppTranscode;
	}

	public void setUseAppTranscode(Boolean useAppTranscode) {
		this.useAppTranscode = useAppTranscode;
		if(useAppTranscode != null){
			putQueryParameter("UseAppTranscode", useAppTranscode.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
		if(roomId != null){
			putQueryParameter("RoomId", roomId);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<CreateRoomResponse> getResponseClass() {
		return CreateRoomResponse.class;
	}

}
