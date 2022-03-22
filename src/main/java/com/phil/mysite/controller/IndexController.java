package com.phil.mysite.controller;/*
@author Administrator
@description 
@create 2022-03-22-17:15
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "hello";
    }
}
