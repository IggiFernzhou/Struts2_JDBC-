package com.Action;

import com.DAO.StudentDaoImpl;
import com.po.Student;

public class DeleteAction {
	Student s=null;
	private String id;
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public String execute() throws Exception {
		s=new Student();
		s.setId(id);
		StudentDaoImpl stu=new StudentDaoImpl();
		stu.setDao(new StudentDaoImpl());
		stu.delete(s);
		return "success";
	}
}
