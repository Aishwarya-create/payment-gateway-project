package com.aishwarya.payment_gateway.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderResponseDTO {

    private String orderId;
    private String status;
    private String createdAt;
    private BigDecimal amount;
    private String currency;

}
