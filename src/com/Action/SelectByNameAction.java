package com.Action;

import java.util.List;

import com.DAO.StudentDaoImpl;
import com.po.Student;

public class SelectByNameAction {
	private List<Student> list;//声明了属性list
    //并提供了getlist（）的方法
	public List<Student> getList() {
		return list;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String execute() throws Exception {
		StudentDaoImpl stu=new StudentDaoImpl();
		stu.setDao(new StudentDaoImpl());
		list=stu.selectByname(name);
		return "success";
	}
}
