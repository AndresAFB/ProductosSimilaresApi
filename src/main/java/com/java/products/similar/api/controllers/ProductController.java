package com.java.products.similar.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.products.similar.api.Product;

@RestController
@RequestMapping("/product")
class ProductController {
    @GetMapping("/{productId}/similar")
    public List<Product> getSimilarProducts(@PathVariable String productId) {
        
        List<Product> similarProducts = new ArrayList<>();
        similarProducts.add(new Product("1", "Producto 1", 19.99, true));
        similarProducts.add(new Product("2", "Producto 2", 29.99, false));
        return similarProducts;
    }
}
