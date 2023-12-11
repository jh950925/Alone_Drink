package com.example.alone_drink.vo.user.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@Table(name = "TB_USER_SNS_INFO")
public class UserSnsEntity {

    @Id
    @Comment("SNS유저아이디")
    @Column(length = 20, name = "SNS_USER_ID")
    private String snsUserId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_NO")
    private UserEntity userEntity;

    @Comment("SNS유저비밀번호")
    @Column(length = 20, nullable = false, name = "SNS_USER_PASS")
    private String snsUserPass;

    @Comment("SNS유저이름")
    @Column(length = 20, name = "SNS_USER_NAMAE")
    private String snsUserName;

    @Comment("SNS유저닉네임")
    @Column(length = 30, name = "SNS_USER_NICKNM")
    private String snsUserNickNm;

    @Comment("SNS유저나이")
    @Column(length = 3, name = "SNS_USER_AGE")
    private String snsUserAge;

    @Comment("SNS유저전화번호")
    @Column(length = 16, name = "SNS_USER_PHONE_NO")
    private String snsUserPhoneNo;

    @Comment("SNS유저이메일")
    @Column(length = 100, name = "SNS_USER_EMAIL")
    private String snsUserEmail;

    @Comment("공통그룹코드")
    @Column(length = 20, nullable = false, name = "COMN_GRP_CD")
    private String comnGrpCd;

    @Comment("SNS유저성별코드")
    @Column(length = 1, name = "SNS_USER_SEX_CD")
    private String snsUserSexCd;

    @Comment("생성일")
    @CreatedDate
    @Column(name = "REG_DT")
    private LocalDateTime regDt;

    @Comment("수정일")
    @LastModifiedDate
    @Column(name = "MOD_DT")
    private LocalDateTime modDt;

    @Builder
    private UserSnsEntity(
            String snsUserId,
            String userPass,
            String userNicknm,
            String userEmail,
            String userName,
            String userPhoneNo,
            String userAge,
            String userSexCd) {
        this.snsUserId = snsUserId;
        this.snsUserPass = userPass;
        this.snsUserNickNm = userNicknm;
        this.snsUserEmail = userEmail;
        this.snsUserName = userName;
        this.snsUserPhoneNo = userPhoneNo;
        this.snsUserAge = userAge;
        this.snsUserSexCd = userSexCd;
    }
}
