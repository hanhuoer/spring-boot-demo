package com.code.controller;

import com.code.config.CustomProperties;
import com.code.config.CustomYaml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomConfigController {

    @Autowired
    CustomProperties customProperties;

    @Autowired
    CustomYaml customYaml;

    @RequestMapping("/")
    public String home() {
        return "home.";
    }

    @RequestMapping("/properties")
    public CustomProperties customProperties() {
        return customProperties;
    }

    @RequestMapping("/yaml")
    public CustomYaml customYaml() {
        return customYaml;
    }
}
