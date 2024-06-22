package com.greqit.start.service;

import com.greqit.start.model.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);
    List findAll();
}
