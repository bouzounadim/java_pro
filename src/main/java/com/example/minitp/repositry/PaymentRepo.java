package com.example.minitp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.minitp.model.Payment;

@Repository
public interface  PaymentRepo extends JpaRepository<Payment,Long >  {

}
