package com.supre.test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StuMarksBean implements Serializable
{
	private String stuId;
	private int cJava,aJava,webTech,javaLab,apti;
	
	public StuMarksBean() {
		super();
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
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
	
}
