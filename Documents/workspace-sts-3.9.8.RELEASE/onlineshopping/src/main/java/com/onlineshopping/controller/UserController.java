package com.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.entity.UserPojo;
import com.onlineshopping.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userservice;
	@PostMapping
	public void saveUser(@RequestBody UserPojo user) {
		userservice.saveUser(user);
	}
	@GetMapping("/allusers")
	public List<UserPojo> getAll(UserPojo user){
		return userservice.getAll(user);
	}

}
