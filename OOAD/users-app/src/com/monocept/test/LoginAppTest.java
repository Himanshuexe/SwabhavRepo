package com.monocept.test;

import java.util.Scanner;

import com.monocept.presentation.LoginConsole;
import com.monocept.presentation.LoginUI;

public class LoginAppTest {
	public static void main(String[] args) {
		System.out.println("SELECT MODE OF INTERACTION USING THE NUMBERS BELOW:");
		System.out.println("1 Login using UI");
		System.out.println("2 Login using Console");
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int loginChoice = sc.nextInt();
		if (loginChoice == 1) {
			new LoginUI();
			System.out.println("You chose UI Login\n");
		}
		if (loginChoice == 2) {
			new LoginConsole().showConsole();
			System.out.println("You chose Console Login\n");
		} else {
			System.out.println("Invalid Value Entered");
		}
	}
}
