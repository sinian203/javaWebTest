package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.UserDao;
import com.entity.UserEntity;

@Service("userService") 
public class UserService {
	@Autowired private UserDao userDao;
	
	
	public List<UserEntity> getAll(){
		return userDao.getAll();
	} 

	public void save(UserEntity userEntity){
		userDao.save(userEntity);
	} 
}
