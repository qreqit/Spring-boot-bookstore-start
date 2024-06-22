package com.greqit.start.repository;

import com.greqit.start.model.Book;

import java.util.List;

public interface BookRepository {
    Book save(Book book);
    List<Book> findAll();
}
