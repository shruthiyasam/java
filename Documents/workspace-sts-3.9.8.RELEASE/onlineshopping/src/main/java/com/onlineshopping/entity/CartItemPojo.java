package com.onlineshopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cartItem")
public class CartItemPojo {
	@Id
	@GeneratedValue
	private Integer cartitemid;
	private String quality;
	private Integer price;
	@ManyToOne
	@JoinColumn(name="fkcartid")
	private CartPojo cart;
	public Integer getCartitemid() {
		return cartitemid;
	}
	public void setCartitemid(Integer cartitemid) {
		this.cartitemid = cartitemid;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public CartPojo getCart() {
		return cart;
	}
	public void setCart(CartPojo cart) {
		this.cart = cart;
	}
	

}
