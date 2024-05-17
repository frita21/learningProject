package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(path = "/books")
    public Iterable<Book> read() {
        return bookRepository.findAll();
    }

    @PostMapping(path = "/books")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping(path = "/books")
    public Book update(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping(path = "/books/{id}")
    public void delete(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
