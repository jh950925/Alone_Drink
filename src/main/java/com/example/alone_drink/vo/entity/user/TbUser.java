package com.example.alone_drink.vo.entity.user;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_USER")
@Getter
@Setter
public class TbUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "USER_NO")
  private long userNo;

  @Column(name = "REG_DT")
  private String regDt;

  @Column(name = "MOD_DT")
  private String modDt;


}
