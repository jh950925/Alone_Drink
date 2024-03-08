package com.example.alone_drink.vo.entity.common;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_COMN_CD")
@Getter
@Setter
public class TbComnCd {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "GRP_CD")
  private String grpCd;

  @Column(name = "GRP_CD_NM")
  private String grpCdNm;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "REG_DT")
  private String regDt;

  @Column(name = "REG_ID")
  private String regId;

  @Column(name = "MOD_DT")
  private String modDt;

  @Column(name = "MOD_ID")
  private String modId;
}
