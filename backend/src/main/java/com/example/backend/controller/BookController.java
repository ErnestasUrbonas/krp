package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Book;
import com.example.backend.repository.BookRepository;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	
	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	
	
}
