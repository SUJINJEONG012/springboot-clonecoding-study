package com.example.demo.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//응답을 목적한 dto
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CMRespDto<T> {

	private Integer code; //성공1, 실패-1
	private String message;
	private T data;
}
