package com.springboot.BookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.BookStore.entity.MyBookListEntity;

@Repository
public interface MyBookRepoInterface extends JpaRepository<MyBookListEntity, Integer> {

}
