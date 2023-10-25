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
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    /**
     * 게시물 리스트 불러오기
     * @return boardRepository.findAll();
     */
    @Override
    public List<BoardEntity> boardList() {

        return boardRepository.findAll();
    }

    /**
     * 게시물 저장
     * @param vo
     * @return BoardEntity
     */
    @Override
    public BoardEntity boardSave(BoardVo vo) {
        LocalDate date = LocalDate.now();



        BoardEntity entity = new BoardEntity();
//        entity.setBoardId((long) ++id);
        entity.setBoardTitle(vo.getBoardTitle());
        entity.setBoardCont(vo.getBoardCont());
        entity.setBoardWrId("test");
        entity.setBoardWrNm("test");
        entity.setBoardView(0L);
        entity.setBoardRegDt(date.toString());
        entity.setBoardModDt(date.toString());


        return boardRepository.save(entity);
    }

    /**
     * 게시물 수정
     * @param vo
     * @return BoardEntity
     */
    @Override
    public BoardEntity boardUpdate(BoardVo vo) {
        BoardEntity entity = new BoardEntity();



        return boardRepository.save(entity);
    }

    /**
     * 게시물 삭제
     * @param vo
     * @return int
     */
    @Override
    public int boardDelete(BoardVo vo) {
        return 0;
    }
}
