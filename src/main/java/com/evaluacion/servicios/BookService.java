package com.evaluacion.servicios;

import com.evaluacion.db.Book;

import java.util.List;

public interface BookService {
    void insert(Book book);

    void update(Book book);

    void delete(Integer id);

    Book findById(Integer id);

    List<Book> findAll();
}
