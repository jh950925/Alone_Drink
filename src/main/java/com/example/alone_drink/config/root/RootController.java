package com.example.alone_drink.config.root;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class RootController {

    @GetMapping("")
    public String index() {
        log.info("root");
        return "index";
    }
}
