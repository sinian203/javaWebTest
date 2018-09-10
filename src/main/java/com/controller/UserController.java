package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserEntity;
import com.service.UserService;
import com.utils.R;

@RestController
@RequestMapping("/user/") 
public class UserController{
	@Autowired private UserService userService;
	
	@RequestMapping(value="list")
	public R list(){
		List<UserEntity>list = userService.getAll();
		
		return R.ok().put("rows", list.toArray()).put("total", list.size());
	} 

	@RequestMapping(value="save")
	public R save(@RequestBody UserEntity userEntity){
		userService.save(userEntity);
		
		return R.ok();
	} 
}
