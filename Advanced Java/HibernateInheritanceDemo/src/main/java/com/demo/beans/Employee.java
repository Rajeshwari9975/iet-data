package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name = "Emp12345")
@DiscriminatorValue(value = "Emp")
public class Employee extends Person {
	
	private String dept;
	private String designation;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String mobile,String dept, String designation) {
		super(id,name,mobile);
		this.dept = dept;
		this.designation = designation;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", designation=" + designation + "]";
	}
	
	
	

}
