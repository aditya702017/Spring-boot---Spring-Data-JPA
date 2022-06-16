package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	
	@Query("select u from User u")
	public List<User> findByyAll();
	
	@Query("select u from User u where name=:n")
	public User getsy(@Param("n") String name);
	
	
}
