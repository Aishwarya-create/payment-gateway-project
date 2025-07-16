package com.aishwarya.payment_gateway.dtos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class OrderResponseDTO {

    private Long id;
    private BigDecimal amount;
    private String currency;
    private String orderStatus;
    private String createdAt;
    private String merchantName;

}
