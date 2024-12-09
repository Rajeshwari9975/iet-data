package com.demo.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.HelloWorld;
import com.demo.beans.Product;

public class TestHello {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("springconfig.xml");
		System.out.println("Before getbeans");
		HelloWorld hw = ctx.getBean(HelloWorld.class);
		hw.Hello();
		
		
		Product p = ctx.getBean(Product.class);
		System.out.println(p);
		
	}
	

}
