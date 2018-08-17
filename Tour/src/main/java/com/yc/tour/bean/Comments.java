package com.yc.tour.bean;

import java.sql.Date;

/**
 * 景点留言
 * @author Administrator
 *
 */
public class Comments {
	
	private Integer cid;
	private String ccontent;  //内容
	private Date ctime;      //发布时间
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	@Override
	public String toString() {
		return "Comments [cid=" + cid + ", ccontent=" + ccontent + ", ctime=" + ctime + "]";
	}

}
