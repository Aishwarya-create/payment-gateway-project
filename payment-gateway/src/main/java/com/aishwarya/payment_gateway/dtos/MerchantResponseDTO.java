package com.aishwarya.payment_gateway.dtos;

import lombok.Data;

@Data
public class MerchantResponseDTO {

    private String name;
    private String email;
    private String apiKey;
    private String secretKey;

}
