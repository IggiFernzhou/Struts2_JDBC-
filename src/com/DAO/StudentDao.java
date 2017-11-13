package com.DAO;

import java.util.List;

import com.po.Student;

public interface StudentDao {
	public void add(Student s) throws Exception;
	public void delete(Student s) throws Exception;
	public void update(Student s) throws Exception;
	public List selectAll() throws Exception;
	public List selectByname(String name) throws Exception;
	public boolean login (String username,String password) throws Exception;
	public Student selectByNamePwd(String custname, String pwd) throws Exception;
}
