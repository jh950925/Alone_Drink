package com.example.alone_drink.repository.board;

import com.example.alone_drink.vo.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
