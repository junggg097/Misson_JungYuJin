package com.example.misson.service;

import com.example.misson.entity.Comment;
import com.example.misson.repo.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    // 댓글 저장
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    // 댓글 삭제
    public boolean deleteComment(Long commentId, String password) {
        Comment comment = commentRepository.findById(commentId).orElse(null);
        assert comment != null;
        if (Objects.equals(password, comment.getPassword())) {
            commentRepository.deleteById(commentId);
            return true;
        }
        return false;
    }
}
