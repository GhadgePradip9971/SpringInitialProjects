package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDAOimpl implements ICustomerDAO {
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER VALUES (CUSTID_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private DataSource ds;
	
	

	public CustomerDAOimpl(DataSource ds) {
	System.out.println("CustomerDAOimpl::1-param constructor");
		this.ds = ds;
	}



	@Override
	public int insert(CustomerBO bo) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			//get pooled jdbc con object
			con=ds.getConnection();
			//CREATE Prepared statement object having pre-compiled sql query 
			ps=con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY);
		ps.setString(1, bo.getCustName());	s
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
		finally {
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
		}
		//finally close
		
		
		
		return count;
	}

}
