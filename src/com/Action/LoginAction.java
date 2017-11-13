package com.Action;

import com.DAO.StudentDaoImpl;

public class LoginAction {
	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception {
		StudentDaoImpl dao=new StudentDaoImpl();
		dao.setDao(new StudentDaoImpl());
		boolean flag=dao.login(user, password);
		if(flag) {
			return "success";
		}
		else {
			return "fail";
		}
	}
}