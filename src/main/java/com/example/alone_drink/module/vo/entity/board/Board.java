package com.example.alone_drink.module.vo.entity.board;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TB_BOARD")
@Comment("TB_게시글")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_NO")
    @Comment("게시글번호")
    private Long boardNo;

    @Column(name = "BOARD_TITLE", length = 200, nullable = false)
    @Comment("게시글제목")
    private String boardTitle;

    @Column(name = "BOARD_FILE_NO")
    @Comment("게시글파일번호")
    private Long boardFileNo;

    @Column(name = "BOARD_CONT", columnDefinition = "TEXT")
    @Comment("게시글내용")
    private String boardContent;

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

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<BoardCmt> boardCmts;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<BoardFile> boardFiles;

}