package com.aishwarya.payment_gateway.services;

import com.aishwarya.payment_gateway.dtos.OrderRequestDTO;
import com.aishwarya.payment_gateway.model.Merchant;
import com.aishwarya.payment_gateway.model.Order;
import com.aishwarya.payment_gateway.model.OrderStatus;
import com.aishwarya.payment_gateway.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.UUID;

public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository; //


    @Override
    public Order createOrder(OrderRequestDTO orderRequestDTO, Merchant merchant) {
        // Implementation for creating an order
       Order order = Order.builder()
               .amount(orderRequestDTO.getAmount())
               .currency(orderRequestDTO.getCurrency())
               .status(OrderStatus.CREATED)
               .createdAt(LocalDateTime.now())
               .merchant(merchant)
               .build();
        // Save the order to the database
        return orderRepository.save(order);


    }

    @Override
    public Order getOrderById(Long orderId) {
        // Implementation for retrieving an order by ID
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found with ID: " + orderId));
    }

    @Override
    public void updateOrderStatus(Long orderId, String status) {
        // Implementation for updating the status of an order
       Order order = getOrderById(orderId);
       order.setStatus(OrderStatus.valueOf(status.toUpperCase()));
       orderRepository.save(order);
    }
}
