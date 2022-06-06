package com.eeffrroo.Demo.Entity;

import javax.persistence.*;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    private String author;
    private String genre;

    protected Book() {}

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%d, name='%s', author='%s', genre='%s']",
            this.id, this.name, this.author, this.genre
        );
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
