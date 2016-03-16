package com.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.bookstore.model.Book;
//import com.bookstore.repository.BookRepository;

@Service
public class BookService {
	
	//@Autowired
	//private BookRepository bookRepository;
	
	@Autowired
	private MongoTemplate mongoOperations;
	
	/* public Book findByName(String name) {
	        return bookRepository.findByName(name);
	    }*/
	 
	 public void save(Book book) {
		 System.out.println("<-- save:start -->");
		 try{
			// mongoOperations.save(book.getPublishers());
	         mongoOperations.save(book, "books");
	         System.out.println("<-- save:end -->");
		 }catch(Exception e){
			 e.getLocalizedMessage();
			 e.printStackTrace();
		 }
	         
	    }
}