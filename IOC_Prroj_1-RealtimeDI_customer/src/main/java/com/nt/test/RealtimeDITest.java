package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealtimeDITest {
    public static void main(String[] args) {
        // Read Input from the end user as String values
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String name = sc.next();
        System.out.println("Enter the customer address:");
        String addrs = sc.next();
        System.out.println("Enter customer Principal amount:");
        String pamt = sc.next();
        System.out.println("Enter customer Rate of Interest:");
        String rate = sc.next();
        System.out.println("Enter customer time of Interest:");
        String time = sc.next();
        
        // Create customer VO class object
        CustomerVO vo = new CustomerVO();
        vo.setCustName(name);
        vo.setCustAddrs(addrs);
        vo.setPamt(pamt);
        vo.setRate(rate);
        vo.setTime(time);

        // Create IOC container
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

        // Get controller class obj
        MainController controller = factory.getBean("controller", MainController.class);
        
        // Invoke the method
        try {
            String result = controller.processCustomer(vo); // Corrected line
            System.out.println(result); // Changed to print the result correctly
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Internal Problem - try Again");
        } finally {
            sc.close(); // Close the scanner to avoid resource leaks
        }
    }
}
