package com.example.alone_drink.vo.board.entity;

import com.example.alone_drink.vo.user.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "TB_BOARD_COMT")
public class BoardCommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("댓글번호")
    @Column(name = "BOARD_COMT_NO")
    private Long boardCommentNo;

    @Comment("뎃글내용")
    @Column(columnDefinition = "TEXT", name = "BOARD_COMT_CONT")
    private String boardCommentCont;

    @Comment("댓글유저번호")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_NO")
    private UserEntity userEntity;

    @Comment("생성일")
    @Column(name = "REG_DT")
    @CreatedDate
    private Date regDt;

    @Comment("수정일")
    @Column(name = "MOD_DT")
    @LastModifiedDate
    private Date modDt;

    @Comment("게시글번호")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_NO")
    private BoardEntity boardEntity;

}
