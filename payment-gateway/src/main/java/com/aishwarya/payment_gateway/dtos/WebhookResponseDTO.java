package com.aishwarya.payment_gateway.dtos;


import lombok.Data;

@Data
public class WebhookResponseDTO {

    private String message;
    private int statusCode;

}
