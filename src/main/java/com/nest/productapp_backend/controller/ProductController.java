package com.nest.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/")
    public String HomePage()
    {
        return "welcome home page";
    }
    @PostMapping("/add")
    public String AddPage()
    {
        return "welcome product adding page";
    }
}
