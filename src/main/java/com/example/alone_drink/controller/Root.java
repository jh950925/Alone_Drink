package com.example.alone_drink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Root {

    @RequestMapping("/th")
    public String th(Model model){

        String str = "test";

        model.addAttribute("test" , str);

        return "index";
    }
}
