package com.aishwarya.payment_gateway.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WebhookLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String payload;

    @Enumerated(EnumType.STRING)
    private WebhookStatus status;

    private String merchantCallbackUrl;

    private LocalDateTime timestamp;

    private int retryCount;


    @ManyToOne
    private Payment payment;
}
