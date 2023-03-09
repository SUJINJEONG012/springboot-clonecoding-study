package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.User;
import com.example.demo.dto.SignupDto;
import com.example.demo.service.AuthService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class AuthController {
	
	private static final Logger log = LoggerFactory.getLogger(AuthController.class);
	
	
	//@Autowired
	private final  AuthService authService;
	
	// 로그인 페이지로 이동
	@GetMapping("/auth/signin")
	public String singinForm() {
		return "auth/signin";
	}
	
	//회원가입 페이지로 이동
	@GetMapping("/auth/signup")
	public String signupForm() {
		return "auth/signup";
	}
	
	
	//회원가입기능
	@PostMapping("/auth/signup")
	public String signup(SignupDto signupDto) {
		log.info("@@@ log확인 ::"+ signupDto.toString());
		
		User user = signupDto.toEntity();
		//log.info(user.toString());
		
		authService.회원가입(user);
		 
		return "auth/signin"; //회원가입이 되면 로그인페이지로 이동하게끔
	}
	
	
}
