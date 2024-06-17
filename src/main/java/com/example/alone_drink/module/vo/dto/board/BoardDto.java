package com.example.alone_drink.module.vo.dto.board;

import lombok.Data;

@Data
public class BoardDto {

    private Long boardNo;           // 게시글번호
    private String boardTitle;      // 게시글제목
    private String boardCont;       // 게시글내용
    private String regId;               // 등록자아이디
    private String regDt;               // 등록일
    private String modId;               // 수정자아이디
    private String modDt;               // 수정일

}
