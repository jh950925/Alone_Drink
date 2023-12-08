package com.example.alone_drink.vo.board.entity;

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
@Table(name = "TB_BOATD_FILE")
public class BoardFileEntity {

    @Id
    @Comment("파일번호")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FILE_NO")
    private Long fileNo;

    @Comment("게시글번호")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_NO")
    private BoardEntity boardEntity;

    @Comment("파일명")
    @Column(length = 200,nullable = false, name = "FILE_NAME")
    private String fileName;

    @Comment("생성일")
    @CreatedDate
    @Column(name = "REG_DT")
    private Date regDt;

    @Comment("수정일")
    @LastModifiedDate
    @Column(name = "MOD_DT")
    private Date modDt;

}
