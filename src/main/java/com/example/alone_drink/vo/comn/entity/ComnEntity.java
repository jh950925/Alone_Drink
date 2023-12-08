package com.example.alone_drink.vo.comn.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "TB_COMN_CD")
public class ComnEntity {

    @Id
    @Comment("공통그룹코드")
    @Column(length = 20,nullable = false, name = "COMN_GRP_CD")
    private String comnGrpCd;
    
    @Id
    @Comment("공통코드")
    @Column(length = 1, nullable = false, name = "COMN_CD")
    private String comnCd;

    @Comment("공통코드명")
    @Column(length = 20, nullable = false,name = "COMN_NM")
    private String comnNm;

}
