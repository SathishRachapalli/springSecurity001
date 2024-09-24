package com.demo.configurations;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity(debug=true)
public class securityConfig {
	
	@Bean
	public  InMemoryUserDetailsManager setupUser()
	{
		
		GrantedAuthority obj1=new SimpleGrantedAuthority("admin");
		GrantedAuthority obj2=new SimpleGrantedAuthority("user");
		
		List<GrantedAuthority> ArrayListOne=Arrays.asList(obj1,obj2);
		
		
		UserDetails userDetailsObj=new User("root", "root",ArrayListOne);
		
		InMemoryUserDetailsManager userDB = new InMemoryUserDetailsManager();
		
		userDB.createUser(userDetailsObj);
		
		return userDB;

		
	}
	
	
	@Bean
	public PasswordEncoder getPasswordEncryptor()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	
	
	
	
}
