package com.monocept.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NameAppend {
	public static void main(String[] args) throws IOException {
		File file = new File("data\\name.txt");
		FileWriter f = new FileWriter(file, true);
		//BufferedWriter b = new BufferedWriter(f);
		//PrintWriter p = new PrintWriter(b);
		f.write("Himanshu.");
	}
}
