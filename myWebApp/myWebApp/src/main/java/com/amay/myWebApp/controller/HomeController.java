package com.amay.myWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
         return "Welcome to Springboot";
    }

    @RequestMapping("/about")
    public String about(){
        return "We are the best organization";
    }
}
