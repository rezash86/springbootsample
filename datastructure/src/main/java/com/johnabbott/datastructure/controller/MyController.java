package com.johnabbott.datastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johnabbott.datastructure.model.Student;
import com.johnabbott.datastructure.service.StudentService;

@RestController
public class MyController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/")
	public String home() {
		String result = "";
		for (Student st : service.getStudents()) {
			result += " name =" + st.getName() + " id = "  
					+ st.getId();
		}
		return result;
	}
	
	@RequestMapping("/help")
	public String help() {
		return "Java is awesome!";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(@RequestBody Student st) {
		service.addStudent(st);
		return "Java is awesome!";
	}
	
}