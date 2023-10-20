package com.example.alone_drink.vo.board.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id값이 null일 경우 자동
    @Column(name = "BOARD_ID")
    private Long boardId;

    @Column(name = "BOARD_TITLE")
    private String boardTitle;

    @Column(name = "BOARD_CONT")
    private String boardCont;

    @Column(name = "BOARD_WR_NM")
    private String boardWrNm;

    @Column(name = "BOARD_VIEW")
    private Long boardView;

    @Column(name = "BOARD_WR_ID")
    private String boardWrId;

    @Column(name = "BOARD_REG_DT")
    private String boardRegDt;

    @Column(name = "BOARD_MOD_DT")
    private String boardModDt;


    @Override
    public String toString() {
        return "BoardEntity{" +
                "boardId=" + boardId +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardCont='" + boardCont + '\'' +
                ", boardWrNm='" + boardWrNm + '\'' +
                ", boardView=" + boardView +
                ", boardWrId='" + boardWrId + '\'' +
                ", boardRegDt='" + boardRegDt + '\'' +
                ", boardModDt='" + boardModDt + '\'' +
                '}';
    }
}
