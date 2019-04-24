package com.code.actuator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public Object index() {
        return "index";
    }

    @RequestMapping("home")
    public String home() {
        return "home";
    }
}
