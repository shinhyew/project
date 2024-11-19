package com.example.joinup2.repository;

import com.example.joinup2.entity.User; //user 엔티티와 연결
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> // <매핑할 엔티티 클래스, 기본 키 데이터 타입>
{
    User findByCustomId(String Id); //기본제공하는 findById 메서드가 있어 이름 변경
}
