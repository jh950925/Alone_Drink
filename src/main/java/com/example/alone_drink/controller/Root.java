package com.example.alone_drink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Root {

    @RequestMapping("/")
    public String th(){
        return "index";
    }
}
