package com.shopping.api.utils;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.model.Product;

public class ProductUtils {
    public static Product toProduct(ProductDto productDto) {
        return Product.builder()
                .price(productDto.getPrice())
                .brand(productDto.getBrand())
                .stock(productDto.getStock())
                .title(productDto.getTitle())
                .category(productDto.getCategory())
                .description(productDto.getDescription())
                .quantity(productDto.getQuantity())
                .rating(productDto.getRating())
                .thumbnail(productDto.getThumbnail())
                .build();
    }
}
