package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Mycalss;

public class TestAop {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
	Mycalss obj = (Mycalss) ctx.getBean("mycalss");
	obj.m1();
	obj.getname();
	obj.m3(8);
}
}
