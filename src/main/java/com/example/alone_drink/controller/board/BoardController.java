package com.example.alone_drink.controller.board;

import com.example.alone_drink.service.board.BoardService;
import com.example.alone_drink.vo.board.entity.BoardEntity;
import com.example.alone_drink.vo.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/board")
@Slf4j
@RequiredArgsConstructor
@RestController("/api/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public void list() {
        List<BoardEntity> list = boardService.boardList();

        for (BoardEntity entity : list) {
            log.info(entity.toString());
        }

    }
    @PostMapping("/create")
    public void create(BoardVo vo) {
        // 화면에서 model로 받아온 vo 셋팅 예시로
        vo.setBoardTitle("testTitle");
        vo.setBoardCont("testCont");
        log.info("/createPage");
        BoardEntity entity = boardService.boardSave(vo);

        log.info(entity.toString());

    }

    @PutMapping("/update")
    public void update() {

    }

    @DeleteMapping("/delete")
    public void delete() {

    }
    
}
