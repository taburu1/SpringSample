package com.sample.springboot.web.dto;

import com.sample.springboot.domain.posts.Posts;
import lombok.Getter;

/**
 * packageName    : com.sample.springboot.web.dto
 * fileName       : PostsResponseDto
 * author         : H2110258
 * date           : 2022-12-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-20        H2110258       최초 생성
 */
@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
