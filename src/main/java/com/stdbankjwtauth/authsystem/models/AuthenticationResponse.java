package com.stdbankjwtauth.authsystem.models;

public class AuthenticationResponse {
	private final String jwt;
	
	public AuthenticationResponse(String Jwt) {
		this.jwt = Jwt;
	}
	
	public String getJwt() {
		return jwt;
	}
}
