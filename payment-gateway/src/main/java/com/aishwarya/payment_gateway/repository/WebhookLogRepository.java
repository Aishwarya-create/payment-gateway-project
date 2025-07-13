package com.aishwarya.payment_gateway.repository;

import com.aishwarya.payment_gateway.model.WebhookLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebhookLogRepository extends JpaRepository<WebhookLog, Long> {
    // Additional query methods can be defined here if needed
}
