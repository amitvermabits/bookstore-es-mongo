package com.bookstore.model;

//import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "books")
public class Book {

	@Id
	private Integer id;
	private String name;
	private String author;
	private String type;
	@DBRef(db="publisher")
	private List<Publisher> publishers = new ArrayList<Publisher>();
	

	public List<Publisher> getPublishers() {
		return publishers;
	}


	public void setPublishers(List<Publisher> publishers) {
		this.publishers = publishers;
	}


	public Book()
	{}
	
	
	@PersistenceConstructor
	public Book(Integer id, String name, String author,String type)
	{
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.type=type;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		
		return "[name:" + name + ",id :" + id + ",type:" + type + ",publishers:" + publishers + "]";
	}

	

	
}