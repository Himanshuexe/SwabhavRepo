package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TxnTest {
	public static void main(String[] args) throws Exception {

		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/monocept", "root", "root");
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();
			getTables(statement);

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Merchant id: ");
			String merchantId = scan.nextLine();
			System.out.println("Enter Customer id: ");
			String customerId = scan.nextLine();
			System.out.println("Enter Purchase amount: ");
			int amount = scan.nextInt();

			String merchantUpdateQuery = "UPDATE Merchant \nSET balance=balance+" + amount + "\nWhere id=\""
					+ merchantId + "\";";
			String customerUpdateQuery = "UPDATE Customer \nSET balance=balance-" + amount + "\nWhere id=\""
					+ customerId + "\";";

			try {
				int numberOfMerchantRowsAffected = statement.executeUpdate(merchantUpdateQuery);
				int numberOfCustomerRowsAffected = statement.executeUpdate(customerUpdateQuery);

				if (numberOfCustomerRowsAffected == 1 && numberOfMerchantRowsAffected == 1) {
					connection.commit();
					System.out.println("\nPurchase Succesful\n");
				} else {
					connection.rollback();
					System.out.println("\nPurchase Unsuccesful\n");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			getTables(statement);

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	public static void getTables(Statement stmt) throws SQLException {
		System.out.println("Merchant Table");
		ResultSet rs;

		rs = stmt.executeQuery("SELECT * FROM Merchant");
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
}
