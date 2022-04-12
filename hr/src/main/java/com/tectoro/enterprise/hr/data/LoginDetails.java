package com.tectoro.enterprise.hr.data;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "loginDetails")
public class LoginDetails extends BaseEntity{


	@Column(name = "token")
	private String token;

	@Column(name = "logindatetime")
	private Date loginDateTime;

	@Column(name = "logoutdatetime")
	private Date logoutDateTime;

	@Column(name = "responce")
	private LoginStatus response;

	@JoinColumn(name="id")
	private User empId;

	public Date getLoginDateTime() {
		return loginDateTime;
	}

	public void setLoginDateTime(Date loginDateTime) {
		this.loginDateTime = loginDateTime;
	}

	public Date getLogoutDateTime() {
		return logoutDateTime;
	}

	public void setLogoutDateTime(Date logoutDateTime) {
		this.logoutDateTime = logoutDateTime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setEmpId(User user) {
		this.empId = user;
	}
	public User getEmpId() {
		return this.empId;
	}

	

	public LoginStatus getResponce() {
		return response;
	}

	public void setResponce(LoginStatus responce) {
		this.response = responce;
	}

}
