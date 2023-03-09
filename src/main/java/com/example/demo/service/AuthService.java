package com.example.demo.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuthService {
	
	private final UserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	/*
	 * Transactional 어노테이션은 해당 메서드가 시작하고 종료될 때까지 트랜잭션 관리 해준다.
	 * 일반적으로 get아닌 insert,update,delete기능일 때 사용
	 * */

	@Transactional
	public User 회원가입(User user) {
		//회원가입 진행
		
		String rawPassword = user.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		user.setRole("ROLE_USER"); // 권한지정

		
		User userEntity = userRepository.save(user);
		
		return userEntity;
	}
	
}
