package com.onlineshopping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class CustomerPojo {
	@Id
	@GeneratedValue
	private Integer custid;
	private String custname;
	private Integer custphnnum;
	@OneToOne(cascade = CascadeType.ALL)
	private UserPojo user;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkbillid")
	private BillingaddressPojo billingaddress;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkcartid")
	private CartPojo cart;
	public CartPojo getCart() {
		return cart;
	}
	public void setCart(CartPojo cart) {
		this.cart = cart;
	}
	public BillingaddressPojo getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(BillingaddressPojo billingaddress) {
		this.billingaddress = billingaddress;
	}
	public Integer getCustid() {
		return custid;
	}
	public void setCustid(Integer custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Integer getCustphnnum() {
		return custphnnum;
	}
	public void setCustphnnum(Integer custphnnum) {
		this.custphnnum = custphnnum;
	}
	public UserPojo getUser() {
		return user;
	}
	public void setUser(UserPojo user) {
		this.user = user;
	}

}
