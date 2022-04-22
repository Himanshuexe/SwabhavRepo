package com.monocept.streams.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileStreamTest {
	public static void main(String[] args) throws IOException {
		caseStudy1();
	}

	public static void caseStudy1() throws IOException {
		Path filePath = FileSystems.getDefault().getPath("resources", "name.txt");
		Files.lines(filePath).forEach(FileStreamTest::printDetails);
		
		Pattern regex = Pattern.compile("a-z");
		Matcher matcher = regex.matcher(" ");

		List<String> withoutDuplicates = Files.lines(filePath).distinct().filter(n -> {
			Matcher m = Pattern.compile("[a-zA-Z0-9]").matcher(n);
			return m.find();
		}).collect(Collectors.toList());
		System.out.println("After removing duplicates-->");
		withoutDuplicates.forEach(name-> System.out.println(name));
	}

	public static void printDetails(String line) {
		System.out.println(line.toUpperCase());
	}
}