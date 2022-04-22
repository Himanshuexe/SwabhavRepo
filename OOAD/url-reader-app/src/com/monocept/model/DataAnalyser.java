package com.monocept.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DataAnalyser {
	private IDataReader reader;

	public DataAnalyser(IDataReader reader) {
		this.reader = reader;
	}

	Set<Employee> employees = new HashSet<Employee>();

	public Map<String, Integer> jobWiseCount() {
		HashMap<String, Integer> dataSet = new HashMap<>();
		employees = reader.read();
		for (Employee employee : employees) {
			if (dataSet.containsKey(employee.getJobDepartment())) {
				dataSet.put(employee.getJobDepartment(), dataSet.get(employee.getJobDepartment()) + 1);
			}
			if (!dataSet.containsKey(employee.getJobDepartment())) {
				dataSet.put(employee.getJobDepartment(), 1);
			}
		}
		return dataSet;
	}

	public Employee findTheCEO() {
		employees = reader.read();
		for (Employee employee : employees)
			if (employee.getManagerId().contains("NULL")) {
				return employee;
			}
		return null;
	}
}
