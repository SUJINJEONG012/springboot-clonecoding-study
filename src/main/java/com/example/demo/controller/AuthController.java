package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
	
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
	public String signup() {
		return "auth/signin"; //회원가입이 되면 로그인페이지로 이동하게끔
	}
	
	
}
