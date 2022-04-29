package com.monocept.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.monocept.model.User;

public class UserRepository {

	public User authenticateUser(String username, String password) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4040/SwabhavTech", "root",
					"root");

			String userSelectQuery = "SELECT * from Users WHERE USERNAME = ? AND USERPASSWORD = ? ;";
			PreparedStatement statement = connection.prepareStatement(userSelectQuery);
			statement.setString(1, username);
			statement.setString(2, password);

			ResultSet rs = statement.executeQuery();
//			System.out.println(rs.getStatement());

			while (rs.next()) {
				return new User(rs.getInt("ID"), rs.getString("UNAME"), rs.getString("USERNAME"),
						rs.getString("USERPASSWORD"), rs.getString("EMAIL"), rs.getDouble("BALANCE"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
