package com.karan.aopbeginner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping(value="/add/student",method=RequestMethod.GET)
	public Student addStudent(@RequestParam("name") String name,@RequestParam("studentId") String studentId) {
		
		return studentService.addStudent(name,studentId);
	}
	
	@RequestMapping(value="/remove/student",method=RequestMethod.GET)
	public String removeStudent(@RequestParam("studentId") String studentId) {
		
		 studentService.removeStudent( studentId);
		 
		 return "Student removed";
	}


}
