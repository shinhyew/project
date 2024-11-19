package com.example.joinup2.service;

import com.example.joinup2.entity.User;
import com.example.joinup2.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService
{
    private final UserRepository userRepository;// db와 통신하는 역할

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public User getUserById(String id) //사용자의 id를 기준으로 db에서 user 객체 검색
    {
        return userRepository.findByCustomId(id);
    }

    public User saveUser(User user)  //새로운 사용자 정보를 데이터베이스에 저장 or 기존 사영자 정보 업데이트
    {
        return userRepository.save(user);
    }

}
