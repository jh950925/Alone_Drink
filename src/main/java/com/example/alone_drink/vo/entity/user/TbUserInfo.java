package com.example.alone_drink.vo.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_USER_INFO")
@Getter
@Setter
public class TbUserInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long userNo;

  @Column(name = "USER_ID")
  private String userId;

  @Column(name = "USER_PW")
  private String userPw;

  @Column(name = "USER_NAME")
  private String userName;

  @Column(name = "USER_EMAIL")
  private String userEmail;

  @Column(name = "USER_AGE")
  private String userAge;

  @Column(name = "USER_ADDRESS")
  private String userAddress;

  @Column(name = "REG_DT")
  private String regDt;

  @Column(name = "MOD_DT")
  private String modDt;

}
