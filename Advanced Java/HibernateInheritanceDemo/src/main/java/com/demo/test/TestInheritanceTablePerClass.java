package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Customer;
import com.demo.beans.Employee;

public class TestInheritanceTablePerClass {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp = new Employee(101, "Nihal", "1234", "abc", "xxx");
		Customer cust = new Customer(102, "zzzz", "1111", "sxsss", "ssss");
		session.save(emp);
		session.save(cust);
		tr.commit();
		session.close();
		sf.close();
	}
}
