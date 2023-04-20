package com.example.springstudyforwsk2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Configuration
@RequestMapping("/auth")
public class Controller {
    @GetMapping("/login")
    @PreAuthorize("hasAnyRole()")
    public String login(){
        return "login";
    }
    @GetMapping("/success")
    public String success(Authentication authentication){
        String name = authentication.getName();
        System.out.println(name);
        return "success";
    }
    @GetMapping("/error")
    public String fail(){
        return "error";
    }
}
