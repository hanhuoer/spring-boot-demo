package com.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Welcome to Home!";
    }

    @RequestMapping("/home")
    public String anotherHome() {
        return "Welcome to Home!";
    }

    @RequestMapping("/filter")
    public String filter() {
        return "filter page.";
    }
}
