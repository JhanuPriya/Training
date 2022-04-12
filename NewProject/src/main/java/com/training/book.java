package com.training;

public class book {
	private String  bookname;

	public book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public book(String bookname) {
		super();
		this.bookname = bookname;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "book [bookname=" + bookname + "]";
	}

}