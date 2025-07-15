package com.xmltag;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.test.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// BeanFactory Object is called as IOC Container.
		
		  BeanFactory factory = new
		  FileSystemXmlApplicationContext("applicationContext.xml");
		   
    	
		
		  Student s = (Student) factory.getBean("stu"); 
		  Student s1=(Student) factory.getBean("id");
		 
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); Student s=
		 * (Student) context.getBean("id");
		 */
    	 System.out.println(s);
    	 System.out.println(s1);
    }
}
