package com.example.alone_drink.vo.entity.board;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_BOARD_READ")
@Getter
@Setter
public class TbBoardRead {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "BOARD_NO")
  private Long boardNo;

  @Column(name = "READ_USER_ID")
  private Long readUserId;

  @Column(name = "READ_DT")
  private String readDt;

  @Column(name = "READ_YMD")
  private String readYmd;
}
