package com.onlineshopping.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CartPojo {
	@Id
	@GeneratedValue
	private Integer cartid;
	@OneToOne(mappedBy = "cart")
	private CustomerPojo customer;
	@OneToMany(mappedBy = "cart")
	private List<CartItemPojo > cartitemlist;
	@OneToOne(mappedBy = "cart")
	private CustomerOrderPojo customerorder;
	public List<CartItemPojo> getCartitemlist() {
		return cartitemlist;
	}
	public void setCartitemlist(List<CartItemPojo> cartitemlist) {
		this.cartitemlist = cartitemlist;
	}
	public CustomerOrderPojo getCustomerorder() {
		return customerorder;
	}
	public void setCustomerorder(CustomerOrderPojo customerorder) {
		this.customerorder = customerorder;
	}
	public Integer getCartid() {
		return cartid;
	}
	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}
	public CustomerPojo getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerPojo customer) {
		this.customer = customer;
	}
	

}
