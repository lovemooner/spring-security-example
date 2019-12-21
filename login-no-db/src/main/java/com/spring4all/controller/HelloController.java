package com.spring4all.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther lovemooner
 * @date 2019/12/20 10:26
 * @describe
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello jwt !";
    }

    @GetMapping("/admin")
    public String admin() {
        return "hello admin !";
    }
}