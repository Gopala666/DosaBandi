package com.dosabandi.dosabandi.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	@Column
	private String username;
	@Column
	private String password;
	
	
	public User() {
		super();		
	}

	public User(Integer iD, String username, String password) {
		super();
		ID = iD;
		this.username = username;
		this.password = password;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

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

	@Override
	public String toString() {
		return "User [ID=" + ID + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	

}
