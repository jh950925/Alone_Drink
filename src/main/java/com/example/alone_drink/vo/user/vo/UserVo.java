package com.example.alone_drink.vo.user.vo;

import lombok.Data;

@Data
public class UserVo {

    private String userId;              // 사용자 ID
    private String userNm;              // 사용자 이름
    private String userAge;             // 사용자 나이
    private String userSexCd;           // 사용자 성별 코드
    private String userPhNum;           // 사용자 전화 번호
    private String userNknm;            // 사용자 닉네임
    private String regDt;               // 등록일
    private String modDt;               // 수정일

}
