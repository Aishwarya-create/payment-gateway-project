package com.aishwarya.payment_gateway.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentRequestDTO {
    private Long orderId;
    private BigDecimal amount;
    private String paymentMethod; // CARD, UPI, etc.
}
