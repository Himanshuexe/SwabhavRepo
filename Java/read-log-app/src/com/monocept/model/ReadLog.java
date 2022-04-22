package com.monocept.model;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadLog {
	public static void main(String[] args) throws IOException {
		try {
			File f = new File("resources\\db_app.log");
			BufferedReader br = new BufferedReader(new FileReader(f));
			List<String> list = new ArrayList<>();
			String line = br.readLine();
			while (line != null) {
				list.add(line);
				line = br.readLine();
			}
			List<String> result = new ArrayList<>();
			String s = args[0];
			for (String st : list) {
				if (st.contains(s)) {
					result.add(st);
				}
				if (result.isEmpty()) {
					System.out.println("Enter a valid keyword.");
				}
				for (String str : result) {
					System.out.println(result);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
