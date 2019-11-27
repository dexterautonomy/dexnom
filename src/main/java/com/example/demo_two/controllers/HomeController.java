package com.example.demo_two.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String getHomepage()
    {
        return "home";
    }
    
    @GetMapping("/home")
    public String getHomepage2()
    {
        return "home";
    }
}
