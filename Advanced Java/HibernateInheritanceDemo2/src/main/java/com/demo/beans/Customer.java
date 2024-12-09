package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Custo")
@DiscriminatorValue("cust")
public class Customer extends Person{
	
	private String rm;
	private String address;
	public Customer() {
		super();
	}
	public Customer(int id, String name, String mob,String rm, String address) {
		super(id,name,mob);
		this.rm = rm;
		this.address = address;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return super.toString()+"Customer [rm=" + rm + ", address=" + address + "]";
	}
	

}
