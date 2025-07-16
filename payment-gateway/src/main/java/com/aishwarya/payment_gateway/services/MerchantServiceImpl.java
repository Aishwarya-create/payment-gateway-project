package com.aishwarya.payment_gateway.services;

import com.aishwarya.payment_gateway.dtos.MerchantRequestDTO;
import com.aishwarya.payment_gateway.model.Merchant;
import com.aishwarya.payment_gateway.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class MerchantServiceImpl implements MerchantService{
    // Implement the methods from MerchantService interface here

    @Autowired
    private MerchantRepository merchantRepository;

    @Override
    public Merchant createMerchant(MerchantRequestDTO mdto) {
        // Logic to create a merchant
        String apiKey = UUID.randomUUID().toString();
        String secretKey = UUID.randomUUID().toString();

        Merchant merchant = Merchant.builder()
                .name(mdto.getName())
                .email(mdto.getEmail())
                .password(mdto.getPassword())
                .apiKey(apiKey)
                .secretKey(secretKey)
                .build();

        return merchantRepository.save(merchant);
    }

    @Override
    public Merchant getMerchantByApiKey(String apiKey) {
        // Logic to retrieve a mercgetMerchantByApiKeyhant by API key
        return merchantRepository.findByApiKey(apiKey)
                .orElseThrow(() -> new RuntimeException("Merchant not found with API key: " + apiKey));
    }

    @Override
    public Merchant validateApiKey(String apiKey) {
        return getMerchantByApiKey(apiKey); // For now, same as getByApiKey

    }
}
