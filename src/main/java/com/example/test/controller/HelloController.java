package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class HelloController {
//
//    @Autowired(required=true)
//    private HelloService HelloService;

    @RequestMapping("/")
    public String index(){
        return "hello world";
    }
}
