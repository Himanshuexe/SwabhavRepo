	package com.monocept.hierarchy.test;

import com.monocept.hierarchy.File;
import com.monocept.hierarchy.Folder;

public class Test1 {
	public static void main(String[] args) {
		Folder rootFolder = new Folder("Movies");
		Folder subFolder1 = new Folder("Horror");
		Folder subFolder2 = new Folder("Comedy");
		File file1 = new File("abc.avi", "700mb");
		File file2 = new File("def.avi", "700mb");
		File file3 = new File("ghi.avi", "500mb");

		subFolder1.addChild(file1);
		subFolder1.addChild(file2);
		subFolder2.addChild(file3);
		rootFolder.addChild(subFolder1);
		rootFolder.addChild(subFolder2);

		rootFolder.showHierarchy(0);
		
		
	}
}
