package com.demo.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class TestLocalDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. US english\2. UK english\n 3. Marathi\n4. other\n5. exit\n choice:");
			System.out.println("select language");
			choice = sc.nextInt();
			MessageSource ms = (MessageSource)ctx.getBean(ResourceBundleMessageSource.class);
			String m=null,n=null,w= null,s=null;
			Locale locale=null;
			switch(choice) {
			case 1:
				locale=Locale.US;
				
				break;
			case 2:
				locale= Locale.UK;
				break;
			case 3:
				 Locale.setDefault(new Locale("my", "marathi"));
				break;
			case 4:
				break;
			case 5:
				System.out.println("Thank you for visiting");
				break;
			default:
				System.out.println("invalide choice");
			
				
			}
			
			m =ms.getMessage("msg.pay",null, locale);
			n=ms.getMessage("msg.welcome",null, locale);
			w =ms.getMessage("msg.data",null, locale);
			s =ms.getMessage("msg.currency",null, locale);
			System.out.println(m);
			System.out.println(n);
			System.out.println(w);
			System.out.println(s);
			
		}while(choice!=5);
		
	}

}
