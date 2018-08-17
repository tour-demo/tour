package com.yc.tour.bean;

import java.sql.Date;
 /**
  * 帖子回复
  * @author Administrator
  *
  */
public class Reply {
	
	private Integer rid;
	private String rcontent;
	private Date rtime;
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public Date getRtime() {
		return rtime;
	}
	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}
	@Override
	public String toString() {
		return "Reply [rid=" + rid + ", rcontent=" + rcontent + ", rtime=" + rtime + "]";
	}
	
}
