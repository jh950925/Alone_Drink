package com.example.alone_drink.module.vo.entity.board;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;


@Entity
@Getter
@Setter
@Table(name = "TB_BOARD_CMT")
@Comment("TB_게시글댓글")
public class BoardCmt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_CMT_NO")
    @Comment("게시글댓글번호")
    private Long boardCommentNo;

    @ManyToOne
    @JoinColumn(name = "BOARD_NO")
    private Board board;

    @Column(name = "BOARD_CMT_CONT", columnDefinition = "TEXT")
    @Comment("게시글댓글내용")
    private String boardCommentContent;

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
    @Comment("수정일")
    private String modDt;

}