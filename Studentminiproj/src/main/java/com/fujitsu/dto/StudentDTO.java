package com.fujitsu.dto;

public class StudentDTO {

	private String sname;
	private String sadd;
	private Integer math;
	private Integer science;
	private Integer english;
	
	
	
	
	public String getSname() {
		return sname;
	}




	public void setSname(String sname) {
		this.sname = sname;
	}




	public String getSadd() {
		return sadd;
	}




	public void setSadd(String sadd) {
		this.sadd = sadd;
	}




	public Integer getMath() {
		return math;
	}




	public void setMath(Integer math) {
		this.math = math;
	}




	public Integer getScience() {
		return science;
	}




	public void setScience(Integer science) {
		this.science = science;
	}




	public Integer getEnglish() {
		return english;
	}




	public void setEnglish(Integer english) {
		this.english = english;
	}




	@Override
	public String toString() {
		return "StudentDTO [sname=" + sname + ", sadd=" + sadd + ", math=" + math + ", science=" + science
				+ ", english=" + english + "]";
	}
	

}
