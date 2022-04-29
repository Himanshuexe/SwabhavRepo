package com.monocept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/monocept", "root", "root");
			Statement statement = conn.createStatement();
			getTables(statement);
			purchaseItems(statement);
			getTables(statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void purchaseItems(Statement stmt) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Merchant id: ");
		String merchantId = scan.nextLine();
		System.out.println("Enter Customer id: ");
		String customerId = scan.nextLine();
		System.out.println("Enter Purchase amount: ");
		int amount = scan.nextInt();

		String merchantUpdateQuery = "UPDATE Merchant \nSET balance=balance+" + amount + "\nWhere id=\"" + merchantId
				+ "\";";
		String customerUpdateQuery = "UPDATE Customer \nSET balance=balance-" + amount + "\nWhere id=\"" + customerId
				+ "\";";

		try {
			stmt.executeUpdate(merchantUpdateQuery);
			stmt.executeUpdate(customerUpdateQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Purchase Succesful");
	}

	public static void getTables(Statement stmt) throws SQLException {
		System.out.println("Merchant Table");
		ResultSet rs = stmt.executeQuery("SELECT * FROM Merchant");
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
		System.out.println(
				"------------------------------------------------------------------------------------------------------\n");
		System.out.println("Customer Table");
		ResultSet rs1 = stmt.executeQuery("SELECT * FROM Customer");
		while (rs1.next()) {
			System.out.println(rs1.getString(1) + " " + rs1.getString(2) + " " + rs1.getInt(3));
		}
		System.out.println(
				"------------------------------------------------------------------------------------------------------\n");
	}

	public static void createTables() {
//		String createMerchantQuery = "CREATE TABLE Merchant " + "(id VARCHAR(3) not NULL, " + " name VARCHAR(20), "
//		+ " balance Decimal(8,2), " + " PRIMARY KEY ( id ))";
//String createCustomerQuery = "CREATE TABLE Customer " + "(id VARCHAR(3) not NULL, " + " name VARCHAR(20), "
//		+ " balance Decimal(8,2), " + " PRIMARY KEY ( id ))";
//stmt.executeUpdate(createCustomerQuery);
//System.out.println("Created table in given database...");

//String insertRecord = "INSERT INTO Merchant" + " VALUES " + " (?, ?, ?);";
//PreparedStatement preparedStatement = conn.prepareStatement(insertRecord);
//preparedStatement.setString(1, "M1");
//preparedStatement.setString(2, "Merchant1");
//preparedStatement.setInt(3, 100000);
//
//System.out.println(preparedStatement);
//preparedStatement.executeUpdate();
//System.out.println("Record inserted");
//
//preparedStatement.setString(1, "M2");
//preparedStatement.setString(2, "Merchant2");
//preparedStatement.setInt(3, 50000);
//
//System.out.println(preparedStatement);
//preparedStatement.executeUpdate();
//System.out.println("Record inserted");

//String insertRecord = "INSERT INTO Customer" + " VALUES " + " (?, ?, ?);";
//PreparedStatement preparedStatement = conn.prepareStatement(insertRecord);
//preparedStatement.setString(1, "C1");
//preparedStatement.setString(2, "Customer1");
//preparedStatement.setInt(3, 50000);
//
//System.out.println(preparedStatement);
//preparedStatement.executeUpdate();
//System.out.println("Record inserted");
//
//preparedStatement.setString(1, "C2");
//preparedStatement.setString(2, "Customer2");
//preparedStatement.setInt(3, 30000);
//
//System.out.println(preparedStatement);
//preparedStatement.executeUpdate();
//System.out.println("Record inserted");
	}

}
