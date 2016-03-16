package com.bookstore.rest;
//import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookstore.model.Book;
import com.bookstore.model.Publisher;
//import com.bookstore.model.TransactionBo;
import com.bookstore.service.BookService;


@Component
@Path("/bservice")
public class BookStoreService {
	   @Autowired
	   BookService  bookservice;
	
		@GET
		@Path("/save")
		public Response saveBook() {
			
            System.out.println("<--saveBook:start-->");
			Book book = new Book();
			book.setId(new Integer("3"));
			book.setName("java");
			book.setAuthor("Amit Verma");
			book.setType("Educational");
			List<Publisher> publishers = book.getPublishers();
			Publisher publisher =new Publisher();
			publisher.setId(new Integer("3"));
			publisher.setCountry("India");
			publisher.setName("XTC");
			publishers.add(publisher);
			/*publisher =new Publisher();
			
			publisher.setId(new Integer("4"));
			publisher.setCountry("India");
			publisher.setName("Durg");
			publishers.add(publisher);*/
			book.setPublishers(publishers);
            bookservice.save(book);
            System.out.println("<--saveBook:done-->");
			return Response.status(200).entity("True").build();
			

		}

	
}
