package com.eeffrroo.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String main() {
        return "it's main page";
    }

    @GetMapping("/info")
    public String index() {
        return "it's info page";
    }
}
