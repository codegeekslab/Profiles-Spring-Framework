package com.codegeekslab.test;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.codegeekslab.cart.ShoppingCart;
import com.codegeekslab.menu.Menu;

public class Test {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.getEnvironment().setActiveProfiles("global", "breakfast");
		context.load("beans.xml");
		context.refresh();
		Menu item1 = (Menu) context.getBean("first");
		Menu item2 = (Menu) context.getBean("second");
		Menu item3 = (Menu) context.getBean("sixth");
	//	Menu item5 = (Menu) context.getBean("third");
 		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");
		cart.addItem(item1);
		cart.addItem(item2);
		//Scart.addItem(item3);
		System.out.println("Shopping cart  contains " + cart.getItems());

	}
}
