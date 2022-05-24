package com.monocept.hierarchy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FolderHeirarchyBuilder {

	public FolderHeirarchyBuilder(String filePath) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		Folder[] folders = new Folder[10];
		File[] files= new com.monocept.hierarchy.File[11];
		
		try {
			StringBuilder sb = new StringBuilder();
			br.readLine();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				if (line.contains("F  ")) {
					String[] nextLine = line.split(" ");
					String name = nextLine[0];
				
				}
			}
			String everything = sb.toString();
			System.out.println(everything);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
	}
}
