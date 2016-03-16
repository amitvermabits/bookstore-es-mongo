package com.bookstore.repository;

import java.math.BigInteger;

import org.springframework.data.repository.Repository;

import com.bookstore.model.Book;




public interface BookRepository extends Repository<Book, BigInteger>{
	
	 public Book findByName(String name);
	
} 


