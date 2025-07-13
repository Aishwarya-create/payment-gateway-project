package com.aishwarya.payment_gateway.repository;

import com.aishwarya.payment_gateway.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {

     Merchant findByApiKey(String apiKey);
}
