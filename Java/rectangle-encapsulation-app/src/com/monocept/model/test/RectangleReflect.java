package com.monocept.model.test;

import java.lang.reflect.Method;
import com.monocept.model.Rectangle;

public class RectangleReflect {
	public static void main(String[] args) {
		try {
			Class<Rectangle> c = Rectangle.class;
			Method[] methods = c.getDeclaredMethods();
			int count = 0;
			for (Method m : methods) {
				String mname = m.getName();
				for (Method mm : methods) {
					if (mname.contentEquals(mm.getName())) {
						System.out.println("Method name: " + mname);
						count++;
					}
				}
			}
			System.out.println("Method count: " + count);
			count = 0;
			System.out.println("\nGetters: ");

			for (Method n : methods) {
				if (n.getName().startsWith("get")) {
					count++;
					System.out.println(n.getName());
				}
			}
			System.out.println("Number of getters:" + count);
			count = 0;
			System.out.println("\nSetters: ");
			for (Method n : methods) {
				if (n.getName().startsWith("set")) {
					System.out.println(n.getName());
					count++;
				}
			}
			System.out.println("Number of setters: " + count);
			count = 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
