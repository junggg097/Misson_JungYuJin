package com.example.misson.repo;

import com.example.misson.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository
        extends JpaRepository<Article, Long> {
    List<Article> findAllByOrderByIdDesc();


}
