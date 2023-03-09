package com.example.demo.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.demo.domain.User;

import lombok.Data;

@Data
public class SignupDto {
	
	@Size(min=3, max=20)
	private String username;
	
	@NotBlank
	private String password;
	@NotBlank
	private String email;
	@NotBlank
	private String name;


	/*
	 * DTO데이터를 오브젝트에 담기 쉬운 방법 Builder패턴을 사용 => User파일에 Builder 적용
	 * 
	 * 클래스내부에 User 오브젝트를 받는 toEntity()를 만들고 Building
	 * 이렇게 하는 이유는
	 * dto가 가지고 있는 username,passwod,email,name데이터를 기반으로 한 user객체가 생성
	 * 
	 * */
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.email(email)
				.name(name)
				.build();
	}
}
