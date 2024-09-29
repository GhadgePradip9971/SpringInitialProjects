package com.nt.controller;

import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController<ICustomerMgmtSrvicce> {
	private ICustomerMgmtService service;
	
	
	public MainController(ICustomerMgmtSrvicce service) {
		System.out.println("MainController:1-param constructor");
		
	}
	
	public String processCustomer(CustomerVO vo) {
	//convert vo class obj data to dto clas object data
		
		
		
		
	}

}
