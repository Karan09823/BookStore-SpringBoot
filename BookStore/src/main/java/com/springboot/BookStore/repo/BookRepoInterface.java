package com.springboot.BookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.BookStore.entity.BookEntity;

@Repository
public interface BookRepoInterface extends JpaRepository<BookEntity, Integer>
{

}
