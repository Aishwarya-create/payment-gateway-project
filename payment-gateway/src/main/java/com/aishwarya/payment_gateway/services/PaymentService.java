package com.aishwarya.payment_gateway.services;

import com.aishwarya.payment_gateway.dtos.PaymentRequestDTO;
import com.aishwarya.payment_gateway.model.Payment;

public interface PaymentService {

    Payment processPayment(PaymentRequestDTO paymentRequestDTO);
    Payment getPaymentById(Long paymentId);

}
