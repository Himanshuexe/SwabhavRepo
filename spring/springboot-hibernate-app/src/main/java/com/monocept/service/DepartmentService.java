package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Department;
import com.monocept.repository.DepartmentRepository;

@Service("DepartmentSvc")
public class DepartmentService {
	@Autowired
	DepartmentRepository repo;
	
	public List<Department> getAll(){
		return repo.get();
	}
	
	public void addDepartment(Department dept) {
		repo.addDepartment(dept);
	}

	public void deleteDepartment(int id) {
		repo.deleteDepartment(id);
	}
	
	public void editDepartment(Department department) {
		repo.editDepartment(department);
	}
}
