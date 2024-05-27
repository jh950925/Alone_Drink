package com.example.alone_drink.common.http;

import lombok.Data;

@Data public class ApiResponseVo {

    private int statusCode;
    private String message;
    private Object data;

}
