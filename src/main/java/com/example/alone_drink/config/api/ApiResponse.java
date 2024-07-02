package com.example.alone_drink.config.api;

import com.example.alone_drink.common.comnEnum.ErrorCode;
import lombok.Getter;

@Getter
public class ApiResponse<T> {
    private static final int SUCESS = 200;
    private final ApiHeader header;
    private ApiBody body;

    public ApiResponse(ApiHeader header, ApiBody body) {
        this.header = header;
        this.body = body;
    }

    public ApiResponse(ApiHeader header) {
        this.header = header;
    }

    public static <T> ApiResponse<T> sucess(T data) {
        return new ApiResponse<>(new ApiHeader(SUCESS, "SUCESS"), new ApiBody<>(data, null));
    }

    public static <T> ApiResponse<T> fail(ErrorCode errorCode) {
        return new ApiResponse<>(new ApiHeader(errorCode.getCode(), errorCode.name()), new ApiBody<>(null, errorCode.getMsg()));
    }
}
