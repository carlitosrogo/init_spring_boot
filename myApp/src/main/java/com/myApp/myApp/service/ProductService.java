package com.myApp.myApp.service;

import com.myApp.myApp.model.Product;
import com.myApp.myApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository prodRepository;

    public List<Product> getAllProducts(){
        return prodRepository.findAll();
    }
}
