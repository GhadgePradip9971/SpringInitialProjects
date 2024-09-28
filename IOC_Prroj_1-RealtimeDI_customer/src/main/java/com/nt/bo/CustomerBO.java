package com.nt.bo;

public class CustomerBO {
	//private Integer custId;  no needd to take beauce it will come automaticcally
	private String custName;
	private String custAddrs;
	private Float pamt;
	private Float rate;
	private Float time;
	private Float intrestAmount;
	
	//setters and getters method
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddrs() {
		return custAddrs;
	}
	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	public Float getIntrestAmount() {
		return intrestAmount;
	}
	public void setIntrestAmount(Float intrestAmount) {
		this.intrestAmount = intrestAmount;
	}
	//to string 
	@Override
	public String toString() {
		return "CustomerBO [custName=" + custName + ", custAddrs=" + custAddrs + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + ", intrestAmount=" + intrestAmount + "]";
	}
	
	

}
