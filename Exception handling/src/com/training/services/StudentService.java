package com.training.services;

import com.training.model.Student;

public class StudentService {
private Student student;

public StudentService() {
	super();
	// TODO Auto-generated constructor stub
}

public StudentService(Student student) {
	super();
	this.student = student;
}
//applying handle rule of exception handling
public String printDetails() {
	String name= null;
	try {
	name = 	this.student.getFirstName();
	} catch (NullPointerException e) {
		System.err.println("student object is not passed check again");
		// TODO: handle exception
	}
	return name;
	
}
// apply declare rule
public String findRank() throws Exception{
	 String grade = "A";
	 if (this.student.getMarkScored()>90) {
		 grade ="O";
	 }
	 return grade;
}
}
