package com.example.yunmusic.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class DefualtController {
    @GetMapping
    public String sayHello(){
        return "欢迎程序猿伊利的音乐盒";
    }
}
