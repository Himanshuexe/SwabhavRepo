package com.monocept.model.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.monocept.model.Account;

public class AccountSerialize {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Himanshu", 5000);

		printDetails(acc1);
		acc1.deposit(500);
		printDetails(acc1);
		acc1.withdraw(2000);
		printDetails(acc1);
		acc1.withdraw(3200);

		Account[] accounts = new Account[] { new Account(102, "Rohan", 5000), new Account(103, "Vineet", 1200),
				new Account(104, "Abhishek") };

		String fileName = "resources\\account.bin";
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
			os.writeObject(acc1);
			os.writeObject(accounts);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File Written.");
	}

	public static void printDetails(Account acc) {
		System.out.println(
				"Account no.: " + acc.getAccNo() + ", Name: " + acc.getName() + ", Balance: " + acc.getBalance());
	}
}
