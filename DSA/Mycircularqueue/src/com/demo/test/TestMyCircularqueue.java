package com.demo.test;

import com.demo.beans.Customer;
import com.demo.service.MycircularqueueCustomer;

public class TestMyCircularqueue {
	public static void main(String[] args) {
		MycircularqueueCustomer qlist = new MycircularqueueCustomer(5);
		qlist.enqueue(new Customer(1, "ram", "cxxx"));
		qlist.enqueue(new Customer(1, "ram", "cxxx"));
		qlist.enqueue(new Customer(1, "ram", "cxxx"));
		qlist.enqueue(new Customer(1, "ram", "cxxx"));
	}
	
	

}
