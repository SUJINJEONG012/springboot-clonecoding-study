package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.SubscribeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SubscribeService {

	private final SubscribeRepository subscribeRepository;
	
	@Transactional
	public void 구독하기(Integer from_user_id, Integer to_user_id) {
		subscribeRepository.mSubscribe(from_user_id, to_user_id);
	}
}
