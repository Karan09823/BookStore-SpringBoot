package com.springboot.BookStore.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.BookStore.entity.BookEntity;
import com.springboot.BookStore.entity.MyBookListEntity;
import com.springboot.BookStore.repo.MyBookRepoInterface;

@Service
public class MyBookListService {

	@Autowired
	private MyBookRepoInterface mybookrepo;

	public void saveMyBook(MyBookListEntity mble) {
		mybookrepo.save(mble);
		return;

	}

	public void deleteMyBook(int mybookId) {
		mybookrepo.deleteById(mybookId);
		return;
	}

	public List<MyBookListEntity> getMyBookList() {

		List<MyBookListEntity> list = mybookrepo.findAll();
		return list;
	}
	
	

}
