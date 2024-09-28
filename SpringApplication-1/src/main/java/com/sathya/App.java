package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig.xml");
		Studentbean std = (Studentbean) ctx.getBean("id1");
		System.out.println(std);
		std.printStudent();

	}
}
