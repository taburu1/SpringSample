package com.sample.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @package : com.sample.springboot.web
* @name : HelloController.java
* @date : 2022-12-16 오후 2:29
* @auther : H2110258
* @version: 1.0.0
* @modified :
**/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
