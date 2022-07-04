package com.sparta.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping
    public String sayHello(){
        return "Hello!!";
    }
}
