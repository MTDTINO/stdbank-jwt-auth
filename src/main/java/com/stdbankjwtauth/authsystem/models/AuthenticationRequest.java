package com.stdbankjwtauth.authsystem.models;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public AuthenticationRequest(String Username,String Password) {
		this.setUsername(Username);
		this.setPassword(Password);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String Username) {
		this.username = Username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String Password) {
		this.password = Password;
	}
	
	public AuthenticationRequest() {
		
	}
}
