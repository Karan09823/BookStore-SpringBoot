package com.springboot.BookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.BookStore.entity.BookEntity;
import com.springboot.BookStore.repo.BookRepoInterface;

@Service
public class BookService {

	@Autowired
	private BookRepoInterface brepo;

	public void saveBook(BookEntity be) {

		brepo.save(be);
		return;

	}
	
	public List<BookEntity> getAllBooks(){
		
		List<BookEntity> temp=brepo.findAll();
		return temp;
	}
	
	public BookEntity getBookById(int id) {
		BookEntity temp=brepo.findById(id).get();
		return temp;
	}
	
	public void deleteBookById(int id) {
		brepo.deleteById(id);
		return;
	}
	
	
}
