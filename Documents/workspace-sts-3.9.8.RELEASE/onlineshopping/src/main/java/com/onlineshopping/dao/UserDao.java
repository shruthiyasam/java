package com.onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshopping.entity.UserPojo;
@Repository
public interface UserDao extends JpaRepository<UserPojo, Integer>{

}
