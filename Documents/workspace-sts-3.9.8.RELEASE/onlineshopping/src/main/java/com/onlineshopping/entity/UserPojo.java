package com.onlineshopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserPojo {
	@Id
	@GeneratedValue
	private Integer userid;
	private String username;
	private String userpassowrd;
	@OneToOne(mappedBy = "user")
	private CustomerPojo customer;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassowrd() {
		return userpassowrd;
	}
	public void setUserpassowrd(String userpassowrd) {
		this.userpassowrd = userpassowrd;
	}
	public CustomerPojo getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerPojo customer) {
		this.customer = customer;
	}
	
	

}
