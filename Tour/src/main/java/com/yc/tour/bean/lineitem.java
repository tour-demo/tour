package com.yc.tour.bean;

/**
 * 路线
 * @author Administrator
 *
 */
public class lineitem {
	
	private Integer lid;
	private String line;   //路线
	private Double time;  //花费时间
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public Double getTime() {
		return time;
	}
	public void setTime(Double time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "lineitem [lid=" + lid + ", line=" + line + ", time=" + time + "]";
	}
	
}
