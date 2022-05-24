package com.monocept.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.monocept.model.User;

public class UserRepository {

	public UserRepository() {
		System.out.println("User Repository created");
	}

	public Connection getConnection() {
		Connection con = null;
		String dbDriver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(dbDriver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:4040/jdbc_app", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public User getUser(int id, String password) {
		User user = null;
		Connection con = getConnection();
		try {
			String selectUser = "SELECT id, u_password, u_name, email, isActive FROM users WHERE id=? AND u_password=?";
			PreparedStatement statement = con.prepareStatement(selectUser);
			statement.setInt(1, id);
			statement.setString(2, password);

			ResultSet rs = statement.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
							+ rs.getString(4) + " " + rs.getBoolean(5));
					int uid = rs.getInt(1);
					String upassword = rs.getString(2);
					String name = rs.getString(3);
					String email = rs.getString(4);
					Boolean isActive = rs.getBoolean(5);
					user = new User(uid, upassword, name, email, isActive);
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

}
