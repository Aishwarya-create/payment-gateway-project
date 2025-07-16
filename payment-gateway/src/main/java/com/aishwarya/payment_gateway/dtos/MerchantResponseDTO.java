package com.aishwarya.payment_gateway.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MerchantResponseDTO {

    private Long id;
    private String name;
    private String email;
    private String apiKey;
//    private String secretKey;

}
