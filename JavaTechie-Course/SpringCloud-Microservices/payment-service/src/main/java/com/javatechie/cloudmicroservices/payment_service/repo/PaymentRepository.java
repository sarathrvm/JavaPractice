package com.javatechie.cloudmicroservices.payment_service.repo;

import com.javatechie.cloudmicroservices.payment_service.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,String> {
}
