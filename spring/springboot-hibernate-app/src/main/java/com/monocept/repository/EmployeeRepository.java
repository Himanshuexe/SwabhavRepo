package com.monocept.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Department;
import com.monocept.model.Employee;

@Repository
public class EmployeeRepository {
	@PersistenceContext
	private EntityManager em;

	public List<Employee> get() {
		return em.createQuery("From Employee").getResultList();
	}

	@Transactional
	public void addEmployee(Employee emp, String deptNo) {
		int deptNum = Integer.parseInt(deptNo);
		Department dept = em.find(Department.class, deptNum);
		emp.setDept(dept);
		dept.addEmployee(emp);
		em.merge(dept);
	}

	@Transactional
	public void deleteEmployee(int id) {
		Employee employee = (Employee) em.createQuery("from Employee where emp_no = " + id + " ").getSingleResult();
		em.remove(employee);
	}

	@Transactional
	public void editEmployee(Employee newEmployee) {
		Employee employee = (Employee) em.createQuery("from Employee where emp_no = " + newEmployee.getEmpNo() + " ")
				.getSingleResult();
		employee.setName(newEmployee.getName());
		employee.setDept(newEmployee.getDept());
		em.merge(employee);

	}
}
