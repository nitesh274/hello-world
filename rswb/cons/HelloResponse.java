package com.sps.portal.fileoperations.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloResponse {
	
	private String wish;

	@JsonProperty("greet")
	public String getWish() {
		return wish;
	}

	public void setWish(String wish) {
		this.wish = wish;
	}
	
	

}
