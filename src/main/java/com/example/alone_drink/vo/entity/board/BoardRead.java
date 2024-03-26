package com.example.alone_drink.vo.entity.board;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@Table(name = "TB_BOARD_READ")
@Comment("TB_게시글조회")
public class BoardRead {

    @Id
    @ManyToOne
    @JoinColumn(name = "BOARD_NO")
    private Board board;

    @Column(name = "BOARD_READ_DT", length = 8)
    @Comment("게시글조회일자")
    private String boardReadDt;

    @Column(name = "BOARD_READ_USER_ID", length = 30, nullable = false)
    @Comment("게시글조회유저아이디")
    private String boardReadUserId;

    @Column(name = "BOARD_READ_USER_NO")
    @Comment("게시글조회유저번호")
    private Long boardReadUserNo;


}