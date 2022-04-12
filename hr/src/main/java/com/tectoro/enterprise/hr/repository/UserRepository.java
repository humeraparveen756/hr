package com.tectoro.enterprise.hr.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tectoro.enterprise.hr.data.User;

@Repository
public interface UserRepository  extends JpaRepository<User , BigInteger>{
	
	@Query("select * frm users where username = :username")
	public User findByUserName(String username);

}
