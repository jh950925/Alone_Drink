package com.example.alone_drink.common.comnEnum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    AUTHENTICATION_FAILED(400, "아이디 또는 비밀번호가 옳지 않습니다.") ,
    MEMBER_NOT_FOUND(404, "회원 정보가 없습니다.");

    private final int code;
    private final String msg;
}
