package com.example.restapicalls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello  " + name + "!";
    }

    @RequestMapping(value = {"/twoquery"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "fname") String fname, @RequestParam(value = "lname") String lname) {
        return "Hello  " + fname + "  " + lname + "!";
    }
}