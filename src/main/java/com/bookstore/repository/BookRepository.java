package com.bookstore.repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.bookstore.model.Book;





public interface BookRepository extends CrudRepository<Book, Integer>{
	
	@Query("{'name' : ?0}")
	public Iterable<Book> searchByName(String bookName);
	
} 


