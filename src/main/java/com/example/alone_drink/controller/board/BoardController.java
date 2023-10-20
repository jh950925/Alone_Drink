package com.example.alone_drink.controller.board;

import com.example.alone_drink.service.board.BoardService;
import com.example.alone_drink.vo.board.entity.BoardEntity;
import com.example.alone_drink.vo.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/board")
@Slf4j
@RequiredArgsConstructor
@Controller("/api/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public String list(Model model) {
        List<BoardEntity> list = boardService.boardList();

        for (BoardEntity entity : list) {
            log.info(entity.toString());
        }

        model.addAttribute("list", list);

        return "board/boardList";
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
