package com.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.dao.UserDao;
import com.onlineshopping.entity.UserPojo;

@Service

public class UserService {
	@Autowired
  private UserDao udao;
	public void saveUser(UserPojo user) {
		udao.save(user);
		
	}
	public List<UserPojo> getAll(UserPojo user){
		return udao.findAll();
		
	}

}
