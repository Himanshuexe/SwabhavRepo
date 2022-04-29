package com.monocept.presentation;

import java.util.Scanner;

import com.monocept.model.User;
import com.monocept.dataaccess.UserRepository;

public class LoginConsole {

	public void showConsole() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User Id:");
		String userId = scan.nextLine();
		System.out.println("Enter Password:");
		String userPassword = scan.nextLine();
		User user = new UserRepository().authenticateUser(userId, userPassword);
		if (user != null)
			System.out.println("Logged in Succesfully\n");
		else
			System.out.println("Login failed\n");
		System.out.println("Details:\n" + user.toString());
	}

}
