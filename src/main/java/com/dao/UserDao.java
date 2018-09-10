package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.entity.UserEntity;

public interface UserDao extends CrudRepository<UserEntity, Integer>{
	@Query("select u from UserEntity u")
	List<UserEntity>getAll();
}
