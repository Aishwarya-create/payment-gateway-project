package com.aishwarya.payment_gateway.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/webhooks")
public class WebhookController {


    // Trigger webhook manually (for testing or retry)
    @PostMapping("/trigger/{paymentId}")
    public void triggerWebhookManually(@PathVariable Long paymentId) {
        // TODO: Fetch payment and call webhookService.sendWebhook(payment);
    }

    // Retry all failed webhooks (batch retry)
    @PostMapping("/retry-failed")
    public void retryFailedWebhooks() {
        // TODO: webhookService.retryFailedWebhooks();
    }

    // (Optional) Get all webhook logs
    @GetMapping("/logs")
    public void getAllWebhookLogs() {
        // TODO: Fetch from WebhookLogRepository
    }

    // (Optional) Get webhook logs for a payment
    @GetMapping("/logs/{paymentId}")
    public void getWebhookLogsForPayment(@PathVariable String paymentId) {
        // TODO: Fetch logs by payment
    }
}



