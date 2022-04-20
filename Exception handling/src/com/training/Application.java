package com.training;

import com.training.exception.RangeCheckException;
import java.util.*;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student ram = null;
try {
	ram = new Student(1010,"ramesh",98);
} catch (RangeCheckException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
	StudentService service = new StudentService(ram);
	System.out.println(service.printDetails());
	StudentService service2 = new StudentService(ram);
	try {
		System.out.println(service2.findRank());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.err.println("name is not passed");
	
	}
	ExceptionHandling exHandling = new ExceptionHandling();
	exHandling.usingArrayIndexException(args);
	exHandling.usingNumberFormatException("45");
	try {
		System.out.println(exHandling.underStandFinallyBlock());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try(Scanner scan = new Scanner(System.in)){
		System.out.println("enter the number");
		int num = scan.nextInt();
		System.out.println(num);
	}catch(Exception e) {
		e.printStackTrace();
}
	}

}
