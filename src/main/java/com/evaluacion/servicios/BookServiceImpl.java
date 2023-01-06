package com.evaluacion.servicios;

import com.evaluacion.db.Book;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class BookServiceImpl implements BookService{
    @Override
    public void insert(Book book) {

    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Book findById(Integer id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
