package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.po.Student;

public class StudentDaoImpl implements StudentDao {
	private StudentDao dao;

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	JdbcConnection jc = new JdbcConnection();

	public void add(Student s) throws Exception {
		String sql = "insert into sheet1(–Ú∫≈,∞‡º∂,—ß∫≈,–’√˚,–‘±,QQ∫≈,√‹¬Î) values(?,?,?,?,?,?,?)";
		Connection conn = jc.getConnection();
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, s.getId());
		ptmt.setString(2, s.getBanji());
		ptmt.setString(3, s.getUsername());
		ptmt.setString(4, s.getName());
		ptmt.setString(5, s.getSex());
		ptmt.setString(6, s.getQq());
		ptmt.setString(7, s.getPassword());
		ptmt.execute();
		ptmt.close();
		conn.close();
	};

	public void delete(Student s) throws Exception {
		String sql = "delete from sheet1 where –Ú∫≈=?";
		Connection conn = jc.getConnection();
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, s.getId());
		ptmt.execute();
		ptmt.close();
		conn.close();
	};

	public void update(Student s) throws Exception {
		String sql = "update sheet1 set √‹¬Î=? where –Ú∫≈=?";
		Connection conn = jc.getConnection();
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, s.getPassword());
		ptmt.setString(2, s.getId());
		ptmt.execute();
		ptmt.close();
		conn.close();
	};

	public List selectAll() throws Exception {
		String sql = "select * from sheet1";
		List<Student> list = new ArrayList();
		Connection conn = jc.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			list.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7)));
		}
		return list;
	};

	public List selectByname(String name) throws Exception {
		String sql = "select * from sheet1 where –’√˚=?";
		List<Student> list = new ArrayList();
		Connection conn = jc.getConnection();
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, name);
		ResultSet rs = ptmt.executeQuery();
		while (rs.next()) {
			list.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7)));
		}
		return list;
	};

	// public boolean login (String username,String password) throws Exception {
	// String sql="select –Ú∫≈ from sheet1 where —ß∫≈=? and √‹¬Î=?";
	// Connection conn=jc.getConnection();
	// PreparedStatement ptmt=conn.prepareStatement(sql);
	// ptmt.setString(1, username);
	// ptmt.setString(2, password);
	// ResultSet rs=ptmt.executeQuery();
	// if(!rs.next()) {
	// return false;
	// }
	// else {
	// return true;
	// }
	// }
	public boolean login(String custname, String pwd) throws Exception {
		Student cust = selectByNamePwd(custname, pwd);
		if (cust != null) {
			return true;
		} else {
			return false;
		}
	}

	public Student selectByNamePwd(String custname, String pwd) throws Exception {
		// TODO Auto-generated method stub
		Student cust = null;
		Connection conn = jc.getConnection();
		String sql = "select * from sheet1 where —ß∫≈=? and √‹¬Î=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, custname);
		pstmt.setString(2, pwd);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			cust = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7));
		}

		return cust;
	}

}
