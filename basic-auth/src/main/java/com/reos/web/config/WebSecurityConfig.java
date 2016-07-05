package com.reos.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("reos")
				.password("pwd")
				.roles("USER")
				.and()
				.withUser("admin")
				.password("pwd")
				.roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/login*").permitAll()
				.antMatchers("/anonymous*").anonymous()
				.anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/login.html")
				.loginProcessingUrl("/perform-login")
				.defaultSuccessUrl("/user/homepage.html")
				.failureUrl("/login.html?error=true")
			.and()
			.logout()
				.logoutSuccessUrl("/login.html")
				.logoutUrl("/perform-logout");			
	}	
}
