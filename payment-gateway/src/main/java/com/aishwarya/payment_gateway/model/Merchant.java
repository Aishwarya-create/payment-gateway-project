package com.aishwarya.payment_gateway.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Column(unique = true)
    private String apiKey;

    @Column(nullable = false)
    private String secretKey; // Used to generate/verify HMAC signatures

    @Column(nullable = false)
    private String merchantCallbackUrl;


}