package com.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BlogAPIException extends RuntimeException{
    public BlogAPIException(String message) {
        super(message);
    }
}
