package com.stdbankjwtauth.authsystem.services;
import java.nio.file.Files; import java.nio.file.Paths; import
java.util.List; import java.util.ArrayList;
  
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.security.core.userdetails.User; 
import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.security.core.userdetails.UserDetailsService; 
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder; 
import org.springframework.security.provisioning.InMemoryUserDetailsManager; 
import org.springframework.stereotype.Service;  
 
@Configuration
@Service 
public class FileBasedUserDetailsService { 
	private static final String FILE_PATH = "C:\\repos\\STDBank-JWT-Auth-System\\stdbank-jwt-auth\\credentials.txt";
 
@Bean 
public UserDetailsService userDetailsService() { 
	List<String> lines = new ArrayList<>(); 
	try { lines = Files.readAllLines(Paths.get(FILE_PATH));
	}catch (Exception e) { 
		e.printStackTrace(); }
	for (String line : lines) {
		String[] parts = line.split(":"); 
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder(); 
		UserDetails user
				= User.withUsername(parts[0]) 
				.password(encoder.encode(parts[1]))
				.roles("USER") 
				.build();
				return new InMemoryUserDetailsManager(user); 
				} 
	throw new UsernameNotFoundException("Username not found: "+ lines); 
				}
}
