package com.example.joinup2.service;

import com.example.joinup2.entity.Post;
import com.example.joinup2.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 게시글 생성
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    // 특정 사용자 작성한 게시글 조회
    public List<Post> getPostsByUserId(Integer userId) {
        return postRepository.findByUserUserId(userId);
    }

    // 제목에 특정 문자열이 포함된 게시글 검색
    public List<Post> searchPostsByTitle(String keyword) {
        return postRepository.findByTitleContaining(keyword);
    }
}
