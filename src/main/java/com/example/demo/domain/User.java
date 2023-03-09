package com.example.demo.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {

	@Id //primary key 지정해주는 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //데어티가 들어갈 때마다 번호 설정
	private Integer id; //자동 번호  아이디번호값
	
	@Column(unique = true, length=20, nullable=false)
	private String username;  //이름
	
	@Column(nullable=false)
	private String password; //비밀번호
	
	@Column(nullable=false)
	private String name; //별명
	
	private String website; //웹사이트
	private String bio; //자기소개
	
	@Column(nullable=false)
	private String email; //이메일
	
	private String phone;//전화번호
	private String gender; //성별
	private String prifileImageUrl;//프로필 사진
	private String role; // 권한
	
	private LocalDateTime createDate; //데이터 입력시간
	
	/*
	 * 데이터가 insert 되기 직전 실행해준다.
	 * */
	@PrePersist
	public void createDate() {
		this.createDate= LocalDateTime.now();
	}
	
}
