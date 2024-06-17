package com.example.alone_drink.module.vo.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserInfoDto {

    @NotBlank(message = "아이디는 필수 값 입니다.")
    private String userId;          // 사용자아아디

    @NotBlank(message = "비밀번호는는 필수 값 입니다.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$", message = "비밀번호는 8~16자이며, 영문, 숫자, 특수문자를 포함해야 합니다.")
    private String userPass;        // 사용자비밀번호

    @NotBlank(message = "이름은 필수 값 입니다.")
    @Pattern(regexp = "^[a-zA-Z0-9]{1,10}$", message = "닉네임은 10자 이하이며 특수문자 및 공백을 포함할 수 없습니다.")
    private String userNm;          // 사용자이름

    @Email(message = "이메일 형식이 올바르지 않습니다.")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@(naver\\.com|daum\\.net)$", message = "이메일은 네이버 또는 다음 형식이어야 합니다.")

    private String userEmail;       // 사용자이메일

    private String userYmd;         // 사용자생년월일

    private String userAge;         // 사용자나이

    private String userSexCd;       // 사용자성별코드

    private String userAdr;         // 사용자주소

//    private String userCd;          // 사용자코드

    private String regDt;           // 등록일

    private String modDt;           // 수정일


}
