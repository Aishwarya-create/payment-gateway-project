package com.aishwarya.payment_gateway.controllers;


import com.aishwarya.payment_gateway.dtos.MerchantRequestDTO;
import com.aishwarya.payment_gateway.dtos.MerchantResponseDTO;
import com.aishwarya.payment_gateway.model.Merchant;
import com.aishwarya.payment_gateway.services.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/merchant")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @PostMapping("/create")
    public MerchantResponseDTO createMerchant(@RequestBody MerchantRequestDTO merchantRequestDTO) {
        // Assuming the Merchant object is populated from the request body
        Merchant createdMerchant = merchantService.createMerchant(merchantRequestDTO);

        return MerchantResponseDTO.builder()
                .id(createdMerchant.getId())
                .name(createdMerchant.getName())
                .email(createdMerchant.getEmail())
                .apiKey(createdMerchant.getApiKey())
                .build();
    }




}
