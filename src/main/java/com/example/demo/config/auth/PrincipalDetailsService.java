package com.example.demo.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
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
			return new PrincipalDetails(userEntity);
			//UserDetails 가 PrincipalDetails가 상속받았기 때문에, PrincipalDetails를 리턴할 수 있다.
			//리턴이 성공적으로 되면 자동으로 UserDetails타입을 session을 저장해준다.
		}	
	}
	
	
	

	
}
