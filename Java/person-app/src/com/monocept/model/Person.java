package com.monocept.model;

public class Person {
	private String name;
	private int age;
	private float height;
	private static float defaultHeight = 6.0f;
	private float weight;
	private static float defaultWeight = 60;
	private GenderOptions gender;
	private static GenderOptions defaultGender = GenderOptions.MALE;

	public Person(String name, int age) {
		this(name, age, defaultHeight, defaultWeight, defaultGender);
	}

	public Person(String name, int age, float height, float weight, GenderOptions gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return this.age;
	}

	public float getHeight() {
		return this.height;
	}

	public float getWeight() {
		return this.weight;
	}

	public GenderOptions getGender() {
		return this.gender;
	}

	public void eat() {
		this.weight = (float) (weight + (weight * 0.1)); // 10% increase in weight
	}

	public void workout() {
		this.height = (float) (height + (height * 0.02)); // 2% increase in height
		this.weight = (float) (weight - (weight * 0.05)); // 5% decrease in weight
	}

	public String bmiDetails() {
		return bmiDetails();
	}
}
