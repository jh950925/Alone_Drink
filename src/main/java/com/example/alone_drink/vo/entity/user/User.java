package com.example.alone_drink.vo.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@Comment("TB_회원")
@Table(name = "TB_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_NO")
    @Comment("회원번호")
    private Long userNo;

    @Column(name = "REG_DT", nullable = false, length = 8)
    @Comment("등록일")
    private String regDt;

    @Column(name = "MOD_DT", nullable = false, length = 8)
    @Comment("수정일")
    private String modDt;

    // 1:1 관계 설정
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserInfo userInfo;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserSnsInfo userSnsInfo;

}
