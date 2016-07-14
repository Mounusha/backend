package com.niit.hellospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args)
{
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.hellospring");
	context.refresh();
	 Product p=(Product)context.getBean("viewobject");
     
     p.setId("1");
     p.setName("abc");
     p.setPrice(15000);
     System.out.println(p.getId());
     System.out.println(p.getName());
     System.out.println(p.getPrice());
	System.out.println("category is created");
 }
}
