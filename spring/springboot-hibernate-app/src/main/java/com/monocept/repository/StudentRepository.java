package com.monocept.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Student;

@Repository
public class StudentRepository {
	@PersistenceContext
	private EntityManager em;

	public StudentRepository() {
		System.out.println("Student Repository created");
	}

	public List<Student> get() {
		return em.createQuery("from Student").getResultList();
	}

	@Transactional
	public void addStudent(Student student) {
		em.persist(student);
	}

	@Transactional
	public void editStudent(String rollno, Student editstudent) {
		int rollVal = Integer.parseInt(rollno);
		Student student = em.find(Student.class, rollVal);
		student.setFirstName(editstudent.getFirstName());
		student.setLastName(editstudent.getLastName());
		student.setCgpa(editstudent.getCgpa());
		em.merge(student);
	}

	@Transactional
	public void deleteStudent(String rollno) {
		int rollVal = Integer.parseInt(rollno);
		Student student = em.find(Student.class, rollVal);
		if (em.contains(student)) {
			em.remove(student);
		} else {
			em.remove(em.merge(student));
		}
	}
}
