package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "empl")
@DiscriminatorValue("Empl000")
public class Employee extends Person{
	
	private String Dept;
	private String desg;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String mob,String dept, String desg) {
		super(id,name,mob);
		Dept = dept;
		this.desg = desg;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [Dept=" + Dept + ", desg=" + desg + "]";
	}
	

}
