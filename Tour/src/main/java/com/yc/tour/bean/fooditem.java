package com.yc.tour.bean;

/**
 * 店铺明细
 * @author Administrator
 *
 */
public class fooditem {
	
	private Integer ffid;
	private String ffname;
	private Double fprice;
	private String fdetails;
	private String fphoto;
	public Integer getFfid() {
		return ffid;
	}
	public void setFfid(Integer ffid) {
		this.ffid = ffid;
	}
	public String getFfname() {
		return ffname;
	}
	public void setFfname(String ffname) {
		this.ffname = ffname;
	}
	public Double getFprice() {
		return fprice;
	}
	public void setFprice(Double fprice) {
		this.fprice = fprice;
	}
	public String getFdetails() {
		return fdetails;
	}
	public void setFdetails(String fdetails) {
		this.fdetails = fdetails;
	}
	public String getFphoto() {
		return fphoto;
	}
	public void setFphoto(String fphoto) {
		this.fphoto = fphoto;
	}
	@Override
	public String toString() {
		return "fooditem [ffid=" + ffid + ", ffname=" + ffname + ", fprice=" + fprice + ", fdetails=" + fdetails
				+ ", fphoto=" + fphoto + "]";
	}
	

}
