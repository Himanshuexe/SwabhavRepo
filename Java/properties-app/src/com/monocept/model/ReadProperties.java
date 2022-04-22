package com.monocept.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("resources\\file.properties"));
			prop.list(System.out);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}