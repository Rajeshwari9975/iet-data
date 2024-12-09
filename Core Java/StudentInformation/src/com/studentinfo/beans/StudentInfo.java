package com.studentinfo.beans;

//Write a program to maintain student information. 
//For each student store studid, name, m1, 
//m2 and m3 (marks of 3 subjects ). 
//Accept information for 2 students and display it as follows
public class StudentInfo {
	
	
	private int studId;
	private String studeName;
	private int m1;
	private int m2;
	private int m3;
	
	public StudentInfo() {
		super();
	}

	public StudentInfo(int studId, String studeName, int m1, int m2, int m3) {
		super();
		this.studId = studId;
		this.studeName = studeName;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudeName() {
		return studeName;
	}

	public void setStudeName(String studeName) {
		this.studeName = studeName;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "StudentInfo [studId=" + studId + ", studeName=" + studeName + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3
				+ "]";
	}
	
	
	
}
