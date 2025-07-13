package com.aishwarya.payment_gateway.repository;

import com.aishwarya.payment_gateway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

     User findByEmail(String email);

}
