package com.aishwarya.payment_gateway.services;

import com.aishwarya.payment_gateway.dtos.MerchantRequestDTO;
import com.aishwarya.payment_gateway.model.Merchant;

public interface MerchantService {

    Merchant createMerchant(MerchantRequestDTO mdto);
    Merchant getMerchantByApiKey(String apiKey);
    Merchant validateApiKey(String apiKey);

}
