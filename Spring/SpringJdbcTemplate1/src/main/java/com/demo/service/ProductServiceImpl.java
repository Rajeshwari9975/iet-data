package com.demo.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.Productdao;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	Productdao pdao;

	@Override
	public void addnewproduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr product prodid ");
		int pid= sc.nextInt();
		System.out.println("Enter Product desc");
		String proddesc = sc.next();
		System.out.println("Enter Product Price ");
		int price = sc.nextInt();
	Product p = new Product(pid, proddesc, price);
		pdao.save(p);
		
		
	}

	@Override
	public boolean removebyid(int pid) {
		
		
		return pdao.deleteById(pid);
	}

	@Override
	public boolean updateById(int pid, String desc, int price) {
		
		return pdao.modifybyid(pid,desc,price);
	}

	@Override
	public Product displaybyid(int pid) {
		// TODO Auto-generated method stub
		return pdao.dispalybyid(pid);
	}

	
	

}
