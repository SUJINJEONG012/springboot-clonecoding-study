package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {
	
 
	@Query(value="select * from image where user_id in (select to_user_id from subscribe where from_user_id = :principalId) order by id desc", nativeQuery= true)
	List<Image> mFollowFeed(Integer PrincipalId); 
	
}
