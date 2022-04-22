package com.monocept.hierarchy;

public class File implements IStorageItem {
	private String name;
	private String size;

	public File(String name, String size) {
		super();
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	@Override
	public void showHierarchy() {
		System.out.println("File name: " + getName() + " File size: " + getSize());
	}
}
