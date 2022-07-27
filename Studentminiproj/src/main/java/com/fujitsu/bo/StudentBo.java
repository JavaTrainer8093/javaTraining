package com.fujitsu.bo;


public class StudentBo {

	private String sname;
	private String addd;
	private Integer total;
	private Integer avg;
	private String Result;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddd() {
		return addd;
	}
	public void setAddd(String addd) {
		this.addd = addd;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getAvg() {
		return avg;
	}
	public void setAvg(Integer avg) {
		this.avg = avg;
	}
	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}
	@Override
	public String toString() {
		return "StudentBo [sname=" + sname + ", addd=" + addd + ", total=" + total + ", avg=" + avg + ", Result=" + Result
				+ "]";
	}
	
}
