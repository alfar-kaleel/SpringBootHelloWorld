package com.alfar.demo.Controller;

import java.util.ArrayList;
import java.util.List;

public class Students {
	
	private String Name;
	private int Marks;
	
	
	
	public Students(String Name,int Marks) {
		
		
		this.Name = Name;
		this.Marks = Marks;
		
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	
	
	public static List<Students> getAllStudents(){
		
		List<Students> students = new ArrayList<>();
		
		students.add(new Students("Alfar",63));
		students.add(new Students("Shahani",78));
		students.add(new Students("Israth",75));
		students.add(new Students("Sumijan",83));
		students.add(new Students("Amal",43));
		students.add(new Students("Amhar",60));
		
		return students;
		
		
	} 
	

}
