package com.aishwarya.payment_gateway.controllers;


import com.aishwarya.payment_gateway.dtos.OrderRequestDTO;
import com.aishwarya.payment_gateway.dtos.OrderResponseDTO;
import com.aishwarya.payment_gateway.model.Merchant;
import com.aishwarya.payment_gateway.model.Order;
import com.aishwarya.payment_gateway.services.MerchantService;
import com.aishwarya.payment_gateway.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private MerchantService merchantService;

    @PostMapping
    public OrderResponseDTO createOrder(@RequestHeader("X-API-KEY") String apiKey,@RequestBody OrderRequestDTO orderRequestDTO) {
        Merchant merchant = merchantService.validateApiKey(apiKey);

        Order order = orderService.createOrder(orderRequestDTO, merchant);

        return OrderResponseDTO.builder()
                .id(order.getId())
                .amount(order.getAmount())
                .currency(order.getCurrency())
                .orderStatus(order.getStatus().toString())
                .createdAt(order.getCreatedAt().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .merchantName(order.getMerchant().getName())
                .build();
    }

}
