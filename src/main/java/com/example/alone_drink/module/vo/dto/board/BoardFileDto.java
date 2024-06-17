package com.example.alone_drink.module.vo.dto.board;


import lombok.Data;

@Data
public class BoardFileDto {

    private Long boardFileNo;           // 게시글파일번호
    private Long boardNo;               // 게시글번호
    private String boardFileTitle;      // 게시글파일명
    private String boardFilePath;       // 게시글파일경로
    private String regId;               // 등록자아이디
    private String regDt;               // 등록일
    private String modId;               // 수정자아이디
    private String modDt;               // 수정일

}
