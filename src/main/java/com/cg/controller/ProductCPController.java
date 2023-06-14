package com.cg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cp/products")
public class ProductCPController {

    @GetMapping
    public String showListPage() {
        return "/dashboard/product/list";
    }
}
