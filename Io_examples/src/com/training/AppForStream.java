package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookServices;

public class AppForStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookServices service = new BookServices();
		
		File file = new File("book.ser");
		
		int ch = 2;
		
		if(ch == 1) {
Book book = new Book(8847,"oracle","Harish",560);

boolean result = service.writeToStream(file,book);

if(result) {
	
	System.out.println(" one record Serialized");
}}else {
	
	Book fromFile=(Book) service.readFromStream(file);
	System.out.println(fromFile.getBookName());
	
	System.out.println(fromFile);
}
	}

	}

