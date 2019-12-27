package com.example.minitp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.minitp.repositry.RoleRepo;

@Service
public class RoleService {
	@Autowired
	RoleRepo rolerepo;

}
