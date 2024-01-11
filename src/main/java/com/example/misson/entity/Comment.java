package com.example.misson.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String writer;
    private String content;
    private String password;

    // 단일 게시글에 댓글이 여러 개 일 수 도 있으니 ManyToOne
    @ManyToOne
    private Article article;
}
