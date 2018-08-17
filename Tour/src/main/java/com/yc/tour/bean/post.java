package com.yc.tour.bean;

import java.sql.Date;

/**
 * 帖子
 * @author Administrator
 *
 */
public class post {

	private Integer pid;
	private String pcontent;  //内容
	private String ptitle;    //题目
	private Date ptime;      //发布时间
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public Date getPtime() {
		return ptime;
	}
	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}
	@Override
	public String toString() {
		return "post [pid=" + pid + ", pcontent=" + pcontent + ", ptitle=" + ptitle + ", ptime=" + ptime + "]";
	}
	
}
