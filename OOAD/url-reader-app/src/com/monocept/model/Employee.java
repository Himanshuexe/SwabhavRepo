package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	private String id;
	private String empName;
	private String jobDepartment;
	private String managerId;
	private String dateOfJoining;
	private String salary;
	private String commision;
	private String deptNo;
	Set<Employee> employees = new HashSet<Employee>();

	public Employee(String id, String empName, String jobDepartment, String managerId, String dateOfJoining,
			String salary, String commision, String deptNo) {
		this.id = id;
		this.empName = empName;
		this.jobDepartment = jobDepartment;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commision = commision;
		this.deptNo = deptNo;
		employees.add(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}

	public String getJobDepartment() {
		return jobDepartment;
	}

	public String getManagerId() {
		return managerId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public String getSalary() {
		return salary;
	}

	public String getCommision() {
		return commision;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public String toString() {
		return "Id: " + getId() + " Name: " + getEmpName() + " Department: " + getJobDepartment() + " Manager No: "
				+ getManagerId() + " Date of Joining: " + getDateOfJoining() + " Salary: " + getSalary()
				+ " Commision: " + getCommision() + " Department No: " + getDeptNo();
	}
}