package com.aishwarya.payment_gateway.repository;

import com.aishwarya.payment_gateway.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Payment findByTransactionId(String transactionId);
}
