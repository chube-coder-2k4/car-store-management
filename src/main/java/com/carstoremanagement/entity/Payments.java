package com.carstoremanagement.entity;

import com.carstoremanagement.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payments extends AbstractEntity<Long> implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Order_Id", nullable = false)
    private Orders orderId;
    @Column(name = "Payment_Method", nullable = false)
    private String paymentMethod;
    @Column(name = "Payment_Status", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Column(name = "Amount", nullable = false)
    private double amount;
    private String transactionId;
    private LocalDateTime paymentDate;
}
