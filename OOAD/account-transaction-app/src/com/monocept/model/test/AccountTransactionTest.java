package com.monocept.model.test;

import com.monocept.model.*;

public class AccountTransactionTest {
	public static void main(String[] args) {
	
	Account acc=new Account(101, "Himanshu", 5000);
	acc.withdraw(500);
	acc.deposit(1000);
	System.out.println(acc.getTransactions());
		
}
}
