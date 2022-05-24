package com.monocept.model.test;

import java.util.HashSet;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Department;
import com.monocept.model.Employee;

public class DepartmentTest {
	public static void main(String[] args) {
		Department dept10 = new Department(10, "Sales");

		Employee emp1 = new Employee(101, "Vineet");
		emp1.setDept(dept10);
		Employee emp2 = new Employee(102, "Abhishek");
		emp2.setDept(dept10);
		Employee emp3 = new Employee(103, "Himanshu");
		emp3.setDept(dept10);

		Set<Employee> employees = new HashSet<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		dept10.setEmployees(employees);

		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		System.out.println(session.getClass());

		Transaction transaction = session.beginTransaction();
		System.out.println(transaction.getClass());

		try {
//			session.save(dept10);
			displayDetails(session);
//			transaction.commit();
		} catch (Exception e) {
//			transaction.rollback();
		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
		System.out.println("End on main");
	}

	public static void displayDetails(Session session) {
		List<Department> departments = session.createQuery("from Department").list();
		
		for (Department department : departments) {
			System.out.println("Department: \nId: " + department.getDeptNo() + ", Name: " + department.getName());
			for (Employee employee : department.getEmployees()) {
				System.out.println("Employee Name: " + employee.getName() + ", Employee Id: " + employee.getEmpNo()
						+ ", Department: " + employee.getDept().getDeptNo());
			}
		}
	}

}
