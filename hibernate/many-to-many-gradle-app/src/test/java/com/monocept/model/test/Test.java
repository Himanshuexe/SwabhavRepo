package com.monocept.model.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Course;
import com.monocept.model.Student;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		System.out.println(session.getClass());

		Set<Course> courses = new HashSet<Course>();
		courses.add(new Course(1, "C programming"));
		courses.add(new Course(2, "Java Programming"));

		Student student1 = new Student(101, "Himanshu", courses);
		Student student2 = new Student(102, "Abhishek", courses);
		Student student3 = new Student(103, "Vineet", courses);

		Transaction txn = session.beginTransaction();
		try {
			session.save(student1);
			session.save(student2);
			session.save(student3);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
	}

}
