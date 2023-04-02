package com.stdbankjwtauth.authsystem.models;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String jwt;
	
	public AuthenticationResponse(String Jwt) {
		this.jwt = Jwt;
	}
	
	public String getJwt() {
		return jwt;
	}

}
