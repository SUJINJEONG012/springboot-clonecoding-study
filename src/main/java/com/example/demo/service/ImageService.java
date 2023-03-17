package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Image;
import com.example.demo.repository.ImageRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ImageService {
	
	private final ImageRepository imageRepository;

	public List<Image> 피드이미지(Integer principalId){
		List<Image> images= imageRepository.mFollowFeed(principalId);
		return images;
	}
	
}
