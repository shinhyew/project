package com.example.joinup2.controller;

import com.example.joinup2.entity.Post;
import com.example.joinup2.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // 게시글 생성
    @PostMapping("/")
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    // 특정 사용자가 작성한 게시글 조회
    @GetMapping("/user/{userId}")
    public List<Post> getPostsByUserId(@PathVariable Integer userId) {
        return postService.getPostsByUserId(userId);
    }

    // 제목 검색
    @GetMapping("/search")
    public List<Post> searchPostsByTitle(@RequestParam String keyword) {
        return postService.searchPostsByTitle(keyword);
    }
}
