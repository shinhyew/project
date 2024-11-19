package com.example.joinup2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Contest")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contestId;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDateTime dDay;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int views;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
