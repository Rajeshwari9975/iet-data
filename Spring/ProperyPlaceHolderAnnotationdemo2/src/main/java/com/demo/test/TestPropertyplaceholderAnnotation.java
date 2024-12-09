package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Category;
import com.demo.beans.Product;

public class TestPropertyplaceholderAnnotation {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("springconfig.xml");
		Product p = (Product)ctx.getBean("product");
		//Product p1 = (Product) ctx.getBean("product");
		Category c = (Category) ctx.getBean("category");
		System.out.println(p);
		System.out.println(c);
		((AbstractApplicationContext) ctx).close();
		
	}
	

}
