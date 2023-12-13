package com.example.alone_drink.config.comnController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String mainView(){
        return "home";
    }
}
