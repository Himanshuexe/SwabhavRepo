package com.monocept.model.test;

import com.monocept.model.Animal;
import com.monocept.model.Dog;
import com.monocept.model.Monkey;

public class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Monkey() };
		for (Animal a : animals) {
			a.eat();
			a.makeSound();
		}
	}
}
