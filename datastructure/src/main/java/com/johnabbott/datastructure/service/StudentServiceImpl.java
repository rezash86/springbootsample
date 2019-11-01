package com.johnabbott.datastructure.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johnabbott.datastructure.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	public List<Student> getStudents() {
		List<Student> lstStudents= new ArrayList<Student>();
		lstStudents.add(new Student("TOTO", "1"));
		lstStudents.add(new Student("POPO", "2"));
		return lstStudents;
	}
	
	
	
	
	

	public void addStudent(Student st) {
		System.out.println("student is addedd");
	}

	
}
