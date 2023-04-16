package com.myblog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 2, message =  "Post title should have 2 characters ")
    private String title;
    @NotEmpty
    @Size(min = 10, message = "Post description should at least 10 characters")
    private String description;
    @NotEmpty
    @Size(min = 10, message = "Post content should at least 10 characters")
    private String content;

}
