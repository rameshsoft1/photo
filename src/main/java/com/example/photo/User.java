package com.example.photo;

import org.springframework.data.annotation.Id;

public class User {
	@Id
	public String id;
	public String username;
	public String email;
	
	public User() {
		
	}
	
	public User(String id,String username,String email) {
		super();
		this.id=id;
		this.username=username;
		this.email=email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	
	
	
	
}
