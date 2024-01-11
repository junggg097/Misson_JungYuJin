package com.example.misson.controller;


import com.example.misson.entity.Board;
import com.example.misson.service.ArticleService;
import com.example.misson.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
@RequestMapping("/boards")
public class BoardController {
    private final BoardService boardService;
    private final ArticleService articleService;

    // 게시판 목록
    @GetMapping("/")
    public String boardList(Model model) {
        model.addAttribute("boards", boardService.readBoardAll());
        return "board/board";
    }

    // 전체 게시판 View
    @GetMapping("/entire")
    public String entireView(
            Model model
    ) {
        model.addAttribute("articles", articleService.readAllArticleDesc());
        return "board/all-article";
    }

    @GetMapping("/entire/{articleId}")
    public String readArticleInEntire(
            @PathVariable("articleId") Long articleId,
            Model model
    ) {
        model.addAttribute("article", articleService.readArticle(articleId));
        return "board/all-article-view";
    }


    // 특정 게시판 View
    @GetMapping("/{boardId}")
    public String boardView(
            @PathVariable("boardId") Long boardId,
            Model model
    ) {
        Board board = boardService.readBoard(boardId);
        model.addAttribute("board", board);
        return "board/articles";
    }





}
