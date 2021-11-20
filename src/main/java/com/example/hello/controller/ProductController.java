package com.example.hello.controller;

import com.example.hello.model.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("name1", "decs1", 3, true));
        products.add(new Product("name2", "decs2", 0, false));
        products.add(new Product("name3", "decs3", 2, true));
        return products;
    }


}