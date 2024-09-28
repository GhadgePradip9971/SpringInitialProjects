package com.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class app {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Empbean emp = (Empbean) ctx.getBean("id1");
		System.out.println(emp);
		emp.printemp();
	}
}
