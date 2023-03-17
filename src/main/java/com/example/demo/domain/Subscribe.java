package com.example.demo.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Subscribe {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@JoinColumn(name="fromUserId")
	@ManyToOne
	private User fromUser; //나를 팔로우하는 사람
	
	@JoinColumn(name="toUserId")
	@ManyToOne
	private User toUser; //내가 팔로우하는 사람
	
	private LocalDateTime createDate;
	
}
