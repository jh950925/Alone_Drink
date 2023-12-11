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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@Table(name = "TB_USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("유저번호")
    @Column(name = "USER_NO")
    private Long userNo;

    @Comment("공통그룹코드")
    @Column(length =20 , nullable = false, name = "COMN_GRP_CD")
    private String comnGrpCd;

    @Comment("유저분류코드")
    @Column(length =1 ,nullable = false , name = "USER_TYPE_CD")
    private String userTypeCd;

    @Comment("생성일")
    @CreatedDate
    @Column(name = "REG_DT")
    private LocalDateTime regDt;

    @Comment("수정일")
    @LastModifiedDate
    @Column(name = "MOD_DT")
    private LocalDateTime modDt;

}
