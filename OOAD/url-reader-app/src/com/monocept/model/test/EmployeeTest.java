package com.monocept.model.test;

import com.monocept.model.*;

public class EmployeeTest {
	public static void main(String[] args) {
//		DataAnalyser analyser = new DataAnalyser(new URLReader("https://swabhav-tech.firebaseapp.com/emp.txt"));
		DataAnalyser analyser = new DataAnalyser(new UrlStreamReader("https://swabhav-tech.firebaseapp.com/emp.txt"));
		System.out.println("Details of CEO:\n" + analyser.findTheCEO() + "\n" + analyser.jobWiseCount());
	}

	public static void printDetails(Employee e) {
		System.out.println("Id: " + e.getId() + " Name: " + e.getEmpName() + " Department: " + e.getJobDepartment()
				+ " Manager No: " + e.getManagerId() + " Date of Joining: " + e.getDateOfJoining() + " Salary: "
				+ e.getSalary() + " Commision: " + e.getCommision() + " Department No: " + e.getDeptNo());
	}
}
