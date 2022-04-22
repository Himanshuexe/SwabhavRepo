package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.monocept.model.Account;

public class AccountDeserialize {
	public static void main(String[] args) {
		String fileName = "resources\\account.bin";
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
			Account acc = (Account) is.readObject();
			Account[] accounts = (Account[]) is.readObject();
			System.out.println("Read-> ");
			printDetails(acc);
			for (Account a : accounts) {
				printDetails(a);
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void printDetails(Account acc) {
		System.out.println(
				"Account no.: " + acc.getAccNo() + ", Name: " + acc.getName() + ", Balance: " + acc.getBalance());
	}
}
