package com.springboot.BookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int BookId;
	private String BookName;
	private String BookAuthor;
	private String price;
	
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookEntity(int bookId, String bookName, String bookAuthor, String price) {
		super();
		BookId = bookId;
		BookName = bookName;
		BookAuthor = bookAuthor;
		this.price = price;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	

}
