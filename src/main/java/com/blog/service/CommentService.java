package com.blog.service;

import com.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto dto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentById(long postId, long id);

    CommentDto updateComment(long postId, long id, CommentDto dto);

    void deleteComment(long postId, long id);
}
