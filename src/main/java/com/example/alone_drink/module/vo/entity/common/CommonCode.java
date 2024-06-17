package com.example.alone_drink.module.vo.entity.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@Table(name = "TB_COMN_CD")
@Comment("TB_공통코드")
public class CommonCode {
    @Id
    @Column(name = "GRP_CD", length = 20, nullable = false)
    @Comment("그룹코드")
    private String grpCd;

    @Column(name = "GRP_CD_NM", length = 20)
    @Comment("그룹코드명")
    private String grpCdNm;

    @Column(name = "CD", length = 1, nullable = false)
    @Comment("코드")
    private String cd;

    @Column(name = "CD_NM", length = 50)
    @Comment("코드명")
    private String cdNm;

    @Column(name = "GRP_CD_DESC", length = 255)
    @Comment("그룹코드설명")
    private String grpCdDesc;

    @Column(name = "GRP_CD_YN", length = 1)
    @Comment("그룹코드사용여부")
    private String grpCdYn;

    @Column(name = "REG_ID", length = 20, nullable = false)
    @Comment("등록자아이디")
    private String regId;

    @Column(name = "REG_DT", length = 8, nullable = false)
    @Comment("등록일")
    private String regDt;

    @Column(name = "MOD_ID", length = 20, nullable = false)
    @Comment("수정자아이디")
    private String modId;

    @Column(name = "MOD_DT", length = 8, nullable = false)
    @Comment("수저일")
    private String modDt;

}