package com.monocept.hierarchy;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem {
	private String name;
	private List<IStorageItem> children = new ArrayList<IStorageItem>();
	private int level = 0;

	public Folder(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void addChild(IStorageItem item) {
		children.add(item);
		if (item.getClass().getSimpleName().contentEquals("Folder")) {
		}
	}

	@Override
	public void showHierarchy(int level) {

		for (int i = 0; i < level; i++)
			System.out.print("--| ");
		System.out.println(name + " at Level " + level);

		for (IStorageItem item : children)
			item.showHierarchy(level + 1);
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
