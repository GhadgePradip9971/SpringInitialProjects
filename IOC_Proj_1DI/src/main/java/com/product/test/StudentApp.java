package com.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.Student;

public class StudentApp {
	
	public static void main(String args[]) {
		
		//create ioc container
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/product/cfg/studentContext.xml");
		        Student  s=      (Student) ctx.getBean("stu1");
		        System.out.println("Student info");
		        System.out.println(s.getName());
		        System.out.println(s.getCity());
		        System.out.println(s.getId());
	        System.out.println(s.getSchoolName());
	        System.out.println(s.getStudentdata());

		        
		        
		
		
	}

}
