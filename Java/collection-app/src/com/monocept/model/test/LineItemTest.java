package com.monocept.model.test;

import java.util.ArrayList;
import com.moncept.model.*;

public class LineItemTest {
	public static void main(String[] args) {
		ArrayList<LineItem> list = new ArrayList<LineItem>();
		list.add(new LineItem(101, "Cinthol", 2, 45));
		list.add(new LineItem(201, "Deo", 3, 110));
		//list.add("Monocept");
		for (Object obj : list) {
			System.out.println(obj.toString());
		}
	}
}
