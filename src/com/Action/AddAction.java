package com.Action;

import com.DAO.StudentDaoImpl;
import com.po.Student;

public class AddAction {
	private String id;
	private String banji;
	private String username;
	private String name;
	private String sex;
	private String qq;
	private String password;
	Student s=null;
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
	public String execute() throws Exception {
		s=new Student(id,banji,username,name,sex,qq,password);
		StudentDaoImpl stu=new StudentDaoImpl();
		stu.setDao(new StudentDaoImpl());
		stu.add(s);
		return "success";
	}
}
