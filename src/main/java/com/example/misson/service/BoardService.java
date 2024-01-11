package com.example.misson.service;

import com.example.misson.entity.Board;
import com.example.misson.repo.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;


    // 게시글 불러오기
    public Board readBoard(Long id) {
        Optional<Board> optionalBoard
                = boardRepository.findById(id);
        return optionalBoard.orElse(null);
    }

    public List<Board> readBoardAll() {
        return boardRepository.findAll();
    }

}
