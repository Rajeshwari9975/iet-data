package com.demo.beans;

public class Product {
	private int prodid;
	private String Desc;
	private int price;
	public Product() {
		super();
	}
	public Product(int prodid, String desc, int price) {
		super();
		this.prodid = prodid;
		Desc = desc;
		this.price = price;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", Desc=" + Desc + ", price=" + price + "]";
	}
	

}
