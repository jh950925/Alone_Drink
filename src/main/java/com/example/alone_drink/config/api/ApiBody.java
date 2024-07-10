package com.example.alone_drink.config.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApiBody<T> {
    private T data;
    private T msg;
}
