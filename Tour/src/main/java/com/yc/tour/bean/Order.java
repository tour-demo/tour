package com.yc.tour.bean;

import java.sql.Date;

/**
 * 订单
 * @author Administrator
 *
 */
public class Order {
	
	private Integer oid;
	private Date otime;   //下单时间
	private String status;//状态  0未下单  1退单
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Date getOtime() {
		return otime;
	}
	public void setOtime(Date otime) {
		this.otime = otime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", otime=" + otime + ", status=" + status + "]";
	}
	
	
}
