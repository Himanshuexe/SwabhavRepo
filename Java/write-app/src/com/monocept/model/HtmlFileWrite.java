package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlFileWrite {
	public static void main(String[] args) throws IOException {
		String name="Himanshu";
		File file= new File("data\\Himanshu.html");
		FileWriter f=new FileWriter(file);
		f.write("<html>\r\n"+"<head></head>\r\n"+"<body>\r\n"+name+"</body>\r\n"+"</html>");
		f.close();
	}
}
