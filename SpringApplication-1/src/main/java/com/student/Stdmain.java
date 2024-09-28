package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stdmain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("result.xml");

		Studentbean std = (Studentbean) context.getBean("s1");
		System.out.println(std);
		std.printDetails();
	}

}
