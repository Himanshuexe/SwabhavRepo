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
	public void showHierarchy(int level) {

		for (int i = 0; i < level; i++)
			System.out.print("--| ");
		System.out.println("File name: " + getName() + " File size: " + getSize() + ", level " + level);

	}
}
