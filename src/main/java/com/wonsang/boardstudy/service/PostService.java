package com.wonsang.boardstudy.service;

import com.wonsang.boardstudy.data.entity.Post;
import com.wonsang.boardstudy.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

}
