package com.example.alone_drink.config.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApiHeader {
    private int resultCode;
    private String codeName;
}
