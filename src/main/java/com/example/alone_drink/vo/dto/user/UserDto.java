package com.example.alone_drink.vo.dto.user;

import lombok.Data;

@Data
public class UserDto {

    private Long userNo;        // 사용자번호
    private String regDt;       // 등록일
    private String modDt;       // 수정일

}
