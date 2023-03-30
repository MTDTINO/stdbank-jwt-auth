package com.stdbankjwtauth.authsystem;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.thymeleaf.standard.expression.AndExpression;

import com.stdbankjwtauth.authsystem.services.FileBasedUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurirtyConfigurer extends WebSecurityConfiguration {
	@Autowired
	public FileBasedUserDetailsService userDetailsService;

	/*
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.getAllUserDetailsService();
		//auth.inMemoryAuthentication()
	}
	 */
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService.userDetailsService())
		.and()
		.build();
	}
	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
	    return http.getSharedObject(AuthenticationManagerBuilder.class)
	            .build();
	}

	protected void configure(HttpSecurity http) throws Exception{
		http
		.csrf()
		.disable()
		.authorizeHttpRequests().requestMatchers("/authenticate")
		.permitAll().anyRequest()
		.authenticated()
		.and().sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
	@SuppressWarnings("deprecation")
	protected void configure1(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
	        .requestMatchers("/hello").permitAll()
	        .anyRequest().authenticated()
	        .and().httpBasic();
	}
	
}
