package com.eeffrroo.Demo.Controller;

import com.eeffrroo.Demo.Entity.Book;
import com.eeffrroo.Demo.Service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService service;

    public BookController(BookService bookService) {
        this.service = bookService;
    }

    @PostMapping("/")
    public String create(@RequestBody Book book) {
        this.service.createBook(book);
        return "Success";
    }

    @GetMapping("/")
    public ResponseEntity<List<Book>> get() {
        List<Book> result = this.service.getAllBooks();

        return !result.isEmpty()
                ? new ResponseEntity<>(result, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PatchMapping("/")
    public ResponseEntity<Book> edit(@RequestBody Book requestBook) {
        if (requestBook.getId() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Book result = this.service.editBook(requestBook);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ExceptionHandler(Throwable.class)
    public String exceptionHandler(Throwable exception) {
        return exception.getMessage();
    }
}
