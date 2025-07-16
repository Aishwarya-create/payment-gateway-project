package com.aishwarya.payment_gateway.services;

import com.aishwarya.payment_gateway.dtos.PaymentRequestDTO;
import com.aishwarya.payment_gateway.model.*;
import com.aishwarya.payment_gateway.repository.OrderRepository;
import com.aishwarya.payment_gateway.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderService orderService;

    @Autowired
    private WebhookService webhookService;

    @Override
    public Payment processPayment(PaymentRequestDTO dto) {
        // Logic to process the payment
        // Retrieve the order by ID

        Order order = orderService.getOrderById(dto.getOrderId());
        // Create a new payment object
        Payment payment = Payment.builder()
                .amount(dto.getAmount())
                .paymentMethod(PaymentMethod.valueOf(dto.getPaymentMethod().toUpperCase()))
                .status(PaymentStatus.SUCCESS)
                .transactionId("TXN-" + UUID.randomUUID().toString().substring(0, 8))
                .timeStamp(LocalDateTime.now())
                .order(order)
                .build();

        orderService.updateOrderStatus(order.getId(), OrderStatus.PAID.toString());
        // Save the payment to the database
        Payment savedPayment = paymentRepository.save(payment);

        webhookService.sendWebhookNotification(savedPayment);

        return savedPayment;


    }

    @Override
    public Payment getPaymentById(Long paymentId){
        // Logic to retrieve a payment by ID
        return paymentRepository.findById(paymentId)
                .orElseThrow(() -> new RuntimeException("Payment not found with ID: " + paymentId));
    }


}
