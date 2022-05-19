package com.lib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@Column(name="adminid")
	String adminid;
	@Column(name="first")
	String first;
	@Column(name="last")
	String last;
	@Column(name="email")
	String email;
	@Column(name="phone")
	Long phone;
	@Column(name="password")
	String password;
	public Admin(String adminid, String first, String last, String email, Long phone, String password) {
		super();
		this.adminid = adminid;
		this.first = first;
		this.last = last;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}