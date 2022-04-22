package com.monocept.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class CSVReader implements IDataReader {
	private String file;

	public CSVReader(String file) {
		this.file = file;
	}

	@Override
	public Set<Employee> read() {
		Set<Employee> employees = new HashSet<Employee>();
		StringBuilder data = new StringBuilder();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				data.append(line);
				String[] nextLine = line.split(",");
				String id = nextLine[0];
				String empName = nextLine[1];
				String jobDepartment = nextLine[2];
				String managerId = nextLine[3];
				String dateOfJoining = nextLine[4];
				String salary = nextLine[5];
				String commision = nextLine[6];
				String deptNo = nextLine[7];

				Employee employee = new Employee(id, empName, jobDepartment, managerId, dateOfJoining, salary,
						commision, deptNo);
				employees.add(employee);
			}
			bufferedReader.close();
		} catch (Exception e) {
		}
		return employees;
	}
}
