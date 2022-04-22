package com.monocept.model.test;

import com.monocept.model.Person;

public class BmiCalculator {
	Person person;
	private float bmi = 0;

	public BmiCalculator(Person person) {
		this.person = person;
		this.bmi = bmiScore();
	}

	public float bmiScore() {
		float mheight = (float) (person.getHeight() * 0.3048); // converting height into meters
		bmi = (float) (person.getWeight() / (mheight * mheight));
		return bmi;
	}

	public String bmiCategory() {
		if (bmi < 18.5) {
			return "Underweight";
		}
		if (bmi < 25) {
			return "Healthy Weight";
		}
		if (bmi < 30) {
			return "Overweight";
		}
		return "Obesity";
	}

	public String bmiDetails() {
		String details = ("Name:" + person.getName() + "Height: " + person.getHeight() + "Weight: " + person.getWeight()
				+ "Bmi Score: " + bmiScore() + "Body Category: " + bmiCategory());
		return details;
	}
}
