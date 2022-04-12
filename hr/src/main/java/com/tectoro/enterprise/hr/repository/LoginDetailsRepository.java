package com.tectoro.enterprise.hr.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tectoro.enterprise.hr.data.LoginDetails;

public interface LoginDetailsRepository extends JpaRepository<LoginDetails, BigInteger> {

}
