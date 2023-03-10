package com.example.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController //데이터를 응답 할 수 잇게
@ControllerAdvice //모든 Exception을 여기로 받아준다.
public class ControllerExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public String validationException(RuntimeException e) {
		return e.getMessage();
	}
	
}
