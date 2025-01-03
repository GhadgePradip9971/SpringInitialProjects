package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constrictor ");
	}
	
	
	
	public String generate(String user) {
		int hour=date.getHour();
		
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "GoodAfterrnoon::"+user;
		else if(hour<20)
			return "GoodEvening"+user;
		else
			return "GoodNight"+user;
		
	}
	

}
