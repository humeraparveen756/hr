package com.tectoro.enterprise.hr.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.enterprise.hr.exceptions.BaseException;
import com.tectoro.enterprise.hr.request.LoginRequest;
import com.tectoro.enterprise.hr.response.LoginResponse;
import com.tectoro.enterprise.hr.services.LoginService;

@RestController
public class LoginRestController {
	
	@Autowired
	private LoginService loginService;
	
	
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
		LoginResponse res = null;
		try {
		if(loginRequest != null) {
			if(loginService.checkLogin(loginRequest.getUsername(), loginRequest.getPassword())) {
				loginService.performLogin(loginRequest.getUsername());
				res = new LoginResponse();
				res.setMessage("Login success!!");
				return new ResponseEntity<>(res,HttpStatus.OK);
			}
		}
		res = new LoginResponse();
		res.setMessage("Login Not success!!");
		return new ResponseEntity<>(res,HttpStatus.FORBIDDEN);
	}catch(BaseException ex) {
		res = new LoginResponse();
		res.setMessage(ex.getMessage());
		return new ResponseEntity<>(res,HttpStatus.FORBIDDEN);
	}
}

}
