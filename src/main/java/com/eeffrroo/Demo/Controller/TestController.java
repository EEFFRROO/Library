package com.eeffrroo.Demo.Controller;

import com.eeffrroo.Demo.Repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/test")
public class TestController {

    private final BookRepository repository;

    public TestController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String test() {
        return "it's test page";
    }

    @GetMapping("/num")
    public Integer num() {
        Random random = new Random();
        return random.nextInt();
    }

    @GetMapping("/check")
    @ResponseBody
    public String checkRepository(@RequestParam(required = false) String bookName) {
        if (bookName == null) {
            bookName = "Golden fish";
        }
        return this.repository.findByName(bookName).toArray()[0].toString();
    }

    @ExceptionHandler(Throwable.class)
    public String exceptionHandler(Throwable exception) {
        return exception.getMessage();
    }
}
