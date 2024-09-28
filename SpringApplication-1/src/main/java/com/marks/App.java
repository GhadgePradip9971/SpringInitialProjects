
package com.marks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("sconfig.xml");
		Sathyacollege sc = (Sathyacollege) ctx.getBean("id1");
		System.out.println(sc);
		sc.printStudentNames();
		sc.printRollNos();
		sc.printBranchdetails();
		sc.printBranchinfos();
	}

}
