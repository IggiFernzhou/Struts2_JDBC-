package com.Action;

import java.util.List;

import com.DAO.StudentDaoImpl;
import com.po.Student;
public class DisplayAction {
	private List<Student> list;//声明了属性list
    //并提供了getlist（）的方法
	public List<Student> getList() {
		return list;
	}
	public String execute() throws Exception{
		StudentDaoImpl ss=new StudentDaoImpl();
		ss.setDao(new StudentDaoImpl());
		list=ss.selectAll();
		return "success";
	}
}
