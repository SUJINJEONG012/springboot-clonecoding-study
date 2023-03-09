package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuthService {
	
	private final UserRepository userRepository;

	public User 회원가입(User user) {
		//회원가입 진행
		User userEntity = userRepository.save(user);
		
		return userEntity;
	}
}
