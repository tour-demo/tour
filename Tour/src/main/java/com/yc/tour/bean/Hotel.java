package com.yc.tour.bean;

/**
 * 酒店
 * @author Administrator
 *
 */
public class Hotel {
	
	private Integer hid;
	private String hname;
	private String haddress;
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHaddress() {
		return haddress;
	}
	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}
	@Override
	public String toString() {
		return "Hotel [hid=" + hid + ", hname=" + hname + ", haddress=" + haddress + ", getHid()=" + getHid()
				+ ", getHname()=" + getHname() + ", getHaddress()=" + getHaddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
