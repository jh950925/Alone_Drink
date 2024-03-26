package com.example.alone_drink.vo.dto.board;

import lombok.Data;

@Data
public class BoardCmtDto {

    private Long boardCommentNo;        // 게시글댓글번호
    private Long boardNo;               // 게시글번호
    private String boardCmtCont;        // 게시글댓글내용
    private String regId;               // 등록자아이디
    private String regDt;               // 등록일
    private String modId;               // 수정자아이디
    private String modDt;               // 수정일

}
