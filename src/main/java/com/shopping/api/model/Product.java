package com.shopping.api.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
@Table("products")
public class Product {
    @Id
    private Integer id;

    @Column("title")
    private String title;

    @Column("description")
    private String description;

    @Column("price")
    private Double price;

    @Column("rating")
    private Double rating;

    @Column("stock")
    private Integer stock;

    @Column("quantity")
    private Integer quantity;

    @Column("brand")
    private String brand;

    @Column("category")
    private String category;

    @Column("thumbnail")
    private String thumbnail;
}
