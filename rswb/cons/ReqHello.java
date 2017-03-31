package com.sps.portal.fileoperations.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReqHello {

	private String req;

	@JsonProperty("time")
	public String getReq() {
		return req;
	}

	public void setReq(String req) {
		this.req = req;
	}

}
