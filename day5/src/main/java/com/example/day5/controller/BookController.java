package com.example.day5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day5.entity.BookEntity;
import com.example.day5.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	
	@PostMapping("/")
	public BookEntity adddetails(@RequestBody BookEntity entity) {
		return bookService.savedetails(entity);
	}
	
	@GetMapping("/")
	public List<BookEntity> showdetails(@RequestBody List<BookEntity> entity){
		return bookService.showdetails(entity);
	}
	
	@GetMapping("/{id}")
	public Optional<BookEntity> showdetailbyid(@PathVariable int id){
		return bookService.showdetailsbyid(id);
	}
	
	@PutMapping("/{id}")
	public String updatebyid(@PathVariable int id,@RequestBody BookEntity entity) {
		bookService.updatebyid(id, entity);
		return "Updated";
	}
	
	@DeleteMapping("/{id}")
	public String deletebyid(@PathVariable int id) {
		bookService.deletebyid(id);
		return "Deleted";
	}
}
