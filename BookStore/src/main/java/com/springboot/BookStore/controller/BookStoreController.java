package com.springboot.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.BookStore.entity.BookEntity;
import com.springboot.BookStore.entity.MyBookListEntity;
import com.springboot.BookStore.service.BookService;
import com.springboot.BookStore.service.MyBookListService;

@Controller
public class BookStoreController {
	
	@Autowired
	private BookService bs;
	
	@Autowired
	private MyBookListService mybkservice;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/register_book")
	public String RegisterBook() {
		return "BookRegister";
	}
	
	@GetMapping("/available_books")
	public ModelAndView getAllBooks() {
		
		List<BookEntity> list=bs.getAllBooks();
		/*
		 * ModelAndView mview=new ModelAndView();
		 *  mview.setViewName("list");  ///this will resolve  to "list.html" in Thymeleaf
		 * mview.addObject("bookList", list); return mview; // adding a message attribute with value "list"(it is a collection in this case) and message variable="bookList"
		 */
		return new ModelAndView("availableBook","bookList",list);
	}
	
	@PostMapping("/saveBook")
	public String SaveBook(@ModelAttribute BookEntity book) {
		bs.saveBook(book);
		return "redirect:/available_books";
	}
	
	
	@GetMapping("/my_books")
	public String getMyBooks(Model model) {
		List<MyBookListEntity> list=mybkservice.getMyBookList();
		model.addAttribute("bookList", list);
		
		return "MyBook";
	}
	
	
	@RequestMapping("/editBook/{id}")
	public String editBookInfo(@PathVariable("id")int editId,Model model) {
		BookEntity ben=bs.getBookById(editId);
		model.addAttribute("BookIdMsg", editId);
		model.addAttribute("BookNameMsg", ben.getBookName());
		model.addAttribute("BookAuthorMsg", ben.getBookAuthor());
		model.addAttribute("BookPriceMsg", ben.getPrice());
		return "editBook";
	}
	
	@GetMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") int delId) {
		bs.deleteBookById(delId);
		return"redirect:/available_books";
		
	}
	
	@RequestMapping("/myBookList/{id}")
	public String AddToMyBook(@PathVariable("id") int MybkId,Model model) {
		
		BookEntity be=bs.getBookById(MybkId);
		
		MyBookListEntity mble=new MyBookListEntity(be.getBookId(),be.getBookName(),be.getBookAuthor(),be.getPrice());
		
		mybkservice.saveMyBook(mble);
		
		
		
		return "redirect:/my_books";
	}
	

	

}
