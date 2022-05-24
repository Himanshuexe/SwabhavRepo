package com.monocept.hierarchy.test;

import java.io.IOException;

import com.monocept.hierarchy.FolderHeirarchyBuilder;

public class Test2 {
	public static void main(String[] args) {
		try {
			FolderHeirarchyBuilder builder = new FolderHeirarchyBuilder("resources/folder_hierarchy.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
