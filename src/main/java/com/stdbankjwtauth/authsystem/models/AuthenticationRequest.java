package com.stdbankjwtauth.authsystem.models;

public class AuthenticationRequest {
	private String username;
	private String password;
	
	public AuthenticationRequest(String Username,String Password) {
		this.username = Username;
		this.password = Password;
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
}
