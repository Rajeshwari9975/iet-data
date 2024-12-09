package com.demo.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao pdao;

	@Override
	public int save() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID");
		int prodId = sc.nextInt();
		System.out.println("Enter Product Description");
		sc.nextLine();
		String desc = sc.nextLine();
		System.out.println("Enter Product Price");
		int price = sc.nextInt();
		
		Product p = new Product(prodId, desc, price);
		return pdao.save(p);
	}

	@Override
	public void deleteProduct(int prodId) {
		pdao.deleteProductById(prodId);
	}

	@Override
	public void displayallproduct() {
		pdao.display();
		
	}

}
