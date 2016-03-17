package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Integer>{

}
