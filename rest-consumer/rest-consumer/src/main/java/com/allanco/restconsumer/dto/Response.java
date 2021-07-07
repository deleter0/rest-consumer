package com.allanco.restconsumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("data")
	String[] data;

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}	
	
}
