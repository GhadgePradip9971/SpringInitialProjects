package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.Appconfig;

public class JavaConfigAppTest {
	public static void main(String args[]) {
		//create Ioc container
		AnnotationConfigApplicationContext ctx=new  AnnotationConfigApplicationContext(Appconfig.class);
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator.generate("raja"));
		ctx.close();
	}
	

}
