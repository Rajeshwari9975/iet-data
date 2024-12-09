package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestProduct {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Scanner sc = new Scanner(System.in);
		ProductService pservice = (ProductService) ctx.getBean("productServiceImpl");
		int choice = 0;
		do {
			System.out.println("1. add new product\n 2. delete product\n 3. modify product\n");
			System.out.println("4. display by id\n 5. display all\n 6. display by price\n7.exit\nchoice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				pservice.addnewproduct();
				break;
			case 2:
				System.out.println("Enetr id you want to delete");
				int pid = sc.nextInt();
				 boolean status = pservice.removebyid(pid);
				if(status) {
					System.out.println("Product Deleted Successfully");
				}
				else {
					System.out.println("Product not deleted");
				}
				  
				break;
			case 3:
				System.out.println("Enter prodId you want to modify ");
			    pid= sc.nextInt();
			    System.out.println("Enter ProdDec You want to modify");
			    String desc=sc.next();
			    System.out.println("Enter Price You wnt to modify ");
			    int price = sc.nextInt();
			    status =  pservice.updateById(pid,desc,price);
			   if(status) {
				   System.out.println("updateSuccessfully");
			   }else {
				   System.out.println("not Update Succuessfully");
			   }
				
				break;
			case 4:
				System.out.println("Eneter Id you want display");
				pid = sc.nextInt();
				Product p = pservice.displaybyid(pid);
				
				if(p!=null) {
					System.out.println(p);
				}else {
					System.out.println("invalid ");
				}
				
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				System.out.println("thank you for visiting ");
				break;
			default:
				System.out.println("invalid choice");
				break;
				
			}
			
		}while(choice!=7);
		
	}

}
