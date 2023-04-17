package com.example.springstudyforwsk2;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/auth")
public class Controller {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/success")
    public String success(){
        return "success";
    }
    @GetMapping("/error")
    public String fail(){
        return "error";
    }
}
