//configuration class
package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")//alternate <context:component scan>

public class Appconfig {
	
	@Bean(name="ldt")
	public LocalDateTime createLocalDateTime() {
		System.out.println("Appconfig.createLocalDateTime()(@BeanMethod)");	
		LocalDateTime ldt=LocalDateTime.now();
		return ldt;
	}
	
	

}
