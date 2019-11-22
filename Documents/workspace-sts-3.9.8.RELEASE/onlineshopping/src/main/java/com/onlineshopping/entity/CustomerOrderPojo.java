package com.onlineshopping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CustomerOrder")
public class CustomerOrderPojo {
	@Id
	@GeneratedValue
	private String customerorderid;
	@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="fkcartid")
	private CartPojo  cart;
	

}
