package com.nest.productapp_backend.controller;

import com.nest.productapp_backend.dao.ProductDao;
import com.nest.productapp_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;
    @GetMapping("/")
    public String HomePage()
    {
        return "welcome home page";
    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String AddPage(@RequestBody Products p)
    {
        System.out.println(p.toString());
        System.out.println(p.getId());
        System.out.println(p.getProductcode());
        System.out.println(p.getName());
        System.out.println(p.getMfd());
        System.out.println(p.getExpiry());
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());
        System.out.println(p.getSellername());
        System.out.println(p.getDistributorname());
        dao.save(p);
        return "product added successfully";
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
