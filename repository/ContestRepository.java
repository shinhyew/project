package com.example.joinup2.repository;

import com.example.joinup2.entity.Contest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestRepository extends JpaRepository<Contest, Integer> {
    // 필요한 경우 추가 쿼리 메서드 작성 가능
}
