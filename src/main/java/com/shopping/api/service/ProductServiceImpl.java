package com.shopping.api.service;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.model.Product;
import com.shopping.api.repository.ProductRepository;
import com.shopping.api.utils.ProductUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Mono<Product> create(Mono<ProductDto> productDto) {
        return productDto.map(ProductUtils::toProduct).flatMap(productRepository::save);
    }

    @Override
    public Mono<Product> retrieve(Integer productId) {
        return null;
    }

    @Override
    public Mono<Product> update(Integer productId, Mono<ProductDto> productDto) {
        return null;
    }

    @Override
    public Mono<Void> delete(Integer userId) {
        return null;
    }

    @Override
    public Flux<Product> list() {
        return productRepository.findAll();
    }
}
