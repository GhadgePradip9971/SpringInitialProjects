package com.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.product.OrderDetails;
import com.product.ProductDetails;

public class SpringApllication {

	public static void main(String[] args) {
//ioc container
		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/product/cfg/applicationContext.xml");
                                   ProductDetails p= (ProductDetails) cxt.getBean("prod1");//to getting data from id
                                   System.out.println("Product One Info");
System.out.println(p.getProductName());
System.out.println(p.getPrice());
System.out.println(p.getProductId());
ProductDetails p1= (ProductDetails) cxt.getBean("prod2");//to getting data from id or object

System.out.println("Product 2 Info");
System.out.println(p1.getProductName());
System.out.println(p1.getPrice());
System.out.println(p1.getProductId());

System.out.println("Order Details Are Give Below");
OrderDetails s=(OrderDetails) cxt.getBean("order1");
System.out.println(s.getOrderId());
System.out.println(s.getOrderPrice());
//System.out.println(s.getOrderDelivered());
System.out.println(s.getItems());







	}

}
