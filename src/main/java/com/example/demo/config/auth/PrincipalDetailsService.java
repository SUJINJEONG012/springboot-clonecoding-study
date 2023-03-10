package com.example.demo.config.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PrincipalDetailsService implements UserDetailsService {

	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	//	System.out.println(username + "loadUserByUsername 실행됨");
		
		User userEntity = userRepository.findByUsername(username);
		if(userEntity == null) { //username이; null이라면
			return null; // null을 리턴
		}else { //null 아니면(username을 찾았다면) userEntity리턴
			return userEntity;
		}	
	}

	
}
