package com.shopping.api.service;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Mono<Product> create(Mono<ProductDto> productDto);
    Mono<Product> retrieve(Integer productId);
    Mono<Product> update(Integer productId, Mono<ProductDto> productDto);
    Mono<Void> delete(Integer userId);
    Flux<Product> list();
}
