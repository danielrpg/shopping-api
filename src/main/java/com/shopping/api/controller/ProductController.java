package com.shopping.api.controller;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.model.Product;
import com.shopping.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    Mono<Product> create(@RequestBody Mono<ProductDto> productDto) {
        return productService.create(productDto);
    }

    @GetMapping("/")
    Flux<Product> list() {
        return productService.list();
    }
}
