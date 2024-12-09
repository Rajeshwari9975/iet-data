package com.demo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Product implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{
	
	//@Value("101")
	private int pid;
	
	//@Value("Chair")
	private String pname;
	
	//@Value("75")
	private int qty;

	public Product() {
		
		super();
		System.out.println("In defuault constructer");
	}

	public Product(int pid, String pname, int qty) {
		super();
		System.out.println("In para constructer");
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
	}

	public int getPid() {
		
		return pid;
	}

	public void setPid(int pid) {
		System.out.println("In setpid");
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		System.out.println("In setpname");
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		System.out.println("in setQty");
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + "]";
	}
	public void setBeanName(String name) {
		System.out.println("in setbeanname"+name);
	}
	
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("in setBeanFactory");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("in afterpropertiesset");
		
	}
	public void myinit() {
		System.out.println("In init method");
	}
	public void Destroy() throws Exception {
		System.out.println("in disposebal bean Destroy method");
	}
	public void  mydestroy() {
		System.out.println("in mydestroy method ");
	}
	public void setApplicationContext(ApplicationContext applicatioContext) throws BeansException{
		System.out.println("in setApplicationContext");
	}

	@Override
	public void destroy() throws Exception {
		
		
	}

}
