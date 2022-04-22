package com.monocept.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
	public static void main(String args[]) {
		Properties prop = new Properties();
		try {
			prop.setProperty("Name", "Himanshu");
			prop.setProperty("Account Number", "101");
			prop.setProperty("Balance", "5000");
			prop.store(new FileOutputStream("resources\\file.properties"), null);
			System.out.println("File Written");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}