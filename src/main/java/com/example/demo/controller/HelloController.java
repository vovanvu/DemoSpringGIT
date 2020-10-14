package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/sum")
    public String hello(@RequestParam(value = "n1", defaultValue = "0") int n1,
                        @RequestParam(value = "n2", defaultValue = "0") int n2) {
        System.out.println("hello from fea 2222");
        return String.format("Result wrong %s!", n1 - n2);
    }
}
