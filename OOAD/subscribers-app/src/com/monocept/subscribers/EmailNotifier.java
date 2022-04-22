package com.monocept.subscribers;

import com.monocept.publisher.*;

public class EmailNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println("Email Recieved: \nAccount Number: " + account.getAccNo() + " having Account Holder Name: "
				+ account.getName() + ", transacted, ending balance: " + account.getBalance());
	}

}
