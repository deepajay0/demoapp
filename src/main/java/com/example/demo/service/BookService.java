package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public Book addBook(Book book){
        Book savedBook = bookRepo.save(book);
        return savedBook;
    }

    public Book getBookById(Long id){
        Book book = bookRepo.findById(id).orElse(null);
        return book;
    }
}
