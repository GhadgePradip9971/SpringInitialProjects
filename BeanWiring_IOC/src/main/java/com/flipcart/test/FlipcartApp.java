package com.flipcart.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flipcart.order.Order;
import com.flipcart.order.OrderManagement;
import com.flipcart.product.Product;

public class FlipcartApp {

	public static void main(String[] args) {

		
		//ioc container 
		//BeanWiring
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/flipcart/cfg/applicationContext.xml");
		OrderManagement m=(OrderManagement) cxt.getBean("om");
		
		Order order=m.getOrder();
		Product product=order.getProduct();
		
		System.out.println(order.getOrderId());
		System.out.println(order.getOrderValue());
		
		System.out.println(product.getProductId());
		System.out.println(product.getProductName());

		System.out.println(m.getNoOfOrder());
		System.out.println(m.getTotalAmount());
//or we can write also below type
		System.out.println(m.getOrder().getProduct().getProductName());
		System.out.println(m.getOrder().getOrderId());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * ApplicationContext ctx=new
		 * ClassPathXmlApplicationContext("com/flipcart/cfg/applicationContext.xml");
		 * Product p=(Product) ctx.getBean("product");
		 * System.out.println("*************Product infos*************");
		 * System.out.println(p.getProductId()); System.out.println(p.getProductName());
		 * System.out.println("*************Order infos*************"); Order r=(Order)
		 * ctx.getBean("order"); System.out.println(r.getOrderId());
		 * System.out.println(r.getOrderValue()); System.out.println(r.getProduct());
		 * 
		 * System.out.println("*************OrderManagement infos*************");
		 * OrderManagement m= (OrderManagement) ctx.getBean("om");
		 * System.out.println(m.getNoOfOrder()); System.out.println(m.getTotalAmount());
		 * System.out.println(m.getOrder());
		 * 
		 * 
		 */
	
	
	}

}
