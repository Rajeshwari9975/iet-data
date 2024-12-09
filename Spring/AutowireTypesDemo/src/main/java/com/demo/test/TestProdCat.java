package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Category;
import com.demo.beans.Product;

public class TestProdCat {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Product p = (Product) ctx.getBean("p1");
		Product p1 = (Product) ctx.getBean("p2");
	
		System.out.println(p);
		System.out.println("...............................");
		System.out.println(p1);
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
