package com.example.demo.service;

import java.awt.Image;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.ImageRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ImageService {

	private final ImageRepository imageRepository;
	
	 @Transactional(readOnly = true)
	    public List<Image> 모든이미지(Integer principalId, Pageable pageable) {
	        List<Image> images = imageRepository.mStoryAll(pageable);
	        images.forEach((image) -> {
//	            image.setLikeCount(image.getLikes().size());
//	            image.getLikes().forEach((like) -> {
//	                if (like.getUser().getId() == principalId) {
//	                    image.setLikeState(true);
//	                }
//	            });
	        });

	        return images;
	    }
}
