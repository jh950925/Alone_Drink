package com.example.alone_drink.vo.entity.board;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@Table(name = "TB_BOARD_FILE")
@Comment("TB_게시글파일")
public class BoardFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_FILE_NO")
    @Comment("게시글파일번호")
    private Long boardFileNo;

    @ManyToOne
    @JoinColumn(name = "BOARD_NO")
    private Board board;

    @Column(name = "BOARD_FILE_TITLE", length = 200)
    @Comment("게시글파일제목")
    private String boardFileTitle;

    @Column(name = "BOARD_FILE_PATH", length = 200)
    @Comment("게시글파일경로")
    private String boardFilePath;

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