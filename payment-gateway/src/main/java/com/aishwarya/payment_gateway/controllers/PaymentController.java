package com.aishwarya.payment_gateway.controllers;


import com.aishwarya.payment_gateway.dtos.PaymentRequestDTO;
import com.aishwarya.payment_gateway.dtos.PaymentResponseDTO;
import com.aishwarya.payment_gateway.model.Payment;
import com.aishwarya.payment_gateway.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public PaymentResponseDTO processPayment(@RequestBody PaymentRequestDTO paymentRequestDTO) {
        Payment payment = paymentService.processPayment(paymentRequestDTO);

        return mapToResponseDTO(payment);

    }

    @GetMapping("/{id}")
    public PaymentResponseDTO getPaymentDetails(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);

        return mapToResponseDTO(payment);
    }

    private PaymentResponseDTO mapToResponseDTO(Payment payment) {
        return PaymentResponseDTO.builder()
                .transactionId(payment.getTransactionId())
                .status(payment.getStatus().toString())
                .amount(payment.getAmount())
                .paymentMethod(payment.getPaymentMethod().toString())
                .paymentDate(payment.getTimeStamp().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .build();
    }



}
