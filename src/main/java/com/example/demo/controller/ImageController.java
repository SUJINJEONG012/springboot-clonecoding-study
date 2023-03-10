package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {
	
	@GetMapping({"/", "/image/all"})
	public String story() {
		return "image/story";
	}
	
}
