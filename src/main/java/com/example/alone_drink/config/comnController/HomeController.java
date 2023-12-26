package com.example.alone_drink.config.comnController;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String mainView(HttpServletRequest request) {
        return "login";
    }
}
