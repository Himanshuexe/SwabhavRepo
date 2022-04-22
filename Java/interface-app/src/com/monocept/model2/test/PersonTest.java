package com.monocept.model2.test;

import com.monocept.model2.*;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Student(01, "A1", "12-03-1998", "CSE");
		Person p1 = new Professor(001, "B23", "31-02-1986", 30000);
		System.out.print(p1.details());
		System.out.println(p.details());
	}
}
