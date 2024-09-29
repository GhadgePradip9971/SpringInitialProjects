package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class CustomerMysqlDAOimpl implements ICustomerDAO {
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER(CUSTNAME,CUSTADDRS,PAMT,RATE,TIME,INTRAMOUNT) VALUES (?,?,?,?,?,?)";
	private DataSource ds;
	
	

	public CustomerMysqlDAOimpl(DataSource ds) {
	System.out.println("CustomerOracleDAOimpl::1-param constructor");
		this.ds = ds;
	}



	@Override
	public int insert(CustomerBO bo) throws Exception {
		// TODO Auto-generated method stub
		
		int count=0;
		
		try (
			Connection con=ds.getConnection();
			//CREATE Prepared statement object having pre-compiled sql query 
		PreparedStatement	ps=con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY)){//try with resource
		ps.setString(1, bo.getCustName());	
		ps.setString(2,bo.getCustAddrs());
		ps.setFloat(3,bo.getPamt());
		ps.setFloat(5,bo.getRate());
		ps.setFloat(4, bo.getTime());
		ps.setFloat(6, bo.getIntrestAmount());
		//execute the querry
		 count =ps.executeUpdate();
		 	
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		
		
		return count;
	}

}
