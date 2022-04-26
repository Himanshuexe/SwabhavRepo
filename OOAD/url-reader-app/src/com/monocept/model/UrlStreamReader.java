package com.monocept.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UrlStreamReader implements IDataReader {
	private String address;

	public UrlStreamReader(String address) {
		this.address = address;
	}

	@Override
	public Set<Employee> read() {

		Set<Employee> employees = new HashSet<Employee>();
		File dataCache= new File("resources\\data.txt");

		StringBuilder data = new StringBuilder();
		try {
			URL url = new URL(address);
			URLConnection urlConnection = url.openConnection();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				data.append(line);}
			
			employees=(HashSet<Employee>) Files.lines()
											   .map(empData->empData.split(","))
											   .map(empData->{return (new Employee(empData[0], empData[1], empData[2], empData[3], empData[4], empData[5], empData[6], empData[7]));})
											   .collect(Collectors.toSet());
			
		} catch (Exception e) {
		}
		return employees;
	}
}
