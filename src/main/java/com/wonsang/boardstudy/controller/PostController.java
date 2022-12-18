package com.wonsang.boardstudy.controller;

import com.wonsang.boardstudy.service.CommentService;
import com.wonsang.boardstudy.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    private final CommentService commentService;

}
