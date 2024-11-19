package com.example.joinup2.controller;

import com.example.joinup2.entity.User;
import com.example.joinup2.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController // 이 클래스가 Rest API를 처리하는 컨트롤러임을 나타냄
@RequestMapping("/users") //모든 엔드포인트가 /users 경로로 시작함을 나타냄
public class UserController
{
    private UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id)
    {
        return userService.getUserById(id);
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
}
