package com.example.alone_drink.vo.user.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TB_USER_INFO")
public class UserInfoEntity {

    @Id
    @Comment("유저아이디")
    @Column(length = 20, nullable = false, name = "USER_ID")
    private String userId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_NO")
    private UserEntity userEntity;

    @Comment("유저패스워드")
    @Column(length = 20, nullable = false, name = "USER_PASS")
    private String userPass;

    @Comment("유저닉네임")
    @Column(length =30 , name = "USER_NICKNM")
    private String userNicknm;

    @Comment("유저이메일")
    @Column(length =100 , name = "USER_EMAIL")
    private String userEmail;

    @Comment("유저이름")
    @Column(length =20 , name = "USER_NAME")
    private String userName;

    @Comment("유저전화번호")
    @Column(length =16 , name = "USER_PHONE_NO")
    private String userPhoneNo;

    @Comment("유저나이")
    @Column(length =3 , name = "USER_AGE")
    private String userAge;

    @Comment("공통그룹코드")
    @Column(length =20 ,nullable = false, name = "COMN_GRP_CD")
    private String comnGrpCd;

    @Comment("유저성별코드")
    @Column(length =1 ,nullable = false, name = "USER_SEX_CD")
    private String userSexCd;

    @Comment("생성일")
    @CreatedDate
    @Column(name = "REG_DT")
    private Date regDt;

    @Comment("수정일")
    @LastModifiedDate
    @Column(name = "MOD_DT")
    private Date modDt;

    @Builder
    private UserInfoEntity(
            String userId,
            String userPass,
            String userNicknm,
            String userEmail,
            String userName,
            String userPhoneNo,
            String userAge,
            String userSexCd) {
        this.userId = userId;
        this.userPass = userPass;
        this.userNicknm = userNicknm;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPhoneNo = userPhoneNo;
        this.userAge = userAge;
        this.userSexCd = userSexCd;
    }

}
