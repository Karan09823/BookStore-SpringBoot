package com.springboot.BookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.BookStore.entity.BookEntity;
import com.springboot.BookStore.entity.MyBookListEntity;
import com.springboot.BookStore.service.BookService;
import com.springboot.BookStore.service.MyBookListService;

@Controller
public class MyBookListController {


	
	@Autowired
	private MyBookListService mybks;
	
	@RequestMapping("/deleteMyBookList/{id}")
	public String deleteMyBookList(@PathVariable("id")int mybooklistId) {
		mybks.deleteMyBook(mybooklistId);
		 return "redirect:/my_books";
	}
	
	
	
	

}
