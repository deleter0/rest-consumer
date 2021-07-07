package com.allanco.restconsumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Support {
	
	@JsonProperty("url")
	String url;
	@JsonProperty("text")
	String text;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
