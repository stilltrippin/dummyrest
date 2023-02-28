package com.dummyrest.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dummyrest.demo.entity.Student;
import com.dummyrest.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private List<Student> students;
	
	private static Long counter = 6L;
	
	

	public StudentServiceImpl() {
		super();
		students = new ArrayList<>();
		students.add(new Student(1L,"John","Johnson","johnny@gmail.com"));
		students.add(new Student(2L,"Ryan","Peterson","Peterson@gmail.com"));
		students.add(new Student(3L,"Oliver","Jackson","jackson@gmail.com"));
		students.add(new Student(4L,"Mary","Smith","smith@gmail.com"));
		students.add(new Student(5L,"James","Jameson","jamesony@gmail.com"));
		
	}



	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return this.students;
	}



	@Override
	public void saveStudent(Student student) {
		student.setId(counter);
		counter++;
		students.add(student);		
	}



	@Override
	public Student getStudentById(Long id) {
		return students.stream().filter(x->x.getId()==id).findAny().get();
		
	}



	@Override
	public void updateStudent(Student student) {
		students.replaceAll(x-> x.getId()==student.getId()? student : x);
		
	}



	@Override
	public void deleteStudent(Long id) {
		students.removeIf(x->x.getId()==id);
		
	}

}
