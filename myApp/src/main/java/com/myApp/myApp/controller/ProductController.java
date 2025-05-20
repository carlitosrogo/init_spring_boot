package com.myApp.myApp.controller;

import com.myApp.myApp.model.Product;
import com.myApp.myApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService prodService;

    @RequestMapping("/")
    public String greet(){
        return "Welcome to this project...";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return prodService.getAllProducts();
    }
}
