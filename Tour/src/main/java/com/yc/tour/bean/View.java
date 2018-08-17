package com.yc.tour.bean;

/**
 * 景点
 * @author Administrator
 *
 */
public class View {
	
	private Integer vid;
	private String vname;
	private Double vprice;    //价格
	private String address;    //地址
	private String vdetails;  //详情
	private Double vscore;   //评分
	private String route;   //路线
	private Integer type;   //类型   0单个景点   1套餐
	private Integer vstatus;  //0未下架  1下架
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Double getVprice() {
		return vprice;
	}
	public void setVprice(Double vprice) {
		this.vprice = vprice;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVdetails() {
		return vdetails;
	}
	public void setVdetails(String vdetails) {
		this.vdetails = vdetails;
	}
	public Double getVscore() {
		return vscore;
	}
	public void setVscore(Double vscore) {
		this.vscore = vscore;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "View [vid=" + vid + ", vname=" + vname + ", vprice=" + vprice + ", address=" + address + ", vdetails="
				+ vdetails + ", vscore=" + vscore + ", route=" + route + ", type=" + type + "]";
	}
	
}
