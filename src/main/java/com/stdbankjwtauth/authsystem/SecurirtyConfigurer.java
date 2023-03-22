package com.stdbankjwtauth.authsystem;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@EnableWebSecurity
public class SecurirtyConfigurer extends WebSecurityConfiguration {
	//@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.getDefaultUserDetailsService();
	}	
}
