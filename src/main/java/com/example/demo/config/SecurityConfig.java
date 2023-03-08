package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.csrf().disable(); //csrf톸믄 비활성화
		http.authorizeRequests()
			.antMatchers("/", "/user/**", "/image/**", "subscribe/**", "comment/**")
			//.access("hssRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
			//.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
			.authenticated() //들어온요청이 인증이 필요하다고 말하는건데, .access()를 설정했기때문에 이건 주석
			.anyRequest() // 인증이 필요하지 않은 모든 요청을 말하는 것
			.permitAll(); //모두 허용
		
		    return http.build();
			
	}
}
