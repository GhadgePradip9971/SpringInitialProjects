package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.AccountDetails;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
    			"com/test/cfg/applicationContext.xml");
    			AccountDetails details = (AccountDetails) context.getBean("accountDetails");
    			System.out.println(details.getName());
    			System.out.println(details.getBalance());
    			System.out.println(details.getMobiles());
    			System.out.println(details.getCustomerAddress().getFlatNo());
    			System.out.println(details.getCustomerAddress().getArea().getPincode());
    }
}
