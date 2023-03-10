package com.example.demo.handler.ex;

import java.util.Map;

public class CustomValidationException extends RuntimeException {


    // 객체를 구분하기위 해 시리얼 넘버를 넣어준느것
	 //jvw을 위해 걸어주는 것
	private static final long serialVersionUID = 1L;

	private Map<String, String> errorMap;
	
	//내가만든메서드
	public CustomValidationException(String message, Map<String,String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}
	
	 public Map<String, String> getErrorMap(){
		 return errorMap;
	 }
	
}
