package com.aishwarya.payment_gateway.dtos;


import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
}
