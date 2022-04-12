package com.tectoro.enterprise.hr.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tectoro.enterprise.hr.data.LoginDetails;
import com.tectoro.enterprise.hr.data.User;
import com.tectoro.enterprise.hr.exceptions.UserLoginException;
import com.tectoro.enterprise.hr.repository.LoginDetailsRepository;
import com.tectoro.enterprise.hr.repository.UserRepository;
import com.tectoro.enterprise.hr.services.LoginService;

public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository loginRepo;
	
	@Autowired
	private LoginDetailsRepository loginDetailsRepo;
	
	@Override
	public boolean checkLogin(String username, String password) {
		
		
		try {
		User user = loginRepo.findByUserName(username);
		if(user != null) {
			return password.equals(user.getPassword());
		}
		return false;
		}catch(Exception ex) {
			//log the exception and throw business exception
			//throw exception
			throw new UserLoginException(ex);
		}
		//return false;
	}

	@Override
	public void performLogin(String username) {
		// TODO Auto-generated method stub
		//logic for creating login details goes here
		LoginDetails ld = new LoginDetails();
		ld.setEmpId(loginRepo.findByUserName(username));
		ld.setLoginDateTime(new java.sql.Date(System.currentTimeMillis()));
		loginDetailsRepo.save(ld);
	}

}
