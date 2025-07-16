package com.aishwarya.payment_gateway.repository;

import com.aishwarya.payment_gateway.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {

     Optional<Merchant> findByApiKey(String apiKey);
}
