package com.example.demo.dto;


import com.example.demo.domain.User;

import lombok.Data;

@Data
public class SignupDto {

	private String username;
	private String password;
	private String email;
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
