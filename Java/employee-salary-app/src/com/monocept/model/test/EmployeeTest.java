package com.monocept.model.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.monocept.model.*;

public class EmployeeTest {
	public static void main(String[] args) throws IOException {
		Employee e1 = new Manager(201, "Rohit", 30000);
		Employee e2 = new Developer(202, "Himanshu", 15000);
		Employee e3 = new Accountant(203, "Rahul", 12000);
		printSalarySlip(e1);
		printSalarySlip(e2);
		printSalarySlip(e3);
		generateSalarySlip(e2);
		generateSalarySlip(e3);
	}

	public static void printSalarySlip(Employee e) {
		System.out.println("Id: " + e.getENo());
		System.out.println("Name: " + e.getEName());
		System.out.println("Position:" + e.getPosition());
		System.out.println(e.salaryBreakup());
		System.out.println("Annual CTC: " + e.calcAnnaulCTC());
	}

	public static void generateSalarySlip(Employee e) throws IOException {
		File file = new File("data\\" + e.getENo() + "_" + e.getEName() + ".html");
		FileWriter f = new FileWriter(file);
		f.write("<html>\r\n" + "<head><title>Employee Salary Slip</title></head>\r\n" + "<body>\r\n" + "Employee Name: "
				+ e.getEName() + "\n" + "Employee Number: " + e.getENo() + "\n" + "Designation: " + e.getPosition()
				+ "\n" + "Salary: " + e.salaryBreakup() + "\n" + "Gross Salary: " + e.calcAnnaulCTC() + "</body>\r\n"
				+ "</html>");
		f.close();
	}
}
