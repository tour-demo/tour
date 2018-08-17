package com.yc.tour.bean;

/**
 * 饭店
 * @author Administrator
 *
 */
public class Food {

	private Integer fid;
	private String fname;
	private String faddress;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFaddress() {
		return faddress;
	}
	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", fname=" + fname + ", faddress=" + faddress + "]";
	}
	
}
