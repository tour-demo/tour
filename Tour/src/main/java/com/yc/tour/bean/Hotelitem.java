package com.yc.tour.bean;

/**
 * 酒店明细
 * @author Administrator
 *
 */
public class Hotelitem {
	
	private Integer hhid;
	private String type;  //不同型号的房间
	private String hdetails;
	private String hphoto;
	private Double hprice;
	private Integer hcount;
	public Integer getHhid() {
		return hhid;
	}
	public void setHhid(Integer hhid) {
		this.hhid = hhid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHdetails() {
		return hdetails;
	}
	public void setHdetails(String hdetails) {
		this.hdetails = hdetails;
	}
	public String getHphoto() {
		return hphoto;
	}
	public void setHphoto(String hphoto) {
		this.hphoto = hphoto;
	}
	public Double getHprice() {
		return hprice;
	}
	public void setHprice(Double hprice) {
		this.hprice = hprice;
	}
	public Integer getHcount() {
		return hcount;
	}
	public void setHcount(Integer hcount) {
		this.hcount = hcount;
	}
	@Override
	public String toString() {
		return "Hotelitem [hhid=" + hhid + ", type=" + type + ", hdetails=" + hdetails + ", hphoto=" + hphoto
				+ ", hprice=" + hprice + ", hcount=" + hcount + "]";
	}
}
