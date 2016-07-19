package com.nit.ShoppingShop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		 
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		 context.scan("com.nit.shoppingshop");
		 context.refresh();
		 Category c1=(Category)context.getBean("category");
		 c1.setId("101");
		 c1.setName("Spana");
		 System.out.println(c1.getId());
		 System.out.println(c1.getName());
		 System.out.println("Category is created");
		 
	}
		
}
