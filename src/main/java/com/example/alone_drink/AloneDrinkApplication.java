package com.example.alone_drink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AloneDrinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(AloneDrinkApplication.class, args);
    }

}
