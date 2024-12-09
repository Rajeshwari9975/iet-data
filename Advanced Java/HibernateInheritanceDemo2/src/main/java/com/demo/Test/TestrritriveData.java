package com.demo.Test;

import java.beans.Customizer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Customer;
import com.demo.beans.Employee;

public class TestrritriveData {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e1 = session.get(Employee.class,196 );
		Customer c1 = session.get(Customer.class, 296);
		System.out.println(e1);
		System.out.println(c1);
		tr.commit();
		session.close();
		sf.close();
	}

}
