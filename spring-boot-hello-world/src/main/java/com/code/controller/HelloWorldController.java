package com.code.controller;

import com.code.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }

}
