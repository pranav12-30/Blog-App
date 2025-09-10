package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private long id;

    @NotEmpty(message = "Name must not be empty")
    private String name;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String body;
}
