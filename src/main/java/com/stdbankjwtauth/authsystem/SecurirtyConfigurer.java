package com.stdbankjwtauth.authsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

import com.stdbankjwtauth.authsystem.services.FileBasedUserDetailsService;

@EnableWebSecurity
public class SecurirtyConfigurer extends WebSecurityConfiguration {
	@Autowired
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.getDefaultUserDetailsService();
	}	
}
