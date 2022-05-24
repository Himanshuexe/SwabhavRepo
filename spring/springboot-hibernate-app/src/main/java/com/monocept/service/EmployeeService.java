package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Employee;
import com.monocept.model.Student;
import com.monocept.repository.EmployeeRepository;

@Service("employeeSvc")
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> getAll(){
		return repo.get();
	}
	
	
	public void addEmployee(Employee emp, String deptNo) {
		repo.addEmployee(emp, deptNo);
	}

	public void deleteEmployee(int id) {
		repo.deleteEmployee(id);
	}
	
	public void editEmployee(Employee employee) {
		repo.editEmployee(employee);
	}
}
