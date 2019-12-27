package com.example.minitp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.minitp.repositry.PaymentRepo;

@Service
public class PaymentService {
	@Autowired
	PaymentRepo payrepo;

}
