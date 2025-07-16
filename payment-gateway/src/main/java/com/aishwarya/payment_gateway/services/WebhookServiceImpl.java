package com.aishwarya.payment_gateway.services;

import com.aishwarya.payment_gateway.model.Payment;
import com.aishwarya.payment_gateway.model.WebhookLog;
import com.aishwarya.payment_gateway.model.WebhookStatus;
import com.aishwarya.payment_gateway.repository.WebhookLogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class WebhookServiceImpl implements WebhookService{

    @Autowired
    private WebhookLogRepository webhookLogRepository;

    @Override
    public void sendWebhookNotification(Payment payment) {
        // Logic to log the webhook
        WebhookLog webhookLog = WebhookLog.builder()
                .payment(payment)
                .payload("{ \"paymentId\": \"" + payment.getId() + "\", \"status\": \"SUCCESS\" }")
                .status(WebhookStatus.SENT)
                .merchantCallbackUrl(payment.getOrder().getMerchant().getMerchantCallbackUrl())
                .timestamp(LocalDateTime.now())
                .retryCount(0)
                .responseCode(200)
                .responseBody("OK")
                .build();

        webhookLogRepository.save(webhookLog);
    }

    @Override
    public void retryWebhookNotification() {
        // TODO: implement retry logic if needed
    }




}
