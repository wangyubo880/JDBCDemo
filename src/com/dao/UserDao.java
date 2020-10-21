package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.User;
import com.db.DBConnection;

public class UserDao {
	public User login(String username,String password) {
		User user = null;
		Connection connection = DBConnection.getConnection();
		PreparedStatement ps =null;
		ResultSet rs=null;
		try {
			 ps = connection.prepareStatement("select * from user where username=? and password=?");
			 ps.setString(1, username);
			 ps.setString(2,password);
			 rs = ps.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(username);
				user.setPassword(password);
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
		return user;
	}
	public boolean register(String username,String password) {

		Connection connection = DBConnection.getConnection();
		PreparedStatement ps =null;
		try {
			 ps = connection.prepareStatement("INSERT INTO user(username,password) VALUE(?,?);");
			 ps.setString(1, username);
			 ps.setString(2,password);
			 ps.execute();
			 return true;
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
