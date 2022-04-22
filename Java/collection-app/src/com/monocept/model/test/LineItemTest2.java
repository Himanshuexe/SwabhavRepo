package com.monocept.model.test;

import java.util.HashSet;

import com.moncept.model.*;

public class LineItemTest2 {
	public static void main(String[] args) {
		HashSet<LineItem> set = new HashSet<LineItem>();
		set.add(new LineItem(1, "Maggi", 5, 75));
		set.add(new LineItem(2, "Marie", 2, 20));
		set.add(new LineItem(1, "Maggi", 3, 75));
		set.add(new LineItem(2, "Marie", 7, 20));

		for (LineItem l : set) {
			System.out.println(l.toString());
		}
	}
}
