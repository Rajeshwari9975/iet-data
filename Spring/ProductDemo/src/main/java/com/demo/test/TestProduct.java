package com.demo.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.ProductService;

public class TestProduct {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		ProductService productService = (ProductService) ctx.getBean("productServiceImpl");
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Add New Product\n2.Delete Product\n3.Modify Product\n4.Display Product By ID");
			System.out.println("5.Dispaly All Products\n6.Display Products By Price\n7.Exit\n Choice:: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				int n = productService.save();
				if(n > 0) {
					System.out.println("Product Added Successfully");
				}else {
					System.out.println("Failed to Add Product");
				}
				break;
			case 2 :
				System.out.println("Enter Product ID to be deleted");
				int prodId = sc.nextInt();
				productService.deleteProduct(prodId);
				break;
			case 3 :
				break;
			case 4 :
				break;
			case 5 :
			productService.displayallproduct();
				break;
			case 6 :
				break;
			case 7 :
				break;
			default :
				break;
			}
		}while(choice != 7);
		
	}

}
