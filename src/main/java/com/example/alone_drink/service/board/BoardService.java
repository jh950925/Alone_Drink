package com.example.alone_drink.service.board;

import com.example.alone_drink.repository.board.BoardRepository;
import com.example.alone_drink.vo.board.entity.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<BoardEntity> boardList() {
        List<BoardEntity> list = boardRepository.findAll();

        return list;
    }
}
