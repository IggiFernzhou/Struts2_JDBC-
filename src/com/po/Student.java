package com.po;

public class Student {
	private String id;
	private String banji;
	private String username;
	private String name;
	private String sex;
	private String qq;
	private String password;
	public Student() {
		
	}
	public Student(String id, String banji, String username, String name, String sex, String qq, String password) {
		super();
		this.id = id;
		this.banji = banji;
		this.username = username;
		this.name = name;
		this.sex = sex;
		this.qq = qq;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBanji() {
		return banji;
	}
	public void setBanji(String banji) {
		this.banji = banji;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [序号=" + id + ", 班级banji=" + banji + ", 学号=" + username + ", 姓名=" + name + ", 性别=" + sex
				+ ", QQ号=" + qq + ", 密码=" + password + "]";
	}
	
}
