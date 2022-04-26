package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.util.DnsSrv.SrvRecord;
import com.mysql.cj.xdevapi.PreparableStatement;

public class ConnectionTest {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/monocept", "root", "root");
//			System.out.println(con.getClass());
			System.out.println("Connected");
//			insertRecord(con, 102, "Rohan", "Developer");
//			insertRecord(con, 103, "Abhishek", "Developer");
//			insertRecord(con, 104, "Vishak", "Team Lead");
			getTable(con, "employees");
			deleteRecord(con, "employees", "empId", "102");
			getTable(con, "employees");
		} catch (SQLException e) {
			System.out.println("Something Went Wrong. " + e.getMessage());
			System.out.println(e.getErrorCode());
		} finally {
			if (!con.isClosed()) {
				con.close();
			}
		}
	}

	public static void createTable() {
		String sqlQuery = "CREATE TABLE employees(\r\n" + " empId INT,\r\n" + " empName VARCHAR(20),\r\n"
				+ " empJob VARCHAR(20),\r\n" + " PRIMARY KEY(empId)\r\n" + " );";
	}

	public static void insertRecord(Connection con, int empId, String empName, String empJob) throws SQLException {
		String INSERT_USERS_SQL = "INSERT INTO employees" + " VALUES " + " (?, ?, ?);";
		PreparedStatement preparedStatement = con.prepareStatement(INSERT_USERS_SQL);
		preparedStatement.setInt(1, empId);
		preparedStatement.setString(2, empName);
		preparedStatement.setString(3, empJob);

//		ResultSet rs = statement.executeQuery(sqlQuery);
		System.out.println(preparedStatement);
		preparedStatement.executeUpdate();
		System.out.println("Record inserted");
	}

	public static void getTable(Connection con, String tableName) throws SQLException {
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM " + tableName);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
	}

	public static void deleteRecord(Connection con, String tableName, String field, String value) throws SQLException {
		Statement statement = con.createStatement();
		int rs = statement.executeUpdate("DELETE FROM " + tableName + " WHERE " + field + "=\"" + value + "\";");
		System.out.println("record deleted");
	}
}
