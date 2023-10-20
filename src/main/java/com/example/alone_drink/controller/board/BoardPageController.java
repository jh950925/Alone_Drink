package com.example.alone_drink.controller.board;

import com.example.alone_drink.service.board.BoardService;
import com.example.alone_drink.vo.board.entity.BoardEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/board")
@Slf4j
@RequiredArgsConstructor
@RestController
public class BoardPageController {

    private final BoardService boardService;

    @GetMapping("/list")
    public String list() {
        List<BoardEntity> list = boardService.boardList();


        for (BoardEntity entity : list) {
            log.info(entity.toString());
        }

        return "board/boardList";
    }
    
}
