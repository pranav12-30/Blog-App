package com.springboot.blog.payload;

import com.springboot.blog.entity.Comment;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class PostDto {
    private Long id;

    @NotEmpty
    @Size(min = 2, message = "Post title must have atleast 2 characters.")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Description must have atleast 10 characters")
    private String description;

    @NotEmpty
    private String content;
    private List<Comment> comments;
}
