package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empmain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("empconfig.xml");
		Employeebean emp = (Employeebean) ctx.getBean("id1");
		System.out.println(emp);
		emp.printempid();
	}

}
