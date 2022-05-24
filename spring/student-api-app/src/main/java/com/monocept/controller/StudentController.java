package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

@RequestMapping("/api/v1/student")
@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	public StudentController() {
		System.out.println("Student Controller Created");
	}

	@GetMapping(path = "/all")
	public ResponseEntity<List<Student>> getAll() {
		return ResponseEntity.ok(studentService.getAll());
	}

	@GetMapping(path = "/single{studentId}")
	public ResponseEntity<Student> getSingle(@PathVariable("studentId") String studentId) {
		return ResponseEntity.ok(studentService.getSingle(Integer.valueOf(studentId)));
	}

	@PostMapping(path = "/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		System.out.println(student);
		studentService.addStudent(student);
		return ResponseEntity.ok(student);
	}
	
	
}
