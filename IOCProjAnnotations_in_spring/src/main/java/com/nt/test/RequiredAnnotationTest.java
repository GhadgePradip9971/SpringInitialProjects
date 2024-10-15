package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.beans.Robot;

public class RequiredAnnotationTest {
    public static void main(String[] args) {
        // create IOC container
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
        
        // get Bean
        Robot robot = ctx.getBean("robot", Robot.class);
        System.out.println(robot);

        // close the context
        ctx.close();
    }
}
