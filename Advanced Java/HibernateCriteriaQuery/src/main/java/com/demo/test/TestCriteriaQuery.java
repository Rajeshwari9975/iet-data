package com.demo.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.demo.beans.Product;

public class TestCriteriaQuery {
	
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Criteria cr = session.createCriteria(Product.class);
		
		Criterion cr1 = Restrictions.gt("prodPrice", 100);
		Criterion cr2 = Restrictions.lt("prodPrice", 800);
		LogicalExpression expr = Restrictions.and(cr1, cr2);
		Criterion cr3 = Restrictions.like("prodDesc", "ACE%");
		LogicalExpression expr1 = Restrictions.and(expr, cr3);
		cr.add(expr1);
		List<Product> plist = cr.list();
		plist.forEach(System.out::println);
		
		tr.commit();
		session.close();
		sf.close();
	}

}
