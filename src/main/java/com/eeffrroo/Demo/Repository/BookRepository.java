package com.eeffrroo.Demo.Repository;

import com.eeffrroo.Demo.Entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

    Book findById(long id);
}