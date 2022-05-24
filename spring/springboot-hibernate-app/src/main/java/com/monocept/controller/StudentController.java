package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@PostMapping(path = "/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		System.out.println(student);
		studentService.addStudent(student);
		return ResponseEntity.ok(student);
	}

	@PutMapping(path = "/edit/{rollno}")
	public ResponseEntity<Student> editStudent(@PathVariable String rollno, @RequestBody Student student) {
		System.out.println(student);
		studentService.editStudents(rollno, student);
		return ResponseEntity.ok(student);
	}

	@DeleteMapping(path = "/{rollno}")
	public ResponseEntity deleteStudent(@PathVariable String rollno) {
		studentService.deleteStudent(rollno);
		return ResponseEntity.ok(rollno);
	}

}
