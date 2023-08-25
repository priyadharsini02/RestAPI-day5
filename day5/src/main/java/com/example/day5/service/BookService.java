package com.example.day5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day5.entity.BookEntity;
import com.example.day5.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	
	//post
public BookEntity savedetails(BookEntity entity) {
	return bookRepository.save(entity);
}

//get
public List<BookEntity> showdetails(List<BookEntity>entity){
	return (List<BookEntity>)bookRepository.findAll();
}
//get by id
public Optional<BookEntity> showdetailsbyid(int id){
	return bookRepository.findById(id);
}

//put
public BookEntity updatebyid(int id, BookEntity entity) {
	return bookRepository.saveAndFlush(entity);
}

//delete
public void deletebyid(int id) {
	bookRepository.deleteById(id);
}
}
