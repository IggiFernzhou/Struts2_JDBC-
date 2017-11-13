package com.Action;

import com.DAO.StudentDaoImpl;
import com.po.Student;

public class UpdateAction {
	Student s=null;
	private String password;
	private String id;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String execute() throws Exception {
		s=new Student();
		s.setId(id);
		s.setPassword(password);
		StudentDaoImpl stu=new StudentDaoImpl();
		stu.setDao(new StudentDaoImpl());
		stu.update(s);
		return "success";
	}
}
