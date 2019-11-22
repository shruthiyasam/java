package com.onlineshopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductPojo {
	@Id
	@GeneratedValue
 private Integer productid;
 private String prdcategory;
 private String prddescription;
 private String prgmanufacture;
 private String prdname;
 private String prdprice;
 private String prdstock;
 @ManyToOne
@JoinColumn(name="fkcid")
private CartItemPojo cartitems;
public Integer getProductid() {
	return productid;
}
public void setProductid(Integer productid) {
	this.productid = productid;
}
public String getPrdcategory() {
	return prdcategory;
}
public void setPrdcategory(String prdcategory) {
	this.prdcategory = prdcategory;
}
public String getPrddescription() {
	return prddescription;
}
public void setPrddescription(String prddescription) {
	this.prddescription = prddescription;
}
public String getPrgmanufacture() {
	return prgmanufacture;
}
public void setPrgmanufacture(String prgmanufacture) {
	this.prgmanufacture = prgmanufacture;
}
public String getPrdname() {
	return prdname;
}
public void setPrdname(String prdname) {
	this.prdname = prdname;
}
public String getPrdprice() {
	return prdprice;
}
public void setPrdprice(String prdprice) {
	this.prdprice = prdprice;
}
public String getPrdstock() {
	return prdstock;
}
public void setPrdstock(String prdstock) {
	this.prdstock = prdstock;
}
public CartItemPojo getCartitems() {
	return cartitems;
}
public void setCartitems(CartItemPojo cartitems) {
	this.cartitems = cartitems;
}
}
