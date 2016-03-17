package com.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;
import com.bookstore.repository.PublisherRepository;


@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private PublisherRepository publisherRepository;

	
	public void save(Book book) {
		System.out.println("<-- save:start -->");
		try {
			publisherRepository.save(book.getPublishers());
			bookRepository.save(book);
			System.out.println("<-- save:end -->");
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}

	public void findAll() {
		System.out.println("<-- findAll:start -->");
		Iterable<Book> bookIterable = bookRepository.findAll();
		try {
			for (Book book : bookIterable) {
				System.out.println(book);
			}
			System.out.println("<-- findAll:end -->");
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}
	
	public void findbyName(String bookName) {
		System.out.println("<-- findbyName:start -->");
		
		try {
		
			Iterable<Book>  bookList =  bookRepository.searchByName(bookName);
			for (Book book : bookList) {
				System.out.println(book);
			}
			System.out.println("<-- findbyName:end -->");
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}
}