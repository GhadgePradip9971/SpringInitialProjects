package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
    private ICustomerMgmtService service;

    public MainController(ICustomerMgmtService service) {
        System.out.println("MainController: 1-param constructor");
        this.service = service; // Assign the service to the instance variable
    }

    public String processCustomer(CustomerVO vo) throws Exception {
        // Convert VO class object data to DTO class object data
        CustomerDTO dto = new CustomerDTO();
        dto.setCustName(vo.getCustName());
        dto.setCustAddrs(vo.getCustAddrs());
        dto.setPamt(Float.parseFloat(vo.getPamt()));
        dto.setTime(Float.parseFloat(vo.getTime()));
        dto.setRate(Float.parseFloat(vo.getRate()));

        // Use service to calculate simple interest
        String result = service.calculateSimpleIntrest(dto);
        return result;
    }
}
