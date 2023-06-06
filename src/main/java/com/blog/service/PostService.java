package com.blog.service;

import com.blog.payload.PostDto;
import com.blog.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto dto);

    PostResponse getAllPosts(int pageNo,int pageSize,String sortBy,String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(long id, PostDto dto);

    void deletePost(long id);
}
