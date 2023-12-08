package com.example.alone_drink.vo.board.entity;

import com.example.alone_drink.vo.user.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "TB_BOARD")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("게시글번호")
    @Column(length = 8, name = "BOARD_NO")
    private Long boardNo;

    @Comment("게시글명")
    @Column(length = 100,nullable = false, name = "BOARD_TITLE")
    private String boardTitle;

    @Comment("게시글내용")
    @Column(columnDefinition = "TEXT", name ="BOARD_CONT")
    private String boardCont;

    @Comment("게시글등록유저번호")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_NO")
    private UserEntity userEntity;

    @Comment("게시글댓글수")
    @Column(name ="BOARD_COMT_CNT")
    private int boardComtCnt;

    @Comment("게시글조회수")
    @Column(name ="BOARD_VIEW_CNT")
    private int boardViewCnt;

    @Comment("첨부파일번호")
    @Column(length = 20, name = "BOARD_FILE_NO")
    private String boardFileNo;

    @Comment("등록일")
    @CreatedDate
    @Column(name = "REG_DT")
    private Date regDt;
    
    @Comment("수정일")
    @LastModifiedDate
    @Column(name = "MOD_DT")
    private Date modDt;


    @Builder
    public BoardEntity(
            String boardTitle,
            String boardCont,
            int boardComtCnt,
            int boardViewCnt,
            String boardFileNo
    ){
        this.boardTitle = boardTitle;
        this.boardCont = boardCont;
        this.boardComtCnt = boardComtCnt;
        this.boardViewCnt = boardViewCnt;
        this.boardFileNo = boardFileNo;
    }
}
