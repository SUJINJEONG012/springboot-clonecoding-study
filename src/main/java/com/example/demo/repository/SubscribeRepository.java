package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.Subscribe;

public interface SubscribeRepository extends JpaRepository<Subscribe, Integer> {

	@Modifying
	@Query(value="INSERT INTO subscribe(from_user_id, to_user_id, create_date) VALUES(:from_user_id, :to_user_id, now())", nativeQuery= true)
	void mSubscribe(Integer from_user_id, Integer to_user_id);
}
