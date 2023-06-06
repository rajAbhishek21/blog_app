package com.blog.payload;

import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {
    private Long id;
    @NotEmpty
    @Size(min = 2,message = "Title should have atleast 2 characters")
    private String title;
    @NotEmpty
    @Size(min = 5,message = "Description should have atleast 5 character")
    private String description;
    @NotEmpty
    private  String content;
}
