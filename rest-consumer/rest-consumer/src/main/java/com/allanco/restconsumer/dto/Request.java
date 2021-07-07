package com.allanco.restconsumer.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

	@JsonProperty("page")
	String page;
	@JsonProperty("per_page")
	String per_page;
	@JsonProperty("total")
	String total;
	@JsonProperty("total_pages")
	String total_pages;
	@JsonProperty("data")
	List<User> data;
	@JsonProperty("support")
	Support support;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPer_page() {
		return per_page;
	}
	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	public List<User> getData() {
		return data;
	}
	public void setData(List<User> data) {
		this.data = data;
	}
	public Support getSupport() {
		return support;
	}
	public void setSupport(Support support) {
		this.support = support;
	}

	
	
}
