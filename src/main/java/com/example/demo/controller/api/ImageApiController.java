package com.example.demo.controller.api;

import java.awt.Image;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.auth.PrincipalDetails;
import com.example.demo.dto.CMRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ImageApiController {

	@GetMapping("/api/image/all")
    public ResponseEntity<?> imageStoryAll(
            @PageableDefault(size = 3, sort = "id", direction = Sort.Direction.DESC) Pageable pageable,
            @AuthenticationPrincipal PrincipalDetails principalDetails) {
        List<Image> images = imageService.모든이미지(principalDetails.getUser().getId(), pageable);
        return new ResponseEntity<>(
                new CMRespDto<>(1, "성공", images), HttpStatus.OK);
    }
	
}
