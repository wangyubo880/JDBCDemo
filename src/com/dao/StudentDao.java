package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Page;
import com.bean.Student;
import com.db.DBConnection;

public class StudentDao {
	public List<Student> select(){
		List<Student> lists=new ArrayList<Student>();
		Student student = null;
		Connection connection = DBConnection.getConnection();
		PreparedStatement ps =null;
		ResultSet rs=null;
		try {
			 ps = connection.prepareStatement("select * from student ");
			 rs = ps.executeQuery();
			while(rs.next()) {
				student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setBirthday(rs.getDate("birthday"));
				lists.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
	}
	public List<Student> selectByPage(Page page){
		List<Student> lists=new ArrayList<Student>();
		Student student = null;
		Connection connection = DBConnection.getConnection();
		PreparedStatement ps =null;
		ResultSet rs=null;
		try {
			 ps = connection.prepareStatement("select * from student limit ?,?");
			 ps.setInt(1, (page.getDpage()-1)*page.getPagecount());
			 ps.setInt(2, page.getPagecount());
			 rs = ps.executeQuery();
			while(rs.next()) {
				student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setBirthday(rs.getDate("birthday"));
				lists.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
	}
	public boolean deleteStudent(Integer id) {
		PreparedStatement ps = null;
	    ResultSet rs = null;
	    Connection connection = DBConnection.getConnection();
	    try {
			 ps = connection.prepareStatement("delete from student where id='"+id+"';");
			 int a=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
}
