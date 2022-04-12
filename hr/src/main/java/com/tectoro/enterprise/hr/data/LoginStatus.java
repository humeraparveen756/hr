package com.tectoro.enterprise.hr.data;

public enum LoginStatus {
	
	login_Sucess("login_Sucess"),
	password_Mismatch("password_Mismatch"),
	user_Inactive("user_Inactive");
	
	private final String display;
	
	

	private LoginStatus(String display) {
		this.display = display;
	}



	public String getDisplay() {
		return display;
	}
	

}
