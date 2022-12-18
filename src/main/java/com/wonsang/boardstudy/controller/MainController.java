package com.wonsang.boardstudy.controller;

import com.wonsang.boardstudy.data.entity.Board;
import com.wonsang.boardstudy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final BoardService boardService;

    @GetMapping("/board")
    public ResponseEntity<List<Board>> getBoardList(){
        List<Board> boardList = new ArrayList<>();

        return new ResponseEntity<>(boardList, HttpStatus.ACCEPTED);
    }
}
