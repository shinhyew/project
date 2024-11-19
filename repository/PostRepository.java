package com.example.joinup2.repository;

import com.example.joinup2.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    // 특정 사용자가 작성한 게시글 검색
    List<Post> findByUserUserId(Integer userId);

    // 제목에 특정 문자열이 포함된 게시글 검색
    List<Post> findByTitleContaining(String keyword);

    // 조회수가 특정 값 이상인 게시글 검색
    List<Post> findByViewsGreaterThanEqual(Integer views);

    // 특정 날짜 이후에 작성된 게시글 검색
    List<Post> findByCreatedAtAfter(LocalDateTime createdAt);
}
