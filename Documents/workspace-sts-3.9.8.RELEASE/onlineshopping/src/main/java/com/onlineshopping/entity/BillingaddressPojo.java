package com.onlineshopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billingaddres")
public class BillingaddressPojo {
	@Id
	@GeneratedValue
	private String billindAddressId;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	
@OneToOne(mappedBy ="billingaddress" )
private CustomerPojo customer;

public String getBillindAddressId() {
	return billindAddressId;
}

public void setBillindAddressId(String billindAddressId) {
	this.billindAddressId = billindAddressId;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public CustomerPojo getCustomer() {
	return customer;
}

public void setCustomer(CustomerPojo customer) {
	this.customer = customer;
}

}
