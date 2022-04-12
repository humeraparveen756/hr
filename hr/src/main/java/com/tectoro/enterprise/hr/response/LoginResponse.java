package com.tectoro.enterprise.hr.response;

import lombok.Data;

@Data
public class LoginResponse extends BaseAPIResponse {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
