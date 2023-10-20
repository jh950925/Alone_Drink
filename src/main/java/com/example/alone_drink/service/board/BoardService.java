package com.example.alone_drink.service.board;

import com.example.alone_drink.repository.board.BoardRepository;
import com.example.alone_drink.vo.board.entity.BoardEntity;
import com.example.alone_drink.vo.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    // 전체 리트스 조회
    public List<BoardEntity> boardList() {
        List<BoardEntity> list = boardRepository.findAll();

        return list;
    }
    
    // 게시물 저장
    public BoardEntity boardSave(BoardVo vo) {

        LocalDate date = LocalDate.now();

        int id = 1;

        BoardEntity entity = new BoardEntity();
        entity.setBoardId((long) ++id);
        entity.setBoardTitle(vo.getBoardTitle());
        entity.setBoardCont(vo.getBoardCont());
        entity.setBoardWrId("test");
        entity.setBoardWrNm("test");
        entity.setBoardView(0L);
        entity.setBoardRegDt(date.toString());
        entity.setBoardModDt(date.toString());


        return boardRepository.save(entity);
    }
    // 게시물 수정
    
    // 게시물 삭제
}
