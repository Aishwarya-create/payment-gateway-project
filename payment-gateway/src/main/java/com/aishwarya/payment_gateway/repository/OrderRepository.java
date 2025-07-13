package com.aishwarya.payment_gateway.repository;

import com.aishwarya.payment_gateway.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

     Order findByOrderId(Long orderId);
}
