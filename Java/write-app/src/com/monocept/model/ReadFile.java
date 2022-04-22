package com.monocept.model;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		File file = new File("data\\Java.txt");
		Scanner scan = new Scanner(file);
		{
			while (scan.hasNextLine()) {  
				String line = scan.nextLine();
				System.out.println(line);
			}
		}
	}

}