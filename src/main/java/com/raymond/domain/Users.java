package com.raymond.domain;

// Generated 2011-11-5 17:09:59 by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "Users", schema = "RAYMOND_APP")
public class Users implements java.io.Serializable {

	private int id;
	private String name;
	private String password;

	public Users() {
	}

	public Users(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}