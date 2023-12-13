package com.example.alone_drink.vo.user.vo;

import com.example.alone_drink.vo.user.entity.UserInfoEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "유저 VO")
public class UserVo {

    @Schema(description = "유저아이디")
    private String userId;				// 유저 아이디
    
    @Schema(description = "유저비밀번호")
    private String userPass;            // 유저 비밀 번호
    
    @Schema(description = "유저닉네임")
    private String userNickNm;          // 유저 닉네임
    
    @Schema(description = "유저이메일")
    private String userEmail;           // 유저 이메일
    
    @Schema(description = "유저이름")
    private String userName;            // 유저 이름
    
    @Schema(description = "유저전화번호")
    private String userPhoneNo;         // 유저 전화 번호

    @Schema(description = "유저생년월일")
    private String userYmd;

    @Schema(description = "유저나이")
    private String userAge;             // 유저 나이
    
    @Schema(description = "유저성별")
    private String userSex;             // 유저 성별

    public UserInfoEntity toEntity(){
        return new UserInfoEntity(userId,userPass,userNickNm,userEmail,userName,userPhoneNo,userYmd,userAge,userSex);
    }

}
