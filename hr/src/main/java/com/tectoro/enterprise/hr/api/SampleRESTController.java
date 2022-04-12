package com.tectoro.enterprise.hr.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.enterprise.hr.repository.UserRepository;
import com.tectoro.enterprise.hr.response.SampleAPIResponse;
import com.tectoro.enterprise.hr.services.impl.SampleServiceImpl;

/**
 * This is sample rest controller
 */
@RestController
public class SampleRESTController {
	
	@Autowired
	private UserRepository urepo;
	
	@Autowired
	private UserRepository lrepo;
	
	@Autowired
	private SampleServiceImpl service;
	
	@GetMapping("/sample/test")
	public ResponseEntity<SampleAPIResponse> test(){
		return new ResponseEntity(new SampleAPIResponse(),HttpStatus.OK);
	}
}
