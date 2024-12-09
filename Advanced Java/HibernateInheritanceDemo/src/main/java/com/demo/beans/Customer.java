package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name = "Customer12345")
@DiscriminatorValue(value = "Customer")
public class Customer extends Person {
	
	private String relationMgr;
	private String addr;
	
	public Customer() {
		super();
	}

	public Customer(int id, String name, String mobile,String relationMgr, String addr) {
		super(id,name,mobile);
		this.relationMgr = relationMgr;
		this.addr = addr;
	}

	public String getRelationMgr() {
		return relationMgr;
	}

	public void setRelationMgr(String relationMgr) {
		this.relationMgr = relationMgr;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return super.toString()+"Customer [relationMgr=" + relationMgr + ", addr=" + addr + "]";
	}
	
	
	

}
