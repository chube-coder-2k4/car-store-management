package com.carstoremanagement.entity;

import com.carstoremanagement.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Orders extends AbstractEntity<Long> implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id", nullable = false)
    private Users userId;
    @Column(name = "Order_Number", nullable = false, unique = true)
    private String orderNumber;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    @Column(name = "Customer_Name", nullable = false)
    private String customerName;
    @Column(name = "Customer_Email", nullable = false)
    private String customerEmail;
    @Column(name = "Customer_Phone", nullable = false)
    private String customerPhone;
    private String shippingAddress;
    @Column(name = "SubTotal", nullable = false)
    private double subTotal;
    private double shippingCost;
    @Column(name = "Total_Amount", nullable = false)
    private double totalAmount;
}
