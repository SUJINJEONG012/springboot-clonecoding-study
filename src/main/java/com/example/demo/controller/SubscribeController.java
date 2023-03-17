package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.auth.PrincipalDetails;
import com.example.demo.dto.CMRespDto;
import com.example.demo.service.SubscribeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class SubscribeController {

	private final SubscribeService subscribeService;
	
	//구독하기
	@PostMapping("/subscribe/{to_user_id}")
	public ResponseEntity<?> subscribe(@AuthenticationPrincipal PrincipalDetails principalDetails, @PathVariable Integer to_user_id){
		subscribeService.구독하기(principalDetails.getUser().getId(), to_user_id);
		return new ResponseEntity<>( new CMRespDto<>(1, "구독하기성공", null), HttpStatus.OK);
	}
	
	
}
