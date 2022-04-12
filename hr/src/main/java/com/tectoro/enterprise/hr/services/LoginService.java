package com.tectoro.enterprise.hr.services;

public interface LoginService {
	
	public boolean checkLogin(String username, String password);

	public void performLogin(String username);
}
