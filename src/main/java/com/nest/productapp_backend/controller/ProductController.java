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
    @PostMapping("/search")
    public String SearchPage()
    {
        return "welcome product searching page";
    }
    @PostMapping("/edit")
    public String EditPage()
    {
        return "welcome product editing page";
    }
    @GetMapping("/view")
    public String ViewPage()
    {
        return "welcome product viewing page";
    }
    @PostMapping("/delete")
    public String DeletePage()
    {
        return "welcome product deleting page";
    }
}
