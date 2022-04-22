package com.monocept.model.test;

import com.monocept.model.GenderOptions;
import com.monocept.model.Person;
import com.monocept.model.test.BmiCalculator;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("Manoj", 20);
		Person p2 = new Person("Priya", 25, 5, 45, GenderOptions.FEMALE);
		Person p3 = new Person("Himanshu", 22, 5.11f, 75, GenderOptions.MALE);
		printDetails(p1);
		printDetails(p2);
		printDetails(p3);
		p1.workout();
		p2.eat();
		p3.eat();
		printDetails(p1);
		printDetails(p2);
		printDetails(p3);
		BmiCalculator c=new BmiCalculator(p1);
		p1.bmiDetails();
	}

	public static void printDetails(Person p) {
		System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Height: " + p.getHeight() + ", Weight: "
				+ p.getWeight() + ", Gender: " + p.getGender());
	}
}
