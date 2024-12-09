package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Product {
	
	//@Value("101")
	private int pid;
	
	//@Value("Table")
	private String pname;
	
	//@Value("50")
	private int qty;
	
	//@Autowired
	//@Qualifier("c1")
	private Category c1;

	public Product() {
		super();
	}

	public Product(int pid, String pname, int qty, Category c) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.c1 = c;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Category getC() {
		return c1;
	}

	public void setC(Category c) {
		this.c1 = c;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", c=" + c1 + "]";
	}
	
	
	
	

}
