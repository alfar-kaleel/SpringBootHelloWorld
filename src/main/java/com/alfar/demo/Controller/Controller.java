package com.alfar.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {

	@RequestMapping("/welcome")
	public String greetings() {
		
		return "Welcome";
		
	}
	
	@RequestMapping("/students")
	public List<Students> getStudents() {
		
	return Students.getAllStudents();
		
	}
}
