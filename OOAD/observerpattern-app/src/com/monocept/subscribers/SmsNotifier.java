package com.monocept.subscribers;

import com.monocept.publisher.Account;
import com.monocept.publisher.INotifier;

public class SmsNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println("SMS Recieved: \nAccount Number: " + account.getAccNo() + " having Account Holder Name: "
				+ account.getName() + ", transacted, ending balance: " + account.getBalance());
	}

}
