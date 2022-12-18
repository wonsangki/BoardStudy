package com.wonsang.boardstudy.controller;

import com.wonsang.boardstudy.data.entity.Post;
import com.wonsang.boardstudy.service.BoardService;
import com.wonsang.boardstudy.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 */
@RestController("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    private final PostService postService;

    @GetMapping("/")
    public ResponseEntity<List<Post>> getPostsInBoard(){
        List<Post> postList = new ArrayList<>();
        
        
        return new ResponseEntity<>(postList, HttpStatus.ACCEPTED);
    }


}
