package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	private ICustomerDAO dao;//has-A property
	public  CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustMgmtServiceImpl.0-param constructor");
		this.dao=dao;
	}

	public String calculateSimpleIntrest(CustomerDTO dto) throws Exception {
		// calculate simple intrest amount
		float intrAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		
		//create Bo class obj having persitable data
		
		CustomerBO bo=new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrestAmount(intrAmt);
		//use DAO
		int count =dao.insert(bo);
          
		//terniry operator  <condition >?<sucess><failure>
		return count==1?"Customer registered sucessfully-->SimpleIntrest amount::"+intrAmt:"Customer registration failed";
	}

}
