package com.evaluacion.rest;

import com.evaluacion.db.Book;
import com.evaluacion.servicios.BookService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@ApplicationScoped
@Path("/books")
public class BookRest {

    @Inject
    private BookService bookService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book findById(@PathParam("id") Integer id) {
        return bookService.findById(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void insertBook(Book book) {
        bookService.insert(book);
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Book book) {
        bookService.update(book);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(Integer id) {
        bookService.delete(id);
    }
}
