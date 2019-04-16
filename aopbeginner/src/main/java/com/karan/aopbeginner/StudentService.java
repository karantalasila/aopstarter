package com.karan.aopbeginner;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public Student addStudent(String name,String studentId) {
		
		Student std=new Student();
		std.setName(name);
		std.setStudentId(studentId);
		
		return std;
	}
	
	public void removeStudent(String StudentId) {
		
		System.out.println("Entered removeStudent() in StudentService class");
	}

}
