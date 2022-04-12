package com.tectoro.enterprise.hr.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tectoro.enterprise.hr.response.BaseAPIResponse;

import lombok.Data;

@Data
public class LoginRequest extends BaseAPIRequest {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
