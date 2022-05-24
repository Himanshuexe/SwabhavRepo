package com.monocept.model.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		System.out.println(session.getClass());

		Student vineet = new Student(101, "Vineet", 5.5f);
		Student nikhil = new Student(102, "Nikhil", 6.5f);
		Transaction transaction = session.beginTransaction();
		System.out.println(transaction.getClass());
		List<Student> students;

		try {
			// adding
//			session.save(vineet);
//			session.save(nikhil);

			// reading
			Query query = session.createQuery("from Student");
			students = query.list();
			for (Student student : students) {
				System.out.println(
						"Id: " + student.getId() + " ,Name: " + student.getName() + ", Cgpa: " + student.getCgpa());
			}
			// updating
//				Student student1 = (Student) session.get(Student.class, 2);
//				student1.setName("Rohan");
//				System.out.println("updated successfully");

//			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
		System.out.println("End on main");
	}
}
