package com.aishwarya.payment_gateway.dtos;

import lombok.Data;

@Data
public class WebhookEventDTO {

    private String eventType;       // PAYMENT_SUCCESS, PAYMENT_FAILED, etc.
    private String orderId;
    private String transactionId;
    private String paymentStatus;
    private String merchantCallbackUrl;

}
