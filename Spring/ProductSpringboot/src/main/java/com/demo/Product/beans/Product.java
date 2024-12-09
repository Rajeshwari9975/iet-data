package com.demo.Product.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prod123")
public class Product {
	
	@Id
	private int prodId;
	private String description;
	private int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String desc, int price) {
		super();
		this.prodId = prodId;
		this.description = desc;
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", desc=" + description + ", price=" + price + "]";
	}
	
	

}
