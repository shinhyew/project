package com.example.joinup2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본 키 값이 자동으로 생성
    private int userId;

    @Column(nullable = false, length = 20) //NULL값 허용 안함, 최대 길이 20자
    private String name;

    @Column(nullable = false, length = 8)
    private String birth;

    @Column(nullable = false, length = 11, unique = true)
    private String phone;

    @Column(nullable = false, length = 20, unique = true)
    private String id;

    @Column(nullable = false)
    private String password;
}
