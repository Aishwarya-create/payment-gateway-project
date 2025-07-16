package com.aishwarya.payment_gateway.services;

import com.aishwarya.payment_gateway.model.Payment;

public interface WebhookService {

    void sendWebhookNotification(Payment payment);
    void retryWebhookNotification();
}
