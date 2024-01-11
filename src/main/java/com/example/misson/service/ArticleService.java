package com.example.misson.service;

import com.example.misson.entity.Article;
import com.example.misson.repo.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> readAllArticleDesc() {
        return articleRepository.findAllByOrderByIdDesc();
    }

    public Article readArticle(Long id) {
        Optional<Article> optionalArticle = articleRepository.findById(id);
        return optionalArticle.orElse(null);
    }

    public Long saveArticle(Article article) {
        Article saved = articleRepository.save(article);
        return saved.getId();
    }

    public boolean updateArticle(
            Long id,
            String password,
            String writer,
            String title,
            String content
    ) {
        Article article = readArticle(id);
        if (article.getPassword().equals(password)) {
            article.setWriter(writer);
            article.setTitle(title);
            article.setContent(content);
            articleRepository.save(article);
            return true;
        }
        return false;
    }

    public boolean deleteArticle(Long id, String password) {
        Article article = readArticle(id);
        if (password.equals(article.getPassword())) {
            articleRepository.deleteById(id);
            return true;
        }
        return false;
    }







}
