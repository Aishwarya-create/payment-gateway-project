package com.aishwarya.payment_gateway.dtos;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderRequestDTO {

    private Long userId;
    private BigDecimal amount;
    private String currency;

}
