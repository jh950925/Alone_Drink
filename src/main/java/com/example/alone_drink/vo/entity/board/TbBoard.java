package com.example.alone_drink.vo.entity.board;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "TB_BOARD")
@Getter
@Setter
public class TbBoard {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="BOARD_NO")
  private Long boardNo;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "CONTENT")
  private String content;

  @Column(name = "REG_USED_ID")
  private String regUserId;

  @Column(name = "REG_DT")
  private String regDt;

  @Column(name = "MOD_DT")
  private String modDt;

  @OneToMany(mappedBy = "board")
  private List<TbBoardCmt> comments;
}
