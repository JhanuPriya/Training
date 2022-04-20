package com.training;
import java.io.File;

import com.training.model.Book;
import com.training.model.Book.*;
import com.training.services.BookServices;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Book java = new Book(101," java","rak",780);
 
 BookServices service = new BookServices();
 
 boolean result = service.writeToFile(new File("Book.txt"),java);
 
if(result) {
	 System.out.println("one record  added to the file");
 }
 service.readFromFile(new File("Book.txt")).forEach(System.out::println);
	}

}
