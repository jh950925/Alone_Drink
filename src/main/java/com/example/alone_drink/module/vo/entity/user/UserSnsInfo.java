package com.example.alone_drink.module.vo.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "TB_SNS_USER_INFO")
@Comment("TB_SNS회원정보")
public class UserSnsInfo {

    @Id
    @Column(name = "USER_ID", length = 20, nullable = false)
    @Comment("회원아이디")
    private String userId;

    @Column(name = "USER_NO")
    @Comment("회원번호")
    private int userNo;

    @Column(name = "USER_PASS", length = 30, nullable = false)
    @Comment("회원비밀번호")
    private String userPass;

    @Column(name = "USER_NM", length = 8, nullable = false)
    @Comment("회원이름")
    private String userNm;

    @Column(name = "USER_EMAIL", length = 100)
    @Comment("회원이메일")
    private String userEmail;

    @Column(name = "USER_YMD", length = 8)
    @Comment("회원생년월일")
    private String userYmd;

    @Column(name = "USER_AGE", length = 3)
    @Comment("회원나이")
    private String userAge;

    @Column(name = "USER_SEX_CD", length = 1)
    @Comment("회원성별코드")
    private String userSexCd;

    @Column(name = "USER_ADR", length = 255)
    @Comment("회원주소")
    private String userAdr;

    @Column(name = "USER_CD", length = 1, nullable = false)
    @Comment("회원코드")
    private String userCd;

    @CreatedDate
    @Column(name = "REG_DT")
    @Comment("등록일")
    private LocalDateTime regDt;

    @LastModifiedDate
    @Column(name = "MOD_DT")
    @Comment("수정일")
    private LocalDateTime modDt;
}
