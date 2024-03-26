package com.example.alone_drink.vo.dto.user;

import lombok.Data;

@Data
public class UserInfoDto {

    private String userId;          // 사용자아아디
    private String userPass;        // 사용자비밀번호
    private String userNm;          // 사용자이름
    private String userEmail;       // 사용자이메일
    private String userYmd;         // 사용자생년월일
    private String userAge;         // 사용자나이
    private String userSexCd;       // 사용자성별코드
    private String userAdr;         // 사용자주소
    private String userCd;          // 사용자코드
    private String regDt;           // 등록일
    private String modDt;           // 수정일

}
