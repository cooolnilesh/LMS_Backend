package com.lib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



/*
 * User Entity/Model Class With Annotation 
 * To Define The Table Structure Of Database 
 * using Relational Model
 */
@Entity
@Table(name="user_info")
public class User {
	@Id
	@SequenceGenerator(name="user_userid_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	

	private Integer  userid;
	@Column(name="userName")
	private String userName;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private Long phone;
	@Column(name="password")
	private String password;
	@Column(name="address")
	private String address;
	
//	@OneToMany(mappedBy = "user") // , cascade = CascadeType.ALL)
//	@JsonIgnoreProperties("user")
//	private List<Book> book;
//	
	@ManyToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("user")
	private List<Book> bookList = new ArrayList();
	
	
	
	

	public User(Integer userid, String userName, String firstName, String lastName, String email, Long phone,
		String password, String address, List<Book> bookList) {
	super();
	
	this.userid = userid;
	this.userName = userName;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phone = phone;
	this.password = password;
	this.address = address;
	this.bookList = bookList;
}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserid() {
		return userid;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public void setUserid(Integer  userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public List<Book> getBook() {
//		return book;
//	}
//	public void setBook(List<Book> book) {
//		this.book = book;
//	}

}
