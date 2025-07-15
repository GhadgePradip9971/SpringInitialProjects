package com.sathyaautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// Load the Spring context from the XML configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");

		// Retrieve the Employeebean from the Spring context
		Employeebean employee = (Employeebean) context.getBean("id2");

		// Invoke the method to print employee details
		employee.printEmployee();
	}
}
