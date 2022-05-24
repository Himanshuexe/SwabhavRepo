package com.monocept.model.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import com.monocept.model.Account;
import com.monocept.model.TranSaction;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Himanshu", 2000, "himanshu31");
		acc1.doTransaction(new TranSaction(500, "Deposit"));
		acc1.doTransaction(new TranSaction(1000, "Withdraw"));
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		System.out.println(session.getClass());

		Transaction transaction = (Transaction) session.beginTransaction();
		System.out.println(transaction.getClass());

		try {
			session.save(acc1);
			transaction.commit();
		} catch (Exception e) {
//			transaction.rollback();
		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
		System.out.println("End on main");
	}
}
