package com.dummyrest.demo.service;

import java.util.List;

import com.dummyrest.demo.entity.Student;

public interface StudentService {
	List <Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(Long id);
	void updateStudent(Student student);
	void deleteStudent(Long id);
}
