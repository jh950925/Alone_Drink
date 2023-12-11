package com.example.alone_drink.vo.user.vo;

import com.example.alone_drink.vo.user.entity.UserInfoEntity;
import lombok.Data;

@Data
public class UserVo {

    private String userId;				// 유저 아이디
    private String userPass;            // 유저 비밀 번호
    private String userNickNm;          // 유저 닉네임
    private String userEmail;           // 유저 이메일
    private String userName;            // 유저 이름
    private String userPhoneNo;         // 유저 전화 번호
    private String userAge;             // 유저 나이
    private String userSex;             // 유저 성별

    public UserInfoEntity toEntity(){
        return new UserInfoEntity(userId,userPass,userNickNm,userEmail,userName,userPhoneNo,userAge,userSex);
    }
}
