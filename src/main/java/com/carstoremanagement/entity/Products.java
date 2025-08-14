package com.carstoremanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Products extends AbstractEntity<Long> implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Category_Id", nullable = false)
    private Categories categoryId;
    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "Model", nullable = false)
    private String model;
    @Column(name = "Year_Manufacture", nullable = false)
    private int yearManufacture;
    @Column(name = "Color", nullable = false)
    private String color;
    @Column(name = "Price", nullable = false)
    private double price;
    @Column(name = "Stock_Quantity", nullable = false)
    private int stockQuantity;
    @Column(name = "Description")
    private String description;
    @Column(name = "Image_URL")
    private String imageUrl;
    @Column(name = "Is_Active", nullable = false)
    private boolean isActive;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", nullable = false)
    private Users createdBy;

}
