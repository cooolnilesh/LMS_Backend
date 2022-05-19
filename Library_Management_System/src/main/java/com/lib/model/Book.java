package com.lib.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * Book Entity/Model Class With Annotation 
 * To Define The Table Structure Of Database 
 * using Object Relational Model
 */

@Entity
@Table(name = "Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "book_bookId_sequence")
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="AUTHOR")
	private String author;
	@Column(name="CATEGORY")
	private String category;
	@Column(name="EDITION")
	private String edition;
	
//	@ManyToOne
//	@JoinColumn(name = "userid")
//	@JsonIgnoreProperties("book")
//	private User user;
	
	@ManyToMany
	@JoinTable(name = "book_user", joinColumns = {
			@JoinColumn(name = "id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "userid", referencedColumnName = "userid") })
	@JsonIgnoreProperties("bookList")
	private List<User> user = new ArrayList();

	public Book() {
	}

	public Book(int id, String name, String author, String category, String edition) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.category = category;
		this.edition= edition;
	}

	public Book(int id, String name, String author, String category, String edition, List<User> user) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.category = category;
		this.edition = edition;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	

}