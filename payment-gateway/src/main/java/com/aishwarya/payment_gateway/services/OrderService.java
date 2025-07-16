package com.aishwarya.payment_gateway.services;

import com.aishwarya.payment_gateway.dtos.OrderRequestDTO;
import com.aishwarya.payment_gateway.model.Merchant;
import com.aishwarya.payment_gateway.model.Order;

public interface OrderService {

    Order createOrder(OrderRequestDTO orderRequestDTO, Merchant merchant);
    Order getOrderById(Long orderId);
    void updateOrderStatus(Long orderId, String status);

}
