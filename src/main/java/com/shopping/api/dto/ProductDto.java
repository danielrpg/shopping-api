package com.shopping.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
    private int id;
    private String title;
    private String description;
    private Double price;
    private Double rating;
    private Integer stock;
    private Integer quantity;
    private String brand;
    private String category;
    private String thumbnail;
}
