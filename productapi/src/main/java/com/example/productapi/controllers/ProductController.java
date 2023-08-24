package com.example.productapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.productapi.repositories.ProductRepository;

@RestController
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;

    
}
