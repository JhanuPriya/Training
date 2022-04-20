package com.training.services;

public class ExceptionHandling {
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("method requires three value to be passes[]a,b,c");
			e.printStackTrace();
		}
	}
public void usingNumberFormatException(String value) {
	int age = 0;
	try {
		age = Integer.parseInt(value);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(age);
}
public String underStandFinallyBlock()  {
	int denominator=0;
	try {
		System.out.println(4/denominator);
	} catch (ArithmeticException e) {
		System.err.println("denominator shoulod not be zero");
		return "welcome";
// throw new Exception();
		// TODO: handle exception
	}
	finally {
		System.out.println("inside finally===");
	}
	System.out.println("bye,bye");
	return "thanks";
}
}
