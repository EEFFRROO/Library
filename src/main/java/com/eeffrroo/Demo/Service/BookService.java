package com.eeffrroo.Demo.Service;

import com.eeffrroo.Demo.Entity.Book;
import com.eeffrroo.Demo.Repository.BookRepository;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        Iterable<Book> books = repository.findAll();
        List<Book> list = new ArrayList<>();
        for (Book item : books) {
            list.add(item);
        }
        return list;
    }

    public Book editBook(Book requestBook) {
        Book book = repository.findById(requestBook.getId()).get();
        book.setName(requestBook.getName());
        book.setAuthor(requestBook.getAuthor());
        book.setGenre(requestBook.getGenre());
        this.repository.save(book);
        return book;
    }

    public void createBook(Book book) {
        this.repository.save(book);
    }
}
