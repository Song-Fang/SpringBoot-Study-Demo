package com.springboot.springbootquickstart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${person.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World Quick!";
    }


    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello" +name;
    }
}
