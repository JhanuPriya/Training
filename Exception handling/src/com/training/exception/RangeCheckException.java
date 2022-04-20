package com.training.exception;

public class RangeCheckException extends Exception {
	private String message;

	public RangeCheckException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	this.message= message;
	
	
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.getMessage();
	}
	

}
