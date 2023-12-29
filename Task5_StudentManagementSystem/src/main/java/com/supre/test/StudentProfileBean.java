package com.supre.test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentProfileBean implements Serializable {
	private String stuId,stuName,stuBranch,stuMid;
	private long stuRno,stuPhno;
	private String stuCity;
	private int stuPno;
	private int cJava,aJava,webTech,javaLab,apti,totmarks;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuBranch() {
		return stuBranch;
	}
	public void setStuBranch(String stuBranch) {
		this.stuBranch = stuBranch;
	}
	public String getStuMid() {
		return stuMid;
	}
	public void setStuMid(String stuMid) {
		this.stuMid = stuMid;
	}
	public long getStuRno() {
		return stuRno;
	}
	public void setStuRno(long stuRno) {
		this.stuRno = stuRno;
	}
	public long getStuPhno() {
		return stuPhno;
	}
	public void setStuPhno(long stuPhno) {
		this.stuPhno = stuPhno;
	}
	public String getStuCity() {
		return stuCity;
	}
	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}
	public int getStuPno() {
		return stuPno;
	}
	public void setStuPno(int stuPno) {
		this.stuPno = stuPno;
	}
	public int getcJava() {
		return cJava;
	}
	public void setcJava(int cJava) {
		this.cJava = cJava;
	}
	public int getaJava() {
		return aJava;
	}
	public void setaJava(int aJava) {
		this.aJava = aJava;
	}
	public int getWebTech() {
		return webTech;
	}
	public void setWebTech(int webTech) {
		this.webTech = webTech;
	}
	public int getJavaLab() {
		return javaLab;
	}
	public void setJavaLab(int javaLab) {
		this.javaLab = javaLab;
	}
	public int getApti() {
		return apti;
	}
	public void setApti(int apti) {
		this.apti = apti;
	}
	public int getTotmarks() {
		return totmarks;
	}
	public void setTotmarks(int totmarks) {
		this.totmarks = totmarks;
	}
	
	
}
