package com.sample.springboot.web;

import com.sample.springboot.dto.HelloResponseDto;
import com.sample.springboot.service.PostsService;
import com.sample.springboot.web.dto.PostsResponseDto;
import com.sample.springboot.web.dto.PostsSaveRequestDto;
import com.sample.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
* @package : com.sample.springboot.web
* @name : PostsApiController.java
* @date : 2022-12-20 오후 5:09
* @auther : H2110258
* @version: 1.0.0
* @modified :
**/
@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
