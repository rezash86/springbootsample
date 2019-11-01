package com.johnabbott.datastructure.service;

import java.util.List;

import com.johnabbott.datastructure.model.Student;


public interface StudentService {
	public List<Student> getStudents();
	
	public void addStudent(Student st);
}
