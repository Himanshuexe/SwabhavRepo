package com.monocept.streams.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileStreamTest {
	public static void main(String[] args) throws IOException {
//		caseStudy1();
		caseStudy2();
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

	public static void caseStudy2() throws IOException {
		Path path = Paths.get("C:\\Windows\\System32");
		List<File> files = Files.list(path)
								.map(file -> new File(file.toString()))
								.sorted((file1, file2) -> (int) (file2.length() - file1.length()))
								.limit(5)
								.collect(Collectors.toList());

		System.out.println("Top 5 files with max size:");

		for (File f : files) {
			System.out.println(f+" | Size: "+f.length());
		}
	}

	public static void printDetails(String line) {
		System.out.println(line.toUpperCase());
	}
}