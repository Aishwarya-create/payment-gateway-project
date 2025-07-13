package com.aishwarya.payment_gateway.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentResponseDTO {
    private String transactionId;
    private String status;
    private BigDecimal amount;
    private String paymentMethod;
    private String paymentDate;
}
