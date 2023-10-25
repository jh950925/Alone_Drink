package com.example.alone_drink.service.board;

import com.example.alone_drink.vo.board.entity.BoardEntity;
import com.example.alone_drink.vo.board.vo.BoardVo;

import java.util.List;

public interface BoardService {


    /**
     * 게시글 전체 리스트 불러오기
     * @return
     * @since 2023.10.25
     */
    public List<BoardEntity> boardList();
    
    /**
     * 게시글 저장
     * @return
     * @since 2023.10.25
     */
    public BoardEntity boardSave(BoardVo vo);

    /**
     * 게시글 수정
     * @return
     * @since 2023.10.25
     */
    public BoardEntity boardUpdate(BoardVo vo);

    /**
     * 게시글 삭제
     * @return
     * @since 2023.10.25
     */
    public int boardDelete(BoardVo vo);
}
