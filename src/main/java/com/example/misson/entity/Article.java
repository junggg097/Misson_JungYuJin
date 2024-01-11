package com.example.misson.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String password;

    // Board 에 여러 개의 게시글이 들어가야 하니까 ManyToOne
    @ManyToOne
    private Board board;

}
