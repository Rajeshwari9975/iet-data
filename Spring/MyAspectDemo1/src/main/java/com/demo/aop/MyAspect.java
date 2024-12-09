package com.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
   @After("execution(* com.demo.beans.*.m*())")
	public void after1() {
		System.out.println("After advice");
		
	}
   @Before("execution(* com.demo.beans.*.m*(int))")
	public void before1() {
		System.out.println("Before advice");
		
	}
//   @Around("execution(* com.demo.beans.*.m*())")
//	public void around1() {
//		System.out.println("Around advice");
//		
//	}
}
