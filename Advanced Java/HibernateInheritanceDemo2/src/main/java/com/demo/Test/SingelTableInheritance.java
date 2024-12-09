package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Customer;
import com.demo.beans.Employee;

public class SingelTableInheritance {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee(196, "rajeshwari", "8469487", "cs", "dfsg");
		Customer cust = new Customer(296, "xxx", "65473", "cbb", "vvvv");
		session.save(emp);
		session.save(cust);
		tr.commit();
		session.close();
		sf.close();
		
	}
	

}
