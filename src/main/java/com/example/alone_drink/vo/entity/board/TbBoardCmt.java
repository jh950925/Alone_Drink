package com.example.alone_drink.vo.entity.board;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_BOARD_CMT")
@Getter
@Setter
public class TbBoardCmt {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="COMMENT_NO")
  private Long commentNo;

  @ManyToOne
  @JoinColumn(name = "BOARD_NO", referencedColumnName = "BOARD_NO")
  private TbBoard board;

  @Column(name = "COMMENT_TEXT")
  private String commentText;

  @Column(name = "COMMENT_ID")
  private String commentId;

  @Column(name = "REG_DT")
  private String regDt;

  @Column(name = "MOD_DT")
  private String modDt;
}