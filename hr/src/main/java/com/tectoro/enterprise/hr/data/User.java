package com.tectoro.enterprise.hr.data;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {


	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "status")
	private short status;

	/*
	 * @JoinColumn(name = "role") private List<UserRole> roles;
	 */
	@OneToOne
	@JoinColumn(name="empid",referencedColumnName = "id")
	private Employee employee;
	

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

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	/*
	 * public List<Roles> getRole() { return this.roles; }
	 * 
	 * public void setRole(List<Roles> role) { this.roles = role; }
	 */
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
