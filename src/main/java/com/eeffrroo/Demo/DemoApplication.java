package com.eeffrroo.Demo;

import com.eeffrroo.Demo.Entity.Book;
import com.eeffrroo.Demo.Repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
//			repository.save(new Book("Golden fish", "Sam Will"));
//			repository.save(new Book("Another book"));
//			Book book = new Book("Bad story");
//			book.setGenre("Drama");
//			repository.save(book);
		};
	}
}