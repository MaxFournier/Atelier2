package com.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname; 

	@Column(name = "password")
	private String password;

	@Column(name = "argent")
	private float argent;
	
	
	public User() {
	}

	public User(int id,String name, String surname, String password, float argent) {
		super();
		this.id=id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.argent = argent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public float getArgent() {
		return this.argent;
	}

	public void setArgent(float argent) {
		this.argent = argent;
	}

}
