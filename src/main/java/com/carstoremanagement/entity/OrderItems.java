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
public class OrderItems extends AbstractEntity<Long> implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( nullable = false)
    private Orders orderId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( nullable = false)
    private Products productId;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private double unitPrice;
    @Column(nullable = false)
    private double totalPrice;
}
